package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {

    private Movie[] movies;
    private int feedLimit;

    public MovieManager() {
        movies = null;
        feedLimit = 10;
    }

    public MovieManager(int feedLimit) {
        movies = null;
        this.feedLimit = feedLimit;
    }

    public void addMovie(Movie film) {
        if (movies == null) {
            movies = new Movie[1];
            movies[0] = film;
        } else {
            Movie[] tmp = new Movie[movies.length + 1];
            for (int i = 0; i < movies.length; i++) {
                tmp[i] = movies[i];
            }
            tmp[tmp.length - 1] = film;
            movies = tmp;
        }
    }

    public Movie[] getFeed() {
        if (movies == null) {
            return null;
        }

        int actualLimit;
        if (movies.length >= feedLimit) {
            actualLimit = feedLimit;
        } else {
            actualLimit = movies.length;
        }

        Movie[] res = new Movie[actualLimit];

        for(int i = 0; i < actualLimit; i++) {
            res[i] = movies[movies.length - 1 - i];
        }

        return res;
    }
}











