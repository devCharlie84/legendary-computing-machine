/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class ClasificadorBayes {
    int indice;
    ArrayList<String> palabra;
    double[] positivo;
    double[] negativo;
    
    public ClasificadorBayes() {
        indice = 0;
        palabra = new ArrayList<>();
        positivo = new double[30];
        negativo = new double[30];
    }
    
    public void ingresarPalabra(String palabr, int catego) {
        if(!palabra.contains(palabr)) {
            palabra.add(indice, palabr);
            if (catego == 0){
                positivo[indice]++;
            } else {
                negativo[indice]++;
            }
            indice++;
        } else {
            int dato = palabra.indexOf(palabr);
            if(catego == 0){
                positivo[dato]++;
            } else {
                negativo[dato]++;
            }
        }
    }
   
    public void ver_palabraCateCantidad() {
        for (int i = 0; i < indice; i++) {
            System.out.println("Palabra- " +palabra.get(i) + " Positivo " +positivo[i] + " Negativo " + negativo[i]);
        }
    }
    
    public double[] buscarPalabraCategoria (String palabr){
        //positivo,negativo
        double[]dato = {-1,-1};
        int indice = palabra.indexOf(palabr);
        if (indice>=0) {
            dato[0]= positivo[indice];
            dato[1]= negativo[indice];
        }
        return dato;
    }
}

class Palabras {
    ArrayList<String> palabrasL;
    ClasificadorBayes cpcate;
    double[] categoria; //0 para positivo, 1 para negativo
    int cantidadTextos;
    double[] proCategoria;
    
    public Palabras(){
        palabrasL = new ArrayList<>();
        cpcate = new ClasificadorBayes();
        categoria = new double[2];
        proCategoria = new double[2];
        categoria[0]=0.0;
        categoria[0]=0.0;
        cantidadTextos = 0;
    }
    
    public void ingresarPalabra(String palabra){
        palabrasL.add(palabra);
    }
    
    public ArrayList<String> separarPalabras (String texto, String catego){
        ArrayList<String> palabrasL_temp;
        String[] Apalabras=texto.split(" ");
        
        palabrasL_temp = new ArrayList<>();
        
        for (int i = 0; i < Apalabras.length; i++) {
            if (Apalabras[i].length()>2 && !palabrasL_temp.contains(Apalabras[i])) {
                palabrasL_temp.add(Apalabras[i]);
            }
            if (catego.toUpperCase().equals("POSITIVO")) {
                cpcate.ingresarPalabra(Apalabras[i], 0);
            }
            else if (catego.toUpperCase().equals("NEGATIVO")) {
                cpcate.ingresarPalabra(Apalabras[i], 1);   
            }
        }
        if (!catego.toUpperCase().equals("")) {
            cantidadTextos++;
        }
        if (catego.toUpperCase().equals("POSITIVO")) {
            categoria[0]++;
        }
        if (catego.toUpperCase().equals("NEGATIVO")) {
            categoria[1]++;
        }
        
        for (int k = 0; k < palabrasL_temp.size(); k++) {
            palabrasL.add(palabrasL_temp.get(k));
        }
        return palabrasL_temp;
    }
    
    public void verPalabras() {
        for (int i = 0; i < palabrasL.size(); i++) {
            System.out.println(palabrasL.get(i));
        }
    }
    
    public void verCategorias() {
        System.out.println("Positivo: "+categoria[0] + " Negativo: "+categoria[1]);
    }
    
    public int totalPalabras(){
        return palabrasL.size();
    }
    
    public int totalTextos() {
        return cantidadTextos;
    }
    
    public double getProCategoria (int pos) {
        return proCategoria[pos];
    }
    
    public void calProbabilidadCategorias () {
        System.out.println(categoria[0]+"---- "+categoria[1]);
        proCategoria[0] = categoria[0]/cantidadTextos; //Positivo
        proCategoria[1] = categoria[1]/cantidadTextos; //Negativo
        System.out.println(proCategoria[0]+"---- "+proCategoria[1]);
    }
    
    public void verPalabraCantidadCate() {
        cpcate.ver_palabraCateCantidad();
    }
    
    //clasificador
    public String clasificar (String texto) {
        double prob_categoria = 0;
        double prob_c = 0;
        double prob_b = 0;
        double prob_total_c = 0;
        double prob_p;
        double prob_cond = 1;
        int cateTexto = 0;
        ArrayList<String> palabraslocal = new ArrayList<>();
        
        for (int i = 0; i < categoria.length; i++) {
            //probabilidad de la categoria sobre textos
            prob_c = categoria[i] / cantidadTextos;
            //probabilidad categoria
            prob_total_c = prob_c;
            palabraslocal = separarPalabras(texto,"");
            double[] catp = {0,0};
            
            for (int k = 0; k < palabraslocal.size(); k++) {
                //cuantas veces aparece la palabra en cada categoria
                catp = cpcate.buscarPalabraCategoria(palabraslocal.get(k));
                if (catp[0]!=-1) {
                    //probabilidad del número de palabras en categoria/total palabras
                    prob_p = catp[i] / totalPalabras();
                    //probabilidad p (Categoria|palabra)
                    prob_cond = prob_p / prob_c;
                    //probabilidad p (palabra|Categoria)
                    prob_b = prob_cond*prob_p / prob_c;
                    
                    prob_total_c = prob_total_c*prob_b;
                }
            }
            if (prob_categoria<prob_total_c) {
                cateTexto = i;
                prob_categoria = prob_total_c;
            }
        }
        String clase = "";
        if (cateTexto == 0) {
            clase = "Positivo";
        } else {
            clase =  "Negativo";
        }
        return "categoria: "+clase;
    }
}

