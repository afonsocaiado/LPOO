public class Artist extends Act {

    public Artist(String name, String country) {
        super(name, country);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;
        return this.getName() == artist.getName() && this.getCountry() == artist.getCountry();
    }
}
