public class ExplictCastingTest {
    public static void main(String[] args) {

        // int num1 = 1;
        // float num2 = 1.1f;
        // num1 = num2; will cause error need to explict cast
        // num2 = num1; Downcasting
        // num1 = (int) num2; explict casting
        // System.out.println(num1);
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Animal animal2 = new Dog();
        animal1.makeSound();
        dog1 = (Dog) animal2;
        dog1.makeSound();
        // animal1 = dog1;
        // animal1.makeSound();
        // dog1 = (Dog) animal1; Animal cannot be casted into dog

    }

}

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");

    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}
