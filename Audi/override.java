public class override {
    public static void main(String[] args) {
        tester t = new tester();
        System.out.println(t.m1("Hello"));
    } 
}

class tester{
    String m1(String s1){
        System.out.println(s1);
        return "Parent";
    }
}
class test extends tester{
    String m1(String s1){
        System.out.println(s1);
        return "Child";
    }
}