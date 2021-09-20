package ru.netology.domain;

public class Movie {
    private String name;
    private String genre;

    //конструктор с параметрами массива
    public Movie(String name, String genre) {
        this.setName(name);
        this.setGenre(genre);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}


