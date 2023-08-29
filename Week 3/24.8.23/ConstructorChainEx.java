public class ConstructorChainEx {
    public static void main(String[] args) {
        C c1 = new C();

    }

}

class A {
    public A() {
        System.out.print("A");
    }
}

class B extends A {
    public B() {
        System.out.print("B");
    }
}

class C extends B {
    public C() {
        System.out.print("C");
    }
}