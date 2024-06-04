import java.util.ArrayList;
import java.util.List;

public class Theatre {

    int theatreId;
    String address;
    City city;
    List<Screen> screenList = new ArrayList<>();
    List<Show> shows = new ArrayList<>();



    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int id) {
        this.theatreId = id;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
