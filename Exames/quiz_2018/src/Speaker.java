public class Speaker extends User {
    private int fee;

    public Speaker(String name) {
        super(name);
        this.fee = 0;
    }

    public Speaker(String name, int age) {
        super(name, age);
        this.fee = 0;
    }

    public int getFee() {
        return this.fee;
    }

    public String toString(){
        return "Speaker " + getName() + " has a fee value of " + fee + ".";
    }
}
