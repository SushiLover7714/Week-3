import java.util.Scanner;

public class EnrollmentSystemMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, category, ID, Age;
        int i = 0;
        String firstName, lastName, Major;
        float GPA;

        Student[] Students = new Student[10];
        while (true) {
            System.out.println("Student Enrollment System");
            System.out.println("---------------------------");
            System.out.println("1. Add Students: ");

            System.out.println("2. Display Students");
            System.out.println("3. Display Students by category");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student category(1.Undergraduate,2.Graduate,3.PHD): ");
                    category = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter first name: ");
                    firstName = input.nextLine();
                    System.out.print("Enter last name: ");
                    lastName = input.nextLine();
                    System.out.print("Enter student ID: ");
                    ID = input.nextInt();
                    System.out.print("Enter age: ");
                    Age = input.nextInt();
                    System.out.print("Enter grade: ");
                    GPA = input.nextFloat();
                    input.nextLine();
                    System.out.print("Enter major: ");
                    Major = input.nextLine();

                    if (category == 1) {
                        Students[i] = new UndergraduateStudents(firstName, lastName, Major, Age, ID, GPA);
                        i++;
                        System.out.println("Added successfully");
                    } else if (category == 2) {
                        Students[i] = new GraduateStudents(firstName, lastName, Major, Age, ID, GPA);
                        System.out.println("Added successfully");
                        i++;
                    } else if (category == 3) {
                        Students[i] = new PHD(firstName, lastName, Major, Age, ID, GPA);
                        System.out.println("Added successfully");
                        i++;
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;

                case 2:
                    System.out.println("Displaying all students");
                    for (int j = 0; j < Students.length; j++) {
                        if (Students[j] != null) {
                            Students[j].showInformation();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student category to display (1. Undergraduate, 2. Graduate, 3. PhD): ");
                    category = input.nextInt();
                    for (int j = 0; j < Students.length; j++) {
                        if (category == 1 && Students[j] instanceof UndergraduateStudents) {
                            Students[j].showInformation();
                        } else if (category == 2 && Students[j] instanceof GraduateStudents) {
                            Students[j].showInformation();
                        } else if (category == 3 && Students[j] instanceof PHD) {
                            Students[j].showInformation();
                        }
                    }
                    break;

                case 4:
                    input.close();
                    System.out.println("Exiting");
                    System.exit(0);
            }
        }

    }
}
