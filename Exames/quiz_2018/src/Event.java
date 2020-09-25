import java.util.HashSet;
import java.util.Set;

public class Event {
    private String title;
    private String date;
    private String description;
    private Set<Person> audience;

    public Event(Event e) {
        this.title = e.getTitle();
        this.date = e.getDate();
        this.description = e.getDescription();
        this.audience = new HashSet<>();
    }

    public Event(String title) {
        this.title = title;
        this.date = "";
        this.description = "";
        this.audience = new HashSet<>();
    }

    public Event(String title, String date) {
        this.title = title;
        this.date = date;
        this.description = "";
        this.audience = new HashSet<>();
    }

    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.audience = new HashSet<>();
    }

    public Set<Person> getAudience() {
        return audience;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return title + " is a " + description + " and will be held at " + date + ".";
    }

    public boolean equals(Object o){
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Event e = (Event) o;
        return title.equals(e.getTitle()) && date.equals(e.getDate()) && description.equals(e.getDescription());
    }

    public int hashCode(){
        return title.length() + date.length() + description.length();
    }

    public void addPerson(Person person) {
        audience.add(person);
    }

    public int getAudienceCount() {
        return audience.size();
    }

    public void addEvent(Event e) {
        for (Person person : e.getAudience()){
            addPerson(person);
        }
    }
}
