public abstract class Student {
    private String firstName, lastName, Major;
    private int Age;
    private int ID;
    private float GPA;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMajor() {
        return this.Major;
    }

    public int getAge() {
        return this.Age;
    }

    public int getID() {
        return this.ID;
    }

    public float getGPA() {
        return this.GPA;

    }

    public abstract void showInformation();

}