package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {

    private Movie[] movies;
    private int feedLimit;

    public MovieManager() {
        movies = new Movie[0];
        feedLimit = 10;
    }

    public MovieManager(int feedLimit) {
        movies = new Movie[0];
        this.feedLimit = feedLimit;
    }

    public void addMovie(Movie film) {

        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }


    public Movie[] getFeed() {
        int resultLength;
        if (movies.length >= feedLimit) {
            resultLength = feedLimit;
        } else {
            resultLength = movies.length;
        }

        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }

        return result;
    }
}











