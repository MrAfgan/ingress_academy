package ders.lesson15;

import java.util.Objects;

public class Movie implements Comparable<Movie> {
    String name;
    int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Movie: " + name +
                ", was produced in=" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movies = (Movie) o;
        return year == movies.year && Objects.equals(name, movies.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
