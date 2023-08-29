public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 3.7);
        Student student2 = new Student("Bob", 19, 3.0);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getGPA());
        System.out.println(student1.getScholarshipStatus());

        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getGPA());
        System.out.println(student2.getScholarshipStatus());

        student1.setName("Mabel");
        student1.setAge(22);
        student1.setGPA(3.4);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getGPA());
        System.out.println(student1.getScholarshipStatus());

    }
}
