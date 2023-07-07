class Mother extends Grandmother {
    private int salary;
    private String hobby;

    public Mother(String name, int age, int salary, String hobby) {
        super(name, age);
        this.salary = salary;
        this.hobby = hobby;
    }

    public int getSalary() {
        return salary;
    }

    public String getHobby() {
        return hobby;
    }

    public String getInfo() {
        return super.getInfo() +
                "\nHobby: " + hobby +
                "\nSalary: " + salary;
    }
}
