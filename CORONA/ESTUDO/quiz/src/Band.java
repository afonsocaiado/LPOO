import java.util.ArrayList;
import java.util.List;

public class Band extends Act {

    List<Artist> artists = new ArrayList<>();

    public Band(String name, String country){
        super(name, country);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void addArtist(Artist artist){
        artists.add(artist);
    }

    public boolean containsArtist(Artist artist){
        for(Artist artist1 : artists){
            if(artist1.equals(artist)){
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}
