import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsThreatreMap;
    List<Theatre> allTheatres;

    TheatreController() {
        cityVsThreatreMap = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public void addTheatres(Theatre theatre) {
        allTheatres.add(theatre);
        List<Theatre> theatres = cityVsThreatreMap.getOrDefault(theatre.getCity(), new ArrayList<>());
        theatres.add(theatre);
        cityVsThreatreMap.put(theatre.getCity(), theatres);
    }

    Map<Theatre, List<Show>> getAllShows(Movie movie, City city) {
        Map<Theatre, List<Show>> ThreatreVsShows = new HashMap<>();

        List<Theatre> theatres = cityVsThreatreMap.get(city);


        for (Theatre Theatre : theatres) {

            List<Show> givenMovieShow = new ArrayList<>();
            List<Show> listedShows = Theatre.getShows();

            for (Show show : listedShows) {
                if (show.getMovie().getMovieId() == movie.getMovieId()) {
                    givenMovieShow.add(show);
                }
            }

            if (!givenMovieShow.isEmpty()) {
                ThreatreVsShows.put(Theatre, givenMovieShow);
            }
        }

        return ThreatreVsShows;
    }


}
