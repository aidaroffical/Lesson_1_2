public final class Daughter extends Mother {
    private final int student;

    public Daughter(String name, int age, int student, String hobby) {
        super(name, age, student, hobby);
        this.student = student;
    }

    public int getStudent() {
        return student;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nStudent: " + getStudent();
    }
}
