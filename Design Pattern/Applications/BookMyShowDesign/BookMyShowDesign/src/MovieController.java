import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovieMap;
    List<Movie> allMovies;

    MovieController() {
        cityVsMovieMap = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovies(City city, Movie movie) {
        allMovies.add(movie);
        List<Movie> movies = cityVsMovieMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovieMap.put(city, movies);
    }

    public Movie getMovieByName(String movieName) {
        for (Movie movie : allMovies) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMovieByCity(City city) {
        return cityVsMovieMap.get(city);
    }


}
