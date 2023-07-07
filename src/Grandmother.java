 public class Grandmother {
    private String name;
    private int age;

    public Grandmother(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getInfo(){
        return "\nName: " + name + "\nAge: " + age;
    }
}