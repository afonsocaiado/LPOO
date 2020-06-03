import java.util.Objects;

public class Event {

    private String title;
    private String date;
    private String description;

    public Event(String title){
        this.title = title;
        this.date = "";
        this.description = "";
    }

    public Event(String title, String date){
        this.title = title;
        this.date = date;
        this.description = "";
    }

    public Event(String title, String date, String description){
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public Event(Event event){
        this.title = event.getTitle();
        this.date = event.getDate();
        this.description = event.getDescription();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return title + " is a " + description + " and will be held at " + date + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) &&
                Objects.equals(date, event.date) &&
                Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }
}
