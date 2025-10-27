package ders.lesson15Tasks;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<String, List<Movie>> movieLibrary = new HashMap<>();
        addMovie(movieLibrary, "Tragic Romance", "Titanic", 1997);
        addMovie(movieLibrary, "Tragic Romance", "Meet Joe Black", 1998);
        addMovie(movieLibrary, "Tragic Romance", "The Great Gatsby", 2013);
        addMovie(movieLibrary, "Disaster", "Jaws", 1975);
        addMovie(movieLibrary, "Disaster", "Independence Day", 1996);
        addMovie(movieLibrary, "Disaster", "Gravity", 2013);
        addMovie(movieLibrary, "Disaster", "Armageddon", 1998);
        addMovie(movieLibrary, "Gangster", "The Godfather", 1972);
        addMovie(movieLibrary, "Gangster", "Leon", 1994);
        addMovie(movieLibrary, "Epic", "Interstellar", 2014);
        addMovie(movieLibrary, "Epic", "Inception", 2010);
        addMovie(movieLibrary, "Epic", "The Lord of the Rings: The Fellowship of the Ring", 2001);
        addMovie(movieLibrary, "Epic", "Oppenheimer", 2023);
        addMovie(movieLibrary, "Epic", "Forrest Gump", 1994);
        addMovie(movieLibrary, "The prison drama", "The Green Mile", 1999);
        System.out.println("Genre:"+movieLibrary);
        System.out.println("Genre with most movie is:'" + mostMoviesGenre(movieLibrary) + "'");
    }

    public static void addMovie(Map<String, List<Movie>> movieLibrary, String genre, String name, int year) {
        Movie newMovies = new Movie(name, year);
        List<Movie> addMovies = movieLibrary.computeIfAbsent(genre, _ -> new ArrayList<>());
        if (!addMovies.contains(newMovies)) {
            addMovies.add(newMovies);
            Collections.sort(movieLibrary.get(genre));
        }
    }

    public static String mostMoviesGenre(Map<String, List<Movie>> movieLibrary) {
        int maxTitleCount = 0;
        String favoritGenre = null;
        for (Map.Entry<String, List<Movie>> entry : movieLibrary.entrySet()) {
            if (entry.getValue().size() > maxTitleCount) {
                maxTitleCount = entry.getValue().size();
                favoritGenre = entry.getKey();
            }
        }
        return favoritGenre;
    }
}

