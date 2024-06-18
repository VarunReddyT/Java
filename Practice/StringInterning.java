// String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.

public class StringInterning{
    public static void main(String[] args) {
        String s = "hello",s1 = "hello";
        String s2 = s+s1;
        String s3 = s+s1;
        // String s3=s2;
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2.equals(s3));
        // System.out.println(s3.equals(s2));
    }
}