
public class nestedTry {
    public static void main(String[] args) {
        try{
            int i = 10/10;
            System.out.println("No error occured");
        }
        finally{
            System.out.println("Finally block executed");
            try{
                throw new ArithmeticException();
            }
            finally{
                System.out.println("King is great");
            }
        }
        // System.out.println("End of the program");  Unreachable code
    }
}
