package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.MovieManager;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {
    //добавляем фильм в ленту
    @Test
    public void shouldCreateDefaultManagerAnd7Movies() {
        Movie[] movies;
        movies = new Movie[7];
        movies[0] = new Movie("Bloodshot", "action");
        movies[1] = new Movie("Forward", "cartoon");
        movies[2] = new Movie("Hotel Belgrade", "comedy");
        movies[3] = new Movie("Gentlemen", "action");
        movies[4] = new Movie("Invisible Man", "horrors");
        movies[5] = new Movie("trolls world tour", "cartoon");
        movies[6] = new Movie("Number One", "comedy");
        //вызываем конструктор без параметра
        MovieManager manager;
        manager = new MovieManager();
        //добавление каждого фильма в менеджер без параметра

        for (int i = movies.length - 1; i >= 0; i--) {
            manager.addMovie(movies[i]);
        }

        Movie[] feed;
        feed = manager.getFeed();

        assertEquals(true, Arrays.equals(feed, movies));

    }

    @Test
    public void shouldCreateDefaultManagerAnd5Movies() {
        Movie[] movies;
        movies = new Movie[7];
        movies[0] = new Movie("Bloodshot", "action");
        movies[1] = new Movie("Forward", "cartoon");
        movies[2] = new Movie("Hotel Belgrade", "comedy");
        movies[3] = new Movie("Gentlemen", "action");
        movies[4] = new Movie("Invisible Man", "horrors");
        movies[5] = new Movie("trolls world tour", "cartoon");
        movies[6] = new Movie("Number One", "comedy");
        //вызываем менеджера с конструктором без параметра
        MovieManager manager;
        manager = new MovieManager(5);
        //добавление каждого фильма в менеджер
        for (Movie m: movies) {
            manager.addMovie( m);
        }
        Movie[] feed;
        feed = manager.getFeed();
        assertEquals(5, feed.length);
    }

    @Test
    public void CreateBlankFeed() {
        MovieManager manager;
        manager = new MovieManager();
        Movie[] feed;
        feed = manager.getFeed();

    }


}
