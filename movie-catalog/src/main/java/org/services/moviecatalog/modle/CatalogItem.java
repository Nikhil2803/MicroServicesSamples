package org.services.moviecatalog.modle;

public class CatalogItem {
    private int id;
    private MovieInfo movie;
    private MovieRating rating;

    public CatalogItem(int id, MovieInfo movie, MovieRating rating) {
        this.id = id;
        this.movie = movie;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MovieInfo getMovie() {
        return movie;
    }

    public void setMovie(MovieInfo movie) {
        this.movie = movie;
    }

    public MovieRating getRating() {
        return rating;
    }

    public void setRating(MovieRating rating) {
        this.rating = rating;
    }
}
