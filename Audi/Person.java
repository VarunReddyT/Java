public class Person {
    String name;
    byte age;
    String gender;

    void canTalk(){
        System.out.println("I can talk");
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Varun Reddy";
        s.age = 20;
        s.gender = "Male";
        s.section = "A";
        s.department = "CSE";
        s.currentYearGrades = new int[]{90, 80, 70, 90};
        s.calculatePercentage(s.currentYearGrades);
    }
}
