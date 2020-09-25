public abstract class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object o){
        if (this == o) return true;

        if (o == null) return false;

        //if (getClass() != o.getClass()) return false;

        Person e = (Person) o;
        return getName().equals(e.getName());
    }

    public int hashCode(){
        return getName().length();
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return (getName().equals(p.getName())) ? 0 : 1;
    }
}
