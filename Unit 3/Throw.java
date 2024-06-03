public class Throw {
    public static void main(String[] args) {
        // Throw keyword
        // The throw keyword is used to explicitly throw an exception.
        try {
            throw new ArithmeticException("Arithmetic Exception");
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } 
        catch (Exception e) {
            System.out.println("Parent Exception: " + e);
        } 
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
