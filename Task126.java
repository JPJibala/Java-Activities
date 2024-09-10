abstract class abstractClass {
    abstract void abstractMethod();  // abstract method
    void concreteMethod() {  // concrete method
        System.out.println("This is a concrete method.");
    }
}

// Class B implementing abstractMethod
class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

// Class C implementing abstractMethod
class C extends abstractClass {
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Task126 {
    public static void main(String args[]) {
        // Instantiate class B
        B b = new B();
        b.abstractMethod();  // Calls B's implementation
        b.concreteMethod();  // Calls inherited concreteMethod

        // Instantiate class C
        C c = new C();
        c.abstractMethod();  // Calls C's implementation
        c.concreteMethod();  // Calls inherited concreteMethod
    }
}
