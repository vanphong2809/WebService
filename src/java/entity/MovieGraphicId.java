package entity;

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
