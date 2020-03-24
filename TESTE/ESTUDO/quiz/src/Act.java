public abstract class Act {

    private String name;
    private String country;

    public Act(String name, String country){
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        Artist a = (Artist) o;
        return (this.getName() == a.getName() && this.getCountry() == a.getCountry());
    }
}
