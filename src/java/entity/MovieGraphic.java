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
public class MovieGraphic {
    
     private MovieGraphicId id;
     private Graphic graphic;
     private Movie movie;

    public MovieGraphic() {
    }

	
    public MovieGraphic(MovieGraphicId id) {
        this.id = id;
    }
    public MovieGraphic(MovieGraphicId id, Graphic graphic, Movie movie) {
       this.id = id;
       this.graphic = graphic;
       this.movie = movie;
    }
   
    public MovieGraphicId getId() {
        return this.id;
    }
    
    public void setId(MovieGraphicId id) {
        this.id = id;
    }
    public Graphic getGraphic() {
        return this.graphic;
    }
    
    public void setGraphic(Graphic graphic) {
        this.graphic = graphic;
    }
    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
