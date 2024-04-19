// What will be the output of the program?

// Options:

// A) A
// B) B
// C) Compilation error  
// D) A followed by B   // ^ Correct Answer

package pack1;

class A {
    protected static String s = "A";

    static void display() {
        System.out.println(s);
    }
}

class B extends A {
    protected static String s = "B";

    static void display() {
        System.out.println(s);
    }
}

class C extends B {
    static void methodOfC() {
        System.out.println(A.s);
        B.display();
    }
}

public class MainClass4 {
    public static void main(String[] args) {
        C.methodOfC();
    }
}

