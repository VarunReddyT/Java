// Dynamic Polymorphism - Method overriding, also known as runtime polymorphism, is a feature that allows a subclass to provide a specific implementation of a method that is already provided by its superclass or parent class. When a subclass overrides a method, the subclass version of the method is called at runtime instead of the superclass version. This allows the subclass to define its own behavior for the method, which can be different from the behavior defined in the superclass.

public class Polymorphism13 {
    public class Bank {
        float getRateOfInterest() {
            return 0;
        }
    }

    public class SBI extends Bank {
        float getRateOfInterest() {
            return 8.4f;
        }
    }

    public class ICICI extends Bank {
        float getRateOfInterest() {
            return 7.3f;
        }
    }

    public class AXIS extends Bank {
        float getRateOfInterest() {
            return 9.7f;
        }
    }


    // public static void main(String args[]) {
    //     Bank b;
    //     b = new SBI();
    //     System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
    //     b = new ICICI();
    //     System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
    //     b = new AXIS();
    //     System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    // }

}
