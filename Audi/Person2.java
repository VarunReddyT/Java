public class Person2{
    String name;
    int age;
    String gender;
    void applyForPostGraduation(Student2 a){
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
        
        Person2 p = new Person2();
        Student2 s = new Student2("Varun Reddy",22,"Male","A","CSE",4,new int[]{90,80,70,90});
        Student2 s1 = new Student2("Bob",22,"Male","C","IT",4,new int[]{60,80,70,34});
        Student2 s2 = new Student2("Chinnu",22,"Male","D","CSM",2,new int[]{60,85,30,34});
        p.applyForPostGraduation(s);
        p.applyForPostGraduation(s1);
        p.applyForPostGraduation(s2);
    }
}
