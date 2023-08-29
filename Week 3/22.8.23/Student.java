public class Student {
    private String name;
    private int age;
    private double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGPA() {
        return this.GPA;
    }

    public boolean getScholarshipStatus() {
        if (GPA >= 3.5) {
            return true;
        } else {
            return false;
        }

    }
}
