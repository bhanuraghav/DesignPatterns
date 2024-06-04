import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShowApp {
    MovieController movieController;
    TheatreController theatreController;

    BookMyShowApp() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public void initialize() {
        createMovies();
        createTheaters();
    }

    public void createBooking(City userCity, String movieName) {
        System.out.println("CreateBooking");

        //1. search movie by my location
        List<Movie> movies = movieController.getMovieByCity(userCity);

        //2. select the movie which you want to see. i want to see Bahubali
        Movie interestedMovie = null;
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                interestedMovie = movie;
                break;
            }
        }

        if (interestedMovie == null) {
            System.out.println("Movie not found in given city");
            return;
        }

        //3. get all show of this movie in Bangalore location
        Map<Theatre, List<Show>> showTheaterWise = theatreController.getAllShows(interestedMovie, userCity);

        //4. select the particular show user is interested in
        Map.Entry<Theatre, List<Show>> entry = showTheaterWise.entrySet().iterator().next();

        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        //5. Select Seat
        int seatNumber = 30;

        List<Integer> bookedSeat = interestedShow.getBookedSeatIds();

        if (!bookedSeat.contains(seatNumber)) {
            bookedSeat.add(seatNumber);

            //StartPayment
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if (screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);


        } else {
            //throw exception
            System.out.println("seat already booked, try again");
            return;

        }

        System.out.println("BOOKING SUCCESSFUL");
        return;

    }

    public void createMovies() {
        Movie avengers = new Movie(1, "AVENGERS", 128);
        Movie bahubali = new Movie(2, "BAHUBALI", 180);

        movieController.addMovies(City.BANGALORE, avengers);
        movieController.addMovies(City.DELHI, bahubali);
        movieController.addMovies(City.BANGALORE, bahubali);
        movieController.addMovies(City.DELHI, avengers);

    }

    public void createTheaters() {


        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie bahubaliMovie = movieController.getMovieByName("BAHUBALI");

        ////////////////////

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setScreenList(createScreen());
        inoxTheatre.setCity(City.BANGALORE);

        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = new Show(1, avengerMovie, inoxTheatre.getScreenList().get(0), 8);
        Show inoxEveningShow = new Show(2, bahubaliMovie, inoxTheatre.getScreenList().get(0), 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);

        ////////////////////

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setScreenList(createScreen());
        pvrTheatre.setCity(City.DELHI);

        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = new Show(1, avengerMovie, pvrTheatre.getScreenList().get(0), 9);
        Show pvrEveningShow = new Show(2, bahubaliMovie, pvrTheatre.getScreenList().get(0), 18);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShows(pvrShows);

        theatreController.addTheatres(inoxTheatre);
        theatreController.addTheatres(pvrTheatre);

    }

    public List<Screen> createScreen() {
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);
        return screens;
    }

    public List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }


        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

}
