public class Person {
    private String name;
    private int age;
    private float accountBal;

    public Person(String name, int age, float accountBal) {
        this.name = name;
        this.age = age;
        this.accountBal = accountBal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountBal(float accountBal) {
        this.accountBal = accountBal;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getAccountBal() {
        return this.accountBal;
    }
}
