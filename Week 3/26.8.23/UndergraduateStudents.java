public class UndergraduateStudents extends Student {
    public UndergraduateStudents(String firstName, String lastName, String Major, int Age, int ID, float GPA) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setMajor(Major);
        super.setAge(Age);
        super.setID(ID);
        super.setGPA(GPA);

    }

    public void showInformation() {
        System.out.println(
                "\n Name: " + super.getFirstName() + " " + super.getLastName() + " " + "(" + getID() + ")" + " - "
                        + "Undergraduate");
        System.out.println(
                "Age: " + super.getAge() + " " + "Grade:" + super.getGPA() + " " + " Major: " + super.getMajor()
                        + "\n");
    }
}
