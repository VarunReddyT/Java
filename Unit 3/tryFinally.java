public class tryFinally {
    public static void main(String[] args) {
        try{
            int i = 10/10;
            System.out.println("No error occured");
        }
        finally{
            System.out.println("Finally block executed");
            throw new ArithmeticException();
        }
        // System.out.println("End of the program");   Unreachable code
    }
}
