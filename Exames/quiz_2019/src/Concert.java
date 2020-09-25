import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Act> acts;
    private String city;
    private String country;
    private String date;

    public Concert(String city, String country, String date) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.acts = new ArrayList<>();
    }

    public void addAct(Act act){
        acts.add(act);
    }

    public List<Act> getActs() {
        return acts;
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

    public boolean equals(Object obj){
        if (obj instanceof Concert){
            return this.city.equals(((Concert) obj).getCity()) && this.country.equals(((Concert) obj).getCountry()) && this.date.equals(((Concert) obj).getDate());
        }
        return false;
    }

    /*@Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Concert c = (Concert) o;
        return city.equals(c.getCity()) && country.equals(c.getCountry()) && date.equals(c.getDate());
    }*/

    public int hashCode(){
        return city.length();
    }

    /*@Override
    public int hashCode(){

        return city.length()+country.length()+date.length();
    }*/

    public boolean isValid(Ticket ticket){
        return ticket.getConcert().equals(this);
    }

    public boolean participates(Artist artist) {
        for (Act act : acts){
            if (act instanceof Artist){
                if (artist.equals(act)) return true;
            }
            else if (act instanceof Band){
                for (Artist artist1 : ((Band) act).getArtists()){
                    if (artist.equals(artist1)) return true;
                }
            }
        }
        return false;
    }
}
