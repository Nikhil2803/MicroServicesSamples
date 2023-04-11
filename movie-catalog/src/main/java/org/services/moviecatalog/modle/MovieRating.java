package org.services.moviecatalog.modle;

import org.services.moviecatalog.MovieStar;

public class MovieRating {
    private int id;
    private MovieInfo movie;
    private MovieStar rating ;

    public MovieRating() {
    }

    public MovieRating(int id, MovieInfo movie, MovieStar rating) {
        this.id = id;
        this.movie = movie;
        this.rating = rating;
    }

    public MovieRating(int id,  MovieStar rating) {
        this.id = id;
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

    public MovieStar getRating() {
        return rating;
    }

    public void setRating(MovieStar rating) {
        this.rating = rating;
    }
}
