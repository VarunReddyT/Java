// Exception Propagation
// The process of forwarding the exception from the calling method to the called method is called exception propagation.
// Exception propagation refers to movement of exception event from nested try or nested methods calls.

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    static void m1() {
        m2();
    }
    static void m2() {
        m3();
    }

    static void m3() {
        int a = 10;
        int b = 0;
        int c = a / b;
        try{
            System.out.println("Result: " + c);
        }
        catch(Exception e){
            System.out.println("Hello");
        }
    }
}
