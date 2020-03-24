import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {

    private String city;
    private String country;
    private String date;
    private List<Act> acts = new ArrayList<>();

    public Concert(String city, String country, String date){
        this.city = city;
        this.country = country;
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public List<Act> getActs() {
        return acts;
    }

    public void addAct(Act act){
        acts.add(act);
    }

    public boolean isValid(Ticket ticket){
        return this.equals(ticket.getConcert());
    }

    public boolean participates(Artist artist){
        for (Act act : acts){
            if(act.getClass() == Artist.class && artist.equals(act)){
                return true;
            }
            else if(act.getClass() == Band.class){
                Band b = (Band) act;
                if(b.containsArtist(artist)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        Concert c = (Concert) o;
        return this.city.equals(c.city) && this.country.equals(c.country) && this.date.equals(c.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date);
    }


}
