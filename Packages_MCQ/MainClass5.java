// What will be the output of the program?

// Options:

// A) 10 20 30 40
// 50 20 30 40   // ^ Correct Answer

// B) Compilation error

// C) 10 20 30 40
// 10 20 30 40

// D) 10 20 30 40
// 10 20 30 50     

package pack1;

class A {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    void display() {
        System.out.println(privateVar + " " + defaultVar + " " + protectedVar + " " + publicVar);
    }

    protected void changePrivateVar(int newValue) {
        privateVar = newValue;
    }
}

public class MainClass5 {
    public static void main(String[] args) {
        A obj = new A();
        
        obj.display();
        
        // Change the value of privateVar
        obj.changePrivateVar(50);
        
        // Display the values again
        obj.display();
    }
}


