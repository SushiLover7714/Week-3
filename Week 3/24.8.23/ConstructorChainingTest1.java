class A {
    A() {
        System.out.print("A");
    }

    A(int x) {
        this();
        System.out.print(x);
    }
}

class B extends A {
    B() {
        super(5);
        System.out.print("B");
    }

    B(int y) {
        this();
        System.out.print(y);
    }
}

public class ConstructorChainingTest1 {
    public static void main(String[] args) {
        B b = new B(10);
    }
}

// A5B10