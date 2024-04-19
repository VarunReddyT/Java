
// What will be the output of the program?

// Options:

// A) Compilation error
// B) 15 25 35 45   // ^ Correct Answer
// C) 0 25 35 45
// D) Runtime error

package pack1;

class A {
    private int privateVar = 15;
    int defaultVar = 25;
    protected int protectedVar = 35;
    public int publicVar = 45;

    void display() {
        System.out.println(privateVar + " " + defaultVar + " " + protectedVar + " " + publicVar);
    }
}

public class MainClass6 {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}

