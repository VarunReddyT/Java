public class Final7 {
    public static void main(String[] args) {
        // A float value should end with an F
        float PI = 3.14F;
        PI = 3.15F;
        System.out.println(PI);
        // We can change the value of this variable. But to make it constant we can use the final keyword

        // The final keyword is used to make a variable constant. Once a final variable has been assigned, it always contains the same value.

        final float PI2 = 3.14F;
        // PI2 = 3.15F; // This will give an error
        System.out.println(PI2);
    }
}
