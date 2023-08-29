public class EncapsulationTest {
    public static void main(String[] args) {
        Person person1 = new Person("John", 22, 2000.0f);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAccountBal());
        person1.setName("Mike");
        person1.setAge(27);
        person1.setAccountBal(4000.f);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAccountBal());
    }
}
