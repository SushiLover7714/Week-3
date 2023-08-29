class Parent {
    Parent() {
        System.out.print("Parent");
    }

    Parent(int x) {
        this();
        System.out.print(x);
    }
}

class Child extends Parent {
    Child() {
        super(5);
        System.out.print("Child");
    }

    Child(int y) {
        this();
        System.out.print(y);
    }
}

public class ConstructorChainingTest3 {
    public static void main(String[] args) {
        Child child = new Child(10);
    }
}
// Parent5Child10