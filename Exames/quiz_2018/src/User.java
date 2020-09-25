import java.util.Objects;

public class User extends Person{
    private String username;

    public User(String name) {
        super(name);
        this.username = name;
    }

    public User(String name, int age) {
        super(name, age);
        username = name + Integer.toString(age);
    }

    public String getUsername() {
        return username;
    }

}
