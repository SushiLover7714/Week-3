public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog(5, "Toby");
        Animal animal2 = new Cat(6, "Mister");
        Animal animal3 = new Pig(2, "Lizz");
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }

}

class Animal {
    int age = 0;
    String name = "";

    public void makeSound() {
        System.out.println("Animal makes a sound");

    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog makes a sound");
    }

    Dog(int age, String name) {
        super.age = age;
        super.name = name;
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat makes a sound");
    }

    Cat(int age, String name) {
        super.age = age;
        super.name = name;
    }
}

class Pig extends Animal {
    Pig(int age, String name) {
        super.age = age;
        super.name = name;
    }
}