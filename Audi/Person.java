public class Person {
    String name;
    int age;
    String gender;
    void applyForPostGraduation(Student a){
        System.out.println(a.name);
        if(a.cgpa > 8 && a.year >=4){
            System.out.println("CGPA : "+a.cgpa+", Year : "+a.year);
            System.out.println("Graduated! Can apply for the job");
        }
        else if(a.year < 4){
            System.out.println("Year : "+a.year);
            System.out.println("Not graduated yet");
        }
        else{
            System.out.println("CGPA : "+a.cgpa);
            System.out.println("Not enough cgpa");
        }
    }
    public static void main(String[] args) {
        
        Person p = new Person();
        Student s = new Student("Varun Reddy",22,"Male","A","CSE",4,new int[]{90,80,70,90});
        Student s1 = new Student("Bob",22,"Male","C","IT",4,new int[]{60,80,70,34});
        Student s2 = new Student("Chinnu",22,"Male","D","CSM",2,new int[]{60,85,30,34});
        p.applyForPostGraduation(s);
        p.applyForPostGraduation(s1);
        p.applyForPostGraduation(s2);
    }
}
