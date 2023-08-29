class Base {
    Base() {
        System.out.print("Base");
    }

    Base(int x) {
        this();
        System.out.print(x);
    }
}

class Derived extends Base {
    Derived() {
        super(5);
        System.out.print("Derived");
    }

    Derived(int y) {
        this();
        System.out.print(y);
    }
}

public class ConstructorChainingTest2 {
    public static void main(String[] args) {
        Derived derived = new Derived(10);
    }
}

// Base5derived10