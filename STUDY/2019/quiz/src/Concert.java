import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert{

    private String city, country, date;
    private List<Act> acts;

    public Concert(String city, String country, String date) {
        this.city = city;
        this.country = country;
        this.date = date;

        acts = new ArrayList<>();
    }

    public String getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public List<Act> getActs() {
        return acts;
    }

    public void addAct(Act act){
        acts.add(act);
    }

    public boolean isValid(Ticket ticket){
        return ticket.getConcert() == this;
    }

    public boolean participates(Artist artist){
        for(Act act : acts){
            if(act.getClass() == Artist.class){
                if(act.equals(artist))
                    return true;
            }
            else if(act.getClass() == Band.class){
                Band b = (Band) act;
                if(b.containsArtist(artist))
                    return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Concert concert = (Concert) o;
        return city.equals(concert.getCity()) && country.equals(concert.getCountry()) && date.equals(concert.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date);
    }
}
