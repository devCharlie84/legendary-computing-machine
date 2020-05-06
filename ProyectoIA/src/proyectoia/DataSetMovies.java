/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class DataSetMovies {
    
     //Lista por columna del archivo csv  
        public ArrayList<String> color = new ArrayList<>();
        public ArrayList<String> director_name = new ArrayList<>();
        public ArrayList<Integer> num_critic_for_reviews = new ArrayList<>();
        public ArrayList<Integer> duration = new ArrayList<>();
        public ArrayList<Integer> director_facebook_likes = new ArrayList<>();
        public ArrayList<Integer> actor_3_facebook_likes = new ArrayList<>();
        public ArrayList<String> actor_2_name = new ArrayList<>();
        public ArrayList<Integer> actor_1_facebook_likes = new ArrayList<>();
        public ArrayList<Integer> gross = new ArrayList<>();
        public ArrayList<String> genres = new ArrayList<>();
            public ArrayList<ArrayList<String>> genres_by_movie = new ArrayList<>();
        public ArrayList<String> actor_1_name = new ArrayList<>();
        public ArrayList<String> movie_title = new ArrayList<>();
        public ArrayList<Integer> num_voted_users = new ArrayList<>();
        public ArrayList<Integer> cast_total_facebook_likes = new ArrayList<>();
        public ArrayList<String> actor_3_name = new ArrayList<>();
        public ArrayList<Integer> facenumber_in_poster = new ArrayList<>();                
        public ArrayList<String> plot_keywords = new ArrayList<>();
        public ArrayList<String> movie_imdb_link = new ArrayList<>();
        public ArrayList<Integer> num_user_for_reviews = new ArrayList<>();
        public ArrayList<String> language = new ArrayList<>();
        public ArrayList<String> country = new ArrayList<>();                        
        public ArrayList<String> content_rating = new ArrayList<>();
        public ArrayList<Long> budget = new ArrayList<>();
        public ArrayList<Integer> title_year = new ArrayList<>();
        public ArrayList<Integer> actor_2_facebook_likes = new ArrayList<>();
        public ArrayList<Double> imdb_score = new ArrayList<>();
        public ArrayList<Double> aspect_ratio = new ArrayList<>();
        public ArrayList<Integer> movie_facebook_likes = new ArrayList<>();
        
        public int contador = 0;
        
        
    //Método que lee archivo
    //LeerArchivo
    public void LeerArchivo(String ruta){
        int i =0;
        
        try {
            try (Scanner scanner = new Scanner(new File(ruta))) {
                while (scanner.hasNextLine()){
                    String fila = scanner.nextLine();
                    if(i >0){
                        LlenarListas(fila);
                    }
                    i++;
                }
            }
        } catch (FileNotFoundException ex) {
        }
    }
    
     //Método que llena las listas por cada columna 
    //LlenarListas
   public void LlenarListas(String fila) {
       String[] genresByMovie;
       ArrayList<String> generos = new ArrayList<>();
   
       String[] columnas = fila.split(",");
     
       for (int i = 0; i < columnas.length; i++) {
           if (columnas[i].isEmpty()) {
               columnas[i] = "NULL";
           }
       }
            // <editor-fold defaultstate="collapsed" desc="IF statement">
            switch (columnas.length) {
            //if length == 29
                case 29:
                    color.add(columnas[0]);
                    director_name.add(columnas[1]);
                    if (columnas[2].equals("NULL")) {
                        num_critic_for_reviews.add(0);
                    } else {
                        num_critic_for_reviews.add(Integer.parseInt(columnas[2]));
                    }        if (columnas[3].equals("NULL")) {
                        duration.add(0);
                    } else {
                        duration.add(Integer.parseInt(columnas[3]));
                    }        if (columnas[4].equals("NULL")) {
                        director_facebook_likes.add(0);
                    } else {
                        director_facebook_likes.add(Integer.parseInt(columnas[4]));
                    }        if (columnas[5].equals("NULL")) {
                        actor_3_facebook_likes.add(0);
                    } else {
                        actor_3_facebook_likes.add(Integer.parseInt(columnas[5]));
                    }        actor_2_name.add(columnas[6]);
                    if (columnas[7].equals("NULL")) {
                        actor_1_facebook_likes.add(0);
                    } else {
                        actor_1_facebook_likes.add(Integer.parseInt(columnas[7]));
                    }        if (columnas[8].equals("NULL")) {
                        gross.add(0);
                    } else {
                        gross.add(Integer.parseInt(columnas[8]));
                    }        genres.add(columnas[9]);
                    genresByMovie =  columnas[9].split("\\|");
                    for (String genero : genresByMovie)
                        generos.add(genero);
                    genres_by_movie.add(contador, generos);
                    contador++;
                    actor_1_name.add(columnas[10]);
                    movie_title.add(columnas[11]+columnas[12]);
                    if (columnas[13].equals("NULL")) {
                        num_voted_users.add(0);
                    } else {
                        num_voted_users.add(Integer.parseInt(columnas[13]));
                    }        if (columnas[14].equals("NULL")) {
                        cast_total_facebook_likes.add(0);
                    } else {
                        cast_total_facebook_likes.add(Integer.parseInt(columnas[14]));
                    }        actor_3_name.add(columnas[15]);
                    if (columnas[16].equals("NULL")) {
                        facenumber_in_poster.add(0);
                    } else {
                        facenumber_in_poster.add(Integer.parseInt(columnas[16]));
                    }        plot_keywords.add(columnas[17]);
                    movie_imdb_link.add(columnas[18]);
                    if (columnas[19].equals("NULL")) {
                        num_user_for_reviews.add(0);
                    } else {
                        num_user_for_reviews.add(Integer.parseInt(columnas[19]));
                    }        language.add(columnas[20]);
                    country.add(columnas[21]);
                    content_rating.add(columnas[22]);
                    if (columnas[23].equals("NULL")) {
                        budget.add(Long.MIN_VALUE);
                    } else {
                        budget.add(Long.parseLong(columnas[23]));
                    }        if (columnas[24].equals("NULL")) {
                        title_year.add(0);
                    } else {
                        title_year.add(Integer.parseInt(columnas[24]));
                    }        if (columnas[25].equals("NULL")) {
                        actor_2_facebook_likes.add(0);
                    } else {
                        actor_2_facebook_likes.add(Integer.parseInt(columnas[25]));
                    }        if (columnas[26].equals("NULL")) {
                        imdb_score.add(0.0);
                    } else {
                        imdb_score.add(Double.parseDouble(columnas[26]));
                    }        if (columnas[27].equals("NULL")) {
                        aspect_ratio.add(0.0);
                    } else {
                        aspect_ratio.add(Double.parseDouble(columnas[27]));
                    }        if (columnas[28].equals("NULL")) {
                        movie_facebook_likes.add(0);
                    } else {
                        movie_facebook_likes.add(Integer.parseInt(columnas[28]));
                    }        break;
// </editor-fold>
            //else if length == 30
                case 30:
                    color.add(columnas[0]);
                    director_name.add(columnas[1]);
                    if (columnas[2].equals("NULL")) {
                        num_critic_for_reviews.add(0);
                    } else {
                        num_critic_for_reviews.add(Integer.parseInt(columnas[2]));
                    }        if (columnas[3].equals("NULL")) {
                        duration.add(0);
                    } else {
                        duration.add(Integer.parseInt(columnas[3]));
                    }        if (columnas[4].equals("NULL")) {
                        director_facebook_likes.add(0);
                    } else {
                        director_facebook_likes.add(Integer.parseInt(columnas[4]));
                    }        if (columnas[5].equals("NULL")) {
                        actor_3_facebook_likes.add(0);
                    } else {
                        actor_3_facebook_likes.add(Integer.parseInt(columnas[5]));
                    }        actor_2_name.add(columnas[6]);
                    if (columnas[7].equals("NULL")) {
                        actor_1_facebook_likes.add(0);
                    } else {
                        actor_1_facebook_likes.add(Integer.parseInt(columnas[7]));
                    }        if (columnas[8].equals("NULL")) {
                        gross.add(0);
                    } else {
                        gross.add(Integer.parseInt(columnas[8]));
                    }        genres.add(columnas[9]);
                    genresByMovie =  columnas[9].split("\\|");
                    for (String genero : genresByMovie)
                        generos.add(genero);
                    genres_by_movie.add(contador, generos);
                    contador++;
                    actor_1_name.add(columnas[10]);
                    movie_title.add(columnas[11]+columnas[12]+columnas[13]);
                    if (columnas[14].equals("NULL")) {
                        num_voted_users.add(0);
                    } else {
                        num_voted_users.add(Integer.parseInt(columnas[14]));
                    }        if (columnas[15].equals("NULL")) {
                        cast_total_facebook_likes.add(0);
                    } else {
                        cast_total_facebook_likes.add(Integer.parseInt(columnas[15]));
                    }        actor_3_name.add(columnas[16]);
                    if (columnas[17].equals("NULL")) {
                        facenumber_in_poster.add(0);
                    } else {
                        facenumber_in_poster.add(Integer.parseInt(columnas[17]));
                    }        plot_keywords.add(columnas[18]);
                    movie_imdb_link.add(columnas[19]);
                    if (columnas[20].equals("NULL")) {
                        num_user_for_reviews.add(0);
                    } else {
                        num_user_for_reviews.add(Integer.parseInt(columnas[20]));
                    }        language.add(columnas[21]);
                    country.add(columnas[22]);
                    content_rating.add(columnas[23]);
                    if (columnas[24].equals("NULL")) {
                        budget.add(Long.MIN_VALUE);
                    } else {
                        budget.add(Long.parseLong(columnas[24]));
                    }        if (columnas[25].equals("NULL")) {
                        title_year.add(0);
                    } else {
                        title_year.add(Integer.parseInt(columnas[25]));
                    }        if (columnas[26].equals("NULL")) {
                        actor_2_facebook_likes.add(0);
                    } else {
                        actor_2_facebook_likes.add(Integer.parseInt(columnas[26]));
                    }        if (columnas[27].equals("NULL")) {
                        imdb_score.add(0.0);
                    } else {
                        imdb_score.add(Double.parseDouble(columnas[27]));
                    }        if (columnas[28].equals("NULL")) {
                        aspect_ratio.add(0.0);
                    } else {
                        aspect_ratio.add(Double.parseDouble(columnas[28]));
                    }        if (columnas[29].equals("NULL")) {
                        movie_facebook_likes.add(0);
                    } else {
                        movie_facebook_likes.add(Integer.parseInt(columnas[29]));
                    }        break;
            //else if length == 31
                case 31:
                    color.add(columnas[0]);
                    director_name.add(columnas[1]);
                    if (columnas[2].equals("NULL")) {
                        num_critic_for_reviews.add(0);
                    } else {
                        num_critic_for_reviews.add(Integer.parseInt(columnas[2]));
                    }        if (columnas[3].equals("NULL")) {
                        duration.add(0);
                    } else {
                        duration.add(Integer.parseInt(columnas[3]));
                    }        if (columnas[4].equals("NULL")) {
                        director_facebook_likes.add(0);
                    } else {
                        director_facebook_likes.add(Integer.parseInt(columnas[4]));
                    }        if (columnas[5].equals("NULL")) {
                        actor_3_facebook_likes.add(0);
                    } else {
                        actor_3_facebook_likes.add(Integer.parseInt(columnas[5]));
                    }        actor_2_name.add(columnas[6]);
                    if (columnas[7].equals("NULL")) {
                        actor_1_facebook_likes.add(0);
                    } else {
                        actor_1_facebook_likes.add(Integer.parseInt(columnas[7]));
                    }        if (columnas[8].equals("NULL")) {
                        gross.add(0);
                    } else {
                        gross.add(Integer.parseInt(columnas[8]));
                    }        genres.add(columnas[9]);
                    genresByMovie =  columnas[9].split("\\|");
                    for (String genero : genresByMovie)
                        generos.add(genero);
                    genres_by_movie.add(contador, generos);
                    contador++;
                    actor_1_name.add(columnas[10]);
                    movie_title.add(columnas[11]+columnas[12]+columnas[13]+columnas[14]);
                    if (columnas[15].equals("NULL")) {
                        num_voted_users.add(0);
                    } else {
                        num_voted_users.add(Integer.parseInt(columnas[15]));
                    }        if (columnas[16].equals("NULL")) {
                        cast_total_facebook_likes.add(0);
                    } else {
                        cast_total_facebook_likes.add(Integer.parseInt(columnas[16]));
                    }        actor_3_name.add(columnas[17]);
                    if (columnas[18].equals("NULL")) {
                        facenumber_in_poster.add(0);
                    } else {
                        facenumber_in_poster.add(Integer.parseInt(columnas[18]));
                    }        plot_keywords.add(columnas[19]);
                    movie_imdb_link.add(columnas[20]);
                    if (columnas[21].equals("NULL")) {
                        num_user_for_reviews.add(0);
                    } else {
                        num_user_for_reviews.add(Integer.parseInt(columnas[21]));
                    }        language.add(columnas[22]);
                    country.add(columnas[23]);
                    content_rating.add(columnas[24]);
                    if (columnas[25].equals("NULL")) {
                        budget.add(Long.MIN_VALUE);
                    } else {
                        budget.add(Long.parseLong(columnas[25]));
                    }        if (columnas[26].equals("NULL")) {
                        title_year.add(0);
                    } else {
                        title_year.add(Integer.parseInt(columnas[26]));
                    }        if (columnas[27].equals("NULL")) {
                        actor_2_facebook_likes.add(0);
                    } else {
                        actor_2_facebook_likes.add(Integer.parseInt(columnas[27]));
                    }        if (columnas[28].equals("NULL")) {
                        imdb_score.add(0.0);
                    } else {
                        imdb_score.add(Double.parseDouble(columnas[28]));
                    }        if (columnas[29].equals("NULL")) {
                        aspect_ratio.add(0.0);
                    } else {
                        aspect_ratio.add(Double.parseDouble(columnas[29]));
                    }        if (columnas[30].equals("NULL")) {
                        movie_facebook_likes.add(0);
                    } else {
                        movie_facebook_likes.add(Integer.parseInt(columnas[30]));
                    }        break;
                default:
                    color.add(columnas[0]);
                    director_name.add(columnas[1]);
                    if (columnas[2].equals("NULL")) {
                        num_critic_for_reviews.add(0);
                    } else {
                        num_critic_for_reviews.add(Integer.parseInt(columnas[2]));
                    }        if (columnas[3].equals("NULL")) {
                        duration.add(0);
                    } else {
                        duration.add(Integer.parseInt(columnas[3]));
                    }        if (columnas[4].equals("NULL")) {
                        director_facebook_likes.add(0);
                    } else {
                        director_facebook_likes.add(Integer.parseInt(columnas[4]));
                    }        if (columnas[5].equals("NULL")) {
                        actor_3_facebook_likes.add(0);
                    } else {
                        actor_3_facebook_likes.add(Integer.parseInt(columnas[5]));
                    }        actor_2_name.add(columnas[6]);
                    if (columnas[7].equals("NULL")) {
                        actor_1_facebook_likes.add(0);
                    } else {
                        actor_1_facebook_likes.add(Integer.parseInt(columnas[7]));
                    }        if (columnas[8].equals("NULL")) {
                        gross.add(0);
                    } else {
                        gross.add(Integer.parseInt(columnas[8]));
                    }        genres.add(columnas[9]);
                    genresByMovie =  columnas[9].split("\\|");
                    for (String genero : genresByMovie)
                        generos.add(genero);
                    genres_by_movie.add(contador, generos);
                    contador++;
                    actor_1_name.add(columnas[10]);
                    movie_title.add(columnas[11]);
                    if (columnas[12].equals("NULL")) {
                        num_voted_users.add(0);
                    } else {
                        num_voted_users.add(Integer.parseInt(columnas[12]));
                    }        if (columnas[13].equals("NULL")) {
                        cast_total_facebook_likes.add(0);
                    } else {
                        cast_total_facebook_likes.add(Integer.parseInt(columnas[13]));
                    }        actor_3_name.add(columnas[14]);
                    if (columnas[15].equals("NULL")) {
                        facenumber_in_poster.add(0);
                    } else {
                        facenumber_in_poster.add(Integer.parseInt(columnas[15]));
                    }        plot_keywords.add(columnas[16]);
                    movie_imdb_link.add(columnas[17]);
                    if (columnas[18].equals("NULL")) {
                        num_user_for_reviews.add(0);
                    } else {
                        num_user_for_reviews.add(Integer.parseInt(columnas[18]));
                    }        language.add(columnas[19]);
                    country.add(columnas[20]);
                    content_rating.add(columnas[21]);
                    if (columnas[22].equals("NULL")) {
                        budget.add(Long.MIN_VALUE);
                    } else {
                        budget.add(Long.parseLong(columnas[22]));
                    }        if (columnas[23].equals("NULL")) {
                        title_year.add(0);
                    } else {
                        title_year.add(Integer.parseInt(columnas[23]));
                    }        if (columnas[24].equals("NULL")) {
                        actor_2_facebook_likes.add(0);
                    } else {
                        actor_2_facebook_likes.add(Integer.parseInt(columnas[24]));
                    }        if (columnas[25].equals("NULL")) {
                        imdb_score.add(0.0);
                    } else {
                        imdb_score.add(Double.parseDouble(columnas[25]));
                    }        if (columnas[26].equals("NULL")) {
                        aspect_ratio.add(0.0);
                    } else {
                        aspect_ratio.add(Double.parseDouble(columnas[26]));
                    }        if (columnas[27].equals("NULL")) {
                        movie_facebook_likes.add(0);
                    } else {
                        movie_facebook_likes.add(Integer.parseInt(columnas[27]));
                    }        break;
            }
        
   }
}
