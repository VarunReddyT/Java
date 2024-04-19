// What will be the output of the program?

// Options:
 
// A) 10 20 30 40  // ^ Correct Answer
// B) Compilation error  
// C) 0 20 30 40   
// D) Runtime error


package pack1;

class A {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    void display() {
        System.out.println(privateVar + " " + defaultVar + " " + protectedVar + " " + publicVar);
    }
}

public class MainClass3{
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
