/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MyPC
 */
public class MovieCategory {
     private MovieCategoryId id;
     private Category category;
     private Movie movie;

    public MovieCategory() {
    }

	
    public MovieCategory(MovieCategoryId id) {
        this.id = id;
    }
    public MovieCategory(MovieCategoryId id, Category category, Movie movie) {
       this.id = id;
       this.category = category;
       this.movie = movie;
    }
   
    public MovieCategoryId getId() {
        return this.id;
    }
    
    public void setId(MovieCategoryId id) {
        this.id = id;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
