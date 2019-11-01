/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class Movie {

    private String movieId;
    private String movieName;
    private String scenario;
    private String directors;
    private Integer duration;
    private Date release;
    private String language;
    private String overView;
    private String origin;
    private String videoTrailer;
    private Boolean status;
    private String imageMovie;
    private Set<TicketBook> ticketBooks = new HashSet<TicketBook>(0);
    private Set<MovieCategory> movieCategories = new HashSet<MovieCategory>(0);
    private Set<MovieGraphic> movieGraphics = new HashSet<MovieGraphic>(0);

    public Movie() {
    }


    public Movie(String movieId, String movieName, String scenario, String directors, Integer duration, Date release, String language, String overView, String origin, String videoTrailer, Boolean status, String imageMovie, Set<TicketBook> ticketBooks, Set<MovieCategory> movieCategories, Set<MovieGraphic> movieGraphics) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.scenario = scenario;
        this.directors = directors;
        this.duration = duration;
        this.release = release;
        this.language = language;
        this.overView = overView;
        this.origin = origin;
        this.videoTrailer = videoTrailer;
        this.status = status;
        this.imageMovie = imageMovie;
        this.ticketBooks = ticketBooks;
        this.movieCategories = movieCategories;
        this.movieGraphics = movieGraphics;
    }

    public String getMovieId() {
        return this.movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getScenario() {
        return this.scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getDirectors() {
        return this.directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getRelease() {
        return this.release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOverView() {
        return this.overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getVideoTrailer() {
        return this.videoTrailer;
    }

    public void setVideoTrailer(String videoTrailer) {
        this.videoTrailer = videoTrailer;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getImageMovie() {
        return imageMovie;
    }

    public void setImageMovie(String imageMovie) {
        this.imageMovie = imageMovie;
    }
    
    public Set<TicketBook> getTicketBooks() {
        return this.ticketBooks;
    }

    public void setTicketBooks(Set<TicketBook> ticketBooks) {
        this.ticketBooks = ticketBooks;
    }

    public Set<MovieCategory> getMovieCategories() {
        return this.movieCategories;
    }

    public void setMovieCategories(Set<MovieCategory> movieCategories) {
        this.movieCategories = movieCategories;
    }

    public Set<MovieGraphic> getMovieGraphics() {
        return this.movieGraphics;
    }

    public void setMovieGraphics(Set<MovieGraphic> movieGraphics) {
        this.movieGraphics = movieGraphics;
    }
}
