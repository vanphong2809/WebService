package entity;

public class MovieCategoryId {

    private String movieId;
    private String categoryId;

    public MovieCategoryId() {
    }

    public MovieCategoryId(String movieId, String categoryId) {
        this.movieId = movieId;
        this.categoryId = categoryId;
    }

    public String getMovieId() {
        return this.movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

}
