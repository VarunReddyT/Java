public class Attendance {

    public static void main(String[] args) {
        Student s = new Student("Hari", 20, "male", "2nd", "CSE", 8.5f);
        Student s1 = new Student("SriHari", 20, "male", "2nd", "CSE", 8.5f);
        Student s2 = new Student("Seetha", 20, "female", "2nd", "CSE", 8.5f);
        Student s3 = new Student("Maneka", 20, "female", "2nd", "CSE", 8.5f);
        Student s4 = new Student("Sunith", 20, "male", "2nd", "CSE", 8.5f);
        Teacher t = new Teacher("Meenal", 55, "Female", "CSE", null, "Asst Prof");
        t.markAttendance(s, false);
        t.markAttendance(s1, true);
        t.markAttendance(s2, true);
        t.markAttendance(s3, true);
        t.markAttendance(s4, false);
    }
}

class Person {
    String name;
    int age;
    String gender;
    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Student extends Person {
    String year;
    String department;
    float cgpa;
    
    public Student(String name, int age, String gender, String year, String department, float cgpa) {
        super(name, age, gender);
        this.year = year;
        this.department = department;
        this.cgpa = cgpa;
    }
}

class Teacher extends Person {
    String department;
    String[] courses;
    String designation;
    
    public Teacher(String name, int age, String gender, String department, String[] courses, String designation) {
        super(name, age, gender);
        this.department = department;
        this.courses = courses;
        this.designation = designation;
    }
    
    public void markAttendance(Student student, boolean present) {
        // Here you can implement the logic to mark attendance
        if (present) {
            System.out.println(student.name + " is present.");
        } else {
            System.out.println(student.name + " is absent.");
        }
    }
}
