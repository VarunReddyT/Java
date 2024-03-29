// Type Casting in Java
// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte

// Widening Casting
class TypeCasting3 {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double (Widening Casting)
        //int myInt = (int) myDouble; // Manual casting: double to int (Narrowing Casting)

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}

// Note: When you convert a larger type to a smaller type, you must use explicit casting. This is also known as narrowing casting.
// Note: You should also be careful when using floating point numbers, when you convert a floating point number to an integer, the number will be rounded.
// Note: When you convert a string to a number, the string must be a number (e.g. "10", or "10.1"). Otherwise, you will get an error.
// Note: You can also use the Math.round() method to round a number to the nearest whole number (integer). This method returns a long value so you need to cast it back to an int. Example: