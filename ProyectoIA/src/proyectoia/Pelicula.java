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
public class Pelicula {
    
        String color ;
        String director_name ;
        int num_critic_for_reviews ;
        int duration ;
        int director_facebook_likes ;
        int actor_3_facebook_likes ;
        String actor_2_name ;
        int actor_1_facebook_likes ;
        int gross ;
        String genres ;
           public ArrayList<ArrayList<String>> genres_by_movie ;
        String actor_1_name ;
        String movie_title ;
        int num_voted_users ;
        int cast_total_facebook_likes ;
        String actor_3_name ;
        int facenumber_in_poster ;                
        String plot_keywords ;
        String movie_imdb_link ;
        int num_user_for_reviews ;
        String language ;
        String country ;                        
        String content_rating ;
        Long budget ;
        int title_year ;
        int actor_2_facebook_likes ;
        public ArrayList<Double> imdb_score ;
        public ArrayList<Double> aspect_ratio ;
        int movie_facebook_likes ;

        //Constructor
    public Pelicula(String movie_title) {
        this.movie_title = movie_title;
    }

    



        //GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public int getNum_critic_for_reviews() {
        return num_critic_for_reviews;
    }

    public void setNum_critic_for_reviews(int num_critic_for_reviews) {
        this.num_critic_for_reviews = num_critic_for_reviews;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDirector_facebook_likes() {
        return director_facebook_likes;
    }

    public void setDirector_facebook_likes(int director_facebook_likes) {
        this.director_facebook_likes = director_facebook_likes;
    }

    public int getActor_3_facebook_likes() {
        return actor_3_facebook_likes;
    }

    public void setActor_3_facebook_likes(int actor_3_facebook_likes) {
        this.actor_3_facebook_likes = actor_3_facebook_likes;
    }

    public String getActor_2_name() {
        return actor_2_name;
    }

    public void setActor_2_name(String actor_2_name) {
        this.actor_2_name = actor_2_name;
    }

    public int getActor_1_facebook_likes() {
        return actor_1_facebook_likes;
    }

    public void setActor_1_facebook_likes(int actor_1_facebook_likes) {
        this.actor_1_facebook_likes = actor_1_facebook_likes;
    }

    public int getGross() {
        return gross;
    }

    public void setGross(int gross) {
        this.gross = gross;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
    
    public ArrayList<ArrayList<String>> getGenres_by_movie() {
        return genres_by_movie;
    }

    public void setGenres_by_movie(ArrayList<ArrayList<String>> genres_by_movie) {
        this.genres_by_movie = genres_by_movie;
    }

    public String getActor_1_name() {
        return actor_1_name;
    }

    public void setActor_1_name(String actor_1_name) {
        this.actor_1_name = actor_1_name;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public int getNum_voted_users() {
        return num_voted_users;
    }

    public void setNum_voted_users(int num_voted_users) {
        this.num_voted_users = num_voted_users;
    }

    public int getCast_total_facebook_likes() {
        return cast_total_facebook_likes;
    }

    public void setCast_total_facebook_likes(int cast_total_facebook_likes) {
        this.cast_total_facebook_likes = cast_total_facebook_likes;
    }

    public String getActor_3_name() {
        return actor_3_name;
    }

    public void setActor_3_name(String actor_3_name) {
        this.actor_3_name = actor_3_name;
    }

    public int getFacenumber_in_poster() {
        return facenumber_in_poster;
    }

    public void setFacenumber_in_poster(int facenumber_in_poster) {
        this.facenumber_in_poster = facenumber_in_poster;
    }

    public String getPlot_keywords() {
        return plot_keywords;
    }

    public void setPlot_keywords(String plot_keywords) {
        this.plot_keywords = plot_keywords;
    }

    public String getMovie_imdb_link() {
        return movie_imdb_link;
    }

    public void setMovie_imdb_link(String movie_imdb_link) {
        this.movie_imdb_link = movie_imdb_link;
    }

    public int getNum_user_for_reviews() {
        return num_user_for_reviews;
    }

    public void setNum_user_for_reviews(int num_user_for_reviews) {
        this.num_user_for_reviews = num_user_for_reviews;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContent_rating() {
        return content_rating;
    }

    public void setContent_rating(String content_rating) {
        this.content_rating = content_rating;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public int getTitle_year() {
        return title_year;
    }

    public void setTitle_year(int title_year) {
        this.title_year = title_year;
    }

    public int getActor_2_facebook_likes() {
        return actor_2_facebook_likes;
    }

    public void setActor_2_facebook_likes(int actor_2_facebook_likes) {
        this.actor_2_facebook_likes = actor_2_facebook_likes;
    }

    public ArrayList<Double> getImdb_score() {
        return imdb_score;
    }

    public void setImdb_score(ArrayList<Double> imdb_score) {
        this.imdb_score = imdb_score;
    }

    public ArrayList<Double> getAspect_ratio() {
        return aspect_ratio;
    }

    public void setAspect_ratio(ArrayList<Double> aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    public int getMovie_facebook_likes() {
        return movie_facebook_likes;
    }

    public void setMovie_facebook_likes(int movie_facebook_likes) {
        this.movie_facebook_likes = movie_facebook_likes;
    }
        
        
        
        
    
}
