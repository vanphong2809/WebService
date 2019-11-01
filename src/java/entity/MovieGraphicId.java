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
public class MovieGraphicId {
    
     private String movieId;
     private String graphicId;

    public MovieGraphicId() {
    }

    public MovieGraphicId(String movieId, String graphicId) {
       this.movieId = movieId;
       this.graphicId = graphicId;
    }
   
    public String getMovieId() {
        return this.movieId;
    }
    
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getGraphicId() {
        return this.graphicId;
    }
    
    public void setGraphicId(String graphicId) {
        this.graphicId = graphicId;
    }
}
