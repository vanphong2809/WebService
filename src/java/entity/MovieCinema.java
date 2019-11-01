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
public class MovieCinema {
    private MovieCategoryId id;
    private Movie movie;
    private Cinema cinema;

    public MovieCinema() {
    }

    public MovieCinema(MovieCategoryId id, Movie movie, Cinema cinema) {
        this.id = id;
        this.movie = movie;
        this.cinema = cinema;
    }

    public MovieCategoryId getId() {
        return id;
    }

    public void setId(MovieCategoryId id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
    
}
