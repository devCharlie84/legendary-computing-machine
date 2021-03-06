/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author carlo
 */

public class ArranqueFrio extends javax.swing.JFrame {
    
    public String ruta;
    
    DataSetMovies data = new DataSetMovies();
    public ArrayList<String> nombrePelicula = new ArrayList<>();
    
    public ArrayList<Double> listaSimilitud = new ArrayList<>();
    public ArrayList<Integer> listaRecomendacion = new ArrayList<>();
    
    public boolean flagRecomendar = false;

    
    /**
     * Creates new form ArranqueFrio
     * @param ruta
     */
    public ArranqueFrio(String ruta) {
        this.ruta = ruta;
        initComponents();
    }

    private ArranqueFrio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRecomendar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFrio = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRecomendar.setText("Recomendar");
        btnRecomendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomendarActionPerformed(evt);
            }
        });

        jLabel1.setText("Arranque en Frío");

        jScrollPane1.setViewportView(jListFrio);

        jButton1.setText("Nueva Recomendación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        borrar.setText("Borrar información");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Al basarse en Collaborative Filtering (Item-Based) va haber un punto en\ndonde se tenga tanta información que solo recomendara peliculas muy \nprecisas o en el peor de los casos no recomiende peliculas.\n\nSi el motor de recomendación no esta recomendando peliculas presione el botón de borrar información");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRecomendar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(334, 334, 334))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(borrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnRecomendar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecomendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomendarActionPerformed
        // TODO add your handling code here:
         if (flagRecomendar) {
            JOptionPane.showMessageDialog( null, "Para realizar una nueva recomendación ingrese la opción 'Nueva Recomendación'", "ADVERTENCIA",JOptionPane.INFORMATION_MESSAGE);
        } else {
        flagRecomendar = true;
        data.LeerArchivo(ruta);
        
        String path = "src/Tests/Datos.txt";
        File file = new File(path);
        String rutaCompleta = file.getAbsolutePath();

        File archivo = new File(rutaCompleta);
        BufferedWriter bw;
 
        if(archivo.exists()) {
            JOptionPane.showMessageDialog( null, "Búsquedas de recomendación de usuarios detectados aplicando COLLABORATIVE FILTERING (Item-Based)", "Aviso",JOptionPane.INFORMATION_MESSAGE);
            try {
                RecomendacionAlimentada(rutaCompleta);
            } catch (IOException ex) {
                Logger.getLogger(ArranqueFrio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog( null, "Actualmente NO hay búsquedas de recomendación por otros usuarios por lo que se recomendará con un ARRANQUE EN FRÍO", "Aviso",JOptionPane.INFORMATION_MESSAGE);
            RecomendacionDefault();
            DefaultListModel model = new DefaultListModel<>();
            for(String s : nombrePelicula){
            model.addElement(s);
            }
            DefaultListCellRenderer cellRenderer = (DefaultListCellRenderer)jListFrio.getCellRenderer();
            cellRenderer.setHorizontalAlignment(SwingConstants .CENTER);
            jListFrio.setModel(model);
        }
         }
    }//GEN-LAST:event_btnRecomendarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFrame menu = new JFrame();
            menu.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
        String ruta = "src/Tests/Datos.txt";
        File file = new File(ruta);
        String rutaCompleta = file.getAbsolutePath();
        file = new File(rutaCompleta);
        if (file.exists()) {
            file.delete();
            JOptionPane.showMessageDialog( null, "Información eliminada exitosamente", "Aviso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog( null, "Actualmente el motor de recomendación no tiene ninguna información", "Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_borrarActionPerformed

    public void RecomendacionDefault () {    
        //TOP 25-50 BEST IMDB SCORE
        ArrayList<Double> ratings = MaxSort(data.imdb_score);
       
        int randomN = (int) Math.floor(Math.random()*(50-25+1)+25);
         
        for (int i = 0; i <= randomN; i++) {
            for (int j = 0; j < ratings.size(); j++) {
                String tempo = data.movie_title.get(j);
                if (Objects.equals(data.imdb_score.get(j), ratings.get(i))&&(!nombrePelicula.contains(tempo))) {
                    nombrePelicula.add(tempo);
                    break;
                }
            }
        }
    }
    
    public void RecomendacionAlimentada (String ruta) throws FileNotFoundException, IOException {
        String director ="",actor ="", genero ="",color="",idioma="",pais="",año="";
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        archivo = new File (ruta);
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);

        // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null){
        if(linea.startsWith("(DIRECTOR)")){linea = linea.replace("(DIRECTOR)",""); director = linea +"," + director; }
        if(linea.startsWith("(ACTOR)")){linea = linea.replace("(ACTOR)",""); actor = linea +"," + actor; }
        if(linea.startsWith("(GENERO)")){linea = linea.replace("(GENERO)",""); genero = linea +"," + genero; }
        if(linea.startsWith("(COLOR)")){linea = linea.replace("(COLOR)",""); color = linea +"," + color; }
        if(linea.startsWith("(IDIOMA)")){linea = linea.replace("(IDIOMA)",""); idioma = linea +"," + idioma; }
        if(linea.startsWith("(PAIS)")){linea = linea.replace("(PAIS)",""); pais = linea +"," + pais; }
        if(linea.startsWith("(AÑO)")){linea = linea.replace("(AÑO)",""); año = linea +"," + año; }
        }
        Similitud(director,actor,genero,pais,año,idioma,color);
    }
    
    
    public static double Round(double valor, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valor;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
    
     public void Similitud (String Director, String Actor, String Genero, String Pais, String Año, String Idioma, String Color) {
        DataSetMovies data = new DataSetMovies();
        data.LeerArchivo(ruta);
        String tempo = "";

         if (Director.equals(",")) { Director = ""; }
         if (Actor.equals(",")) { Actor = ""; }
         if (Genero.equals(",")) { Genero = ""; }
         if (Pais.equals(",")) { Pais = ""; }
         if (Año.equals(",")) { Año = ""; }
         if (Color.equals(",")) { Color = ""; }
        
        Director = Director.replace(" ", "");
        Actor = Actor.replace(" ", "");
        Genero = Genero.replace(" ", "");
        Pais = Pais.replace(" ", "");
        Año = Año.replace(" ", "");
        Idioma = Idioma.replace(" ", "");
        Color = Color.replace(" ", "");
            
        double pesoDirector = 0.35;
        double pesoActor = 0.15;
        double pesoGenero = 0.40;
        double pesoPais = 0.20;
        double pesoAñoLanzamiento = 0.30;
        double pesoIdioma = 0.25;
        double pesoColor;
        
        String[] generosUsuario = Genero.split(",");
        String[] directorUsuario = Director.split(",");
        String[] actorUsuario = Actor.split(",");
        String[] paisUsuario = Pais.split(",");
        String[] añoUsuario = Año.split(",");
        String[] idiomaUsuario = Idioma.split(",");
        String[] colorUsuario = Color.split(",");
        
        List<String>listaDirector = new ArrayList<>();
        List<String>listaGenero = new ArrayList<>();
        List<String>listaActor = new ArrayList<>();
        List<String>listaPais = new ArrayList<>();
        List<String>listaAño = new ArrayList<>();
        List<String>listaIdioma = new ArrayList<>();
        List<String>listaColor = new ArrayList<>();
                 
        //DIRECTOR
             for(String d : directorUsuario){
                 listaDirector.add(d);
             }
        listaDirector = listaDirector.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < listaDirector.size(); i++) {
             LimpiarArray(listaDirector,directorUsuario);
             directorUsuario[i] = listaDirector.get(i);
         }
        //GENERO
             for(String g : generosUsuario){
                 listaGenero.add(g);
             }
        listaGenero = listaGenero.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < listaGenero.size(); i++) {
             LimpiarArray(listaGenero,generosUsuario);
             generosUsuario[i] = listaGenero.get(i);
         }
        //ACTOR
             for(String a : actorUsuario){
                 listaActor.add(a);
             }
        listaActor = listaActor.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < listaActor.size(); i++) {
             LimpiarArray(listaActor,actorUsuario);
             actorUsuario[i] = listaActor.get(i);
         }
        //PAIS
             for(String p : paisUsuario){
                 listaPais.add(p);
             }
        listaPais = listaPais.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < listaPais.size(); i++) {
             LimpiarArray(listaPais,paisUsuario);
             paisUsuario[i] = listaPais.get(i);
         }
        //AÑO
        for (String año : añoUsuario){
                if (año.equals("")) {
                    año="0";
                }
        }
             for(String añ : añoUsuario){
                 listaAño.add(añ);
             }
        listaAño = listaAño.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < listaAño.size(); i++) {
            LimpiarArray(listaAño,añoUsuario);
             añoUsuario[i] = listaAño.get(i);
         }
        //IDIOMA
             for(String id : idiomaUsuario){
                 listaIdioma.add(id);
             }
        listaIdioma = listaIdioma.stream().distinct().collect(Collectors.toList());  
        for (int i = 0; i < listaIdioma.size(); i++) {
            LimpiarArray(listaIdioma,idiomaUsuario);
             idiomaUsuario[i] = listaIdioma.get(i);
         }
        //COLOR
             for(String c : colorUsuario){
                 listaColor.add(c);
             }
        listaColor = listaColor.stream().distinct().collect(Collectors.toList());  
               for (int i = 0; i < listaColor.size(); i++) {
                   LimpiarArray(listaColor,colorUsuario);
             colorUsuario[i] = listaColor.get(i);
         }
       
        for (int i = 0; i < data.director_name.size(); i++) {
            double similitud = 0.0;
            
            //COLOR
            if (Director.isEmpty()&&Actor.isEmpty()&&Genero.isEmpty()&&Pais.isEmpty()&&Año.isEmpty()) {
                for(String color : colorUsuario){
                 if (color.equals("Color")) {
                    tempo = data.color.get(i).replace(" ", "");
                    if (tempo.equals(color)) {
                        pesoColor = 0.0;
                        similitud = similitud + pesoColor;
                    }
                 }
            }
            }
            for(String color : colorUsuario){ 
            if (color.equals("BlackandWhite")) {
                tempo = data.color.get(i).replace(" ", "");
                if (tempo.equals(color)) {
                    pesoColor = 1;
                    similitud = similitud + pesoColor;
                }
            }
            }
            
            //IDIOMA
            for(String idioma : idiomaUsuario){
            if (data.language.get(i).toUpperCase().equals(idioma.toUpperCase())) {
                similitud = similitud + pesoIdioma;
            }  
            }
            //DIRECTOR  
            for(String director : directorUsuario){
            tempo = data.director_name.get(i).replace(" ", "");
            if(tempo.toUpperCase().equals(director.toUpperCase())){
                similitud = similitud + pesoDirector;
            }
            }
            //AÑO       
            for (String año : añoUsuario){
                if (año.equals("")) {
                    año="0";
                }
        
            if(data.title_year.get(i) == Integer.parseInt(año)){
                similitud = similitud + pesoAñoLanzamiento;
            }
            }
            //ACTORES
            for(String actor : actorUsuario){
            tempo = data.actor_1_name.get(i).replace(" ", "");
            if(tempo.toUpperCase().equals(actor.toUpperCase())){
                similitud = similitud + pesoActor;
            }
            tempo = data.actor_2_name.get(i).replace(" ", "");
            if(tempo.toUpperCase().equals(actor.toUpperCase())){
                similitud = similitud + pesoActor;
            }
            tempo = data.actor_3_name.get(i).replace(" ", "");    
            if(tempo.toUpperCase().equals(actor.toUpperCase())){
                similitud = similitud + pesoActor;
            }
            }
            //PAIS
            for(String pais : paisUsuario){
            tempo = data.country.get(i).replace(" ", "");
            if(tempo.toUpperCase().equals(pais.toUpperCase())){
                similitud = similitud + pesoPais;
            }
            }
            //GENEROS
            for(String genero : generosUsuario){
            tempo = data.genres_by_movie.get(i).toString();
            if(tempo.contains(genero)){
                similitud = similitud + pesoGenero;
            }
            }
            

            similitud = Round(similitud,4);
            listaSimilitud.add(similitud);

        }
        GetListaRecomendacion();
        
        
        int size;
        if (listaRecomendacion.size()>=10) {
            size = 10;
        } else {
            size = listaRecomendacion.size();
        }
        ArrayList<Integer>listaRandom = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
        Random rand = new Random();
        while(true) 
        {
        int randomElement = listaRecomendacion.get(rand.nextInt(listaRecomendacion.size()));
        if(!listaRandom.contains(randomElement))
        {
        listaRandom.add(randomElement);
        break;
        }
        }
        }
        DefaultListModel model = new DefaultListModel<>();
        for(Integer random : listaRandom) {
            String add = data.movie_title.get(random);
            model.addElement(add);
        }
        DefaultListCellRenderer cellRenderer = (DefaultListCellRenderer)jListFrio.getCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants .CENTER);
        jListFrio.setModel(model);
        
    }
    
     public void LimpiarArray (List<String>lista, String[]string){
         int sizelista = lista.size();
         int sizestring = string.length;
         
         for (int i = sizelista; i <sizestring ; i++) {
             string[i] = "";
         }
     }
     
    public void GetListaRecomendacion() {
        
        double rango1=0.0;
        double rango2=0.0;
        rango1 = getMax(listaSimilitud,1);
        rango2 = getMax(listaSimilitud,2);
        
        int contador = 2;
        if (rango2 == rango1) {
            while (true) {
            rango2 = getMax(listaSimilitud,contador);
                if (rango2 != rango1) {
                    break;
                } 
                contador++;
            }
        }
        contador = 0;
        for(double n: listaSimilitud)
        {
            if(Objects.equals(n, rango1) ||Objects.equals(n, rango2))                
            {
                listaRecomendacion.add(contador);                        
            }
            contador++;
        }
    }
    
    public Double getMax (ArrayList lista, int n){
        ArrayList<Double> sortedlist = new ArrayList<>(lista); 
        Collections.sort(sortedlist); 
        return sortedlist.get(sortedlist.size()-n);
   }
    
    public ArrayList<Double> MaxSort (ArrayList<Double> lista){
        ArrayList<Double> sortedlist = new ArrayList<>(lista); 
        
        ArrayList<Double> sorted = new ArrayList<>();
        Collections.sort(sortedlist);
          for (int i = sortedlist.size()-1; i >= 0; i--) {
              double n = sortedlist.get(i);
              sorted.add(n);
          }
        return  sorted;
   }

      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArranqueFrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArranqueFrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArranqueFrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArranqueFrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArranqueFrio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton btnRecomendar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListFrio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
