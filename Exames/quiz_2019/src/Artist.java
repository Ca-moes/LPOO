public class Artist extends Act{
    public Artist(String name, String country) {
        super(name, country);
    }

    public boolean equals(Object obj){
        if (obj instanceof Artist){
            return getName().equals(((Artist) obj).getName()) && getCountry().equals(((Artist) obj).getCountry());
        }
        return false;
    }

    public int hashCode(){
        return getName().length() + getCountry().length();
    }
}
