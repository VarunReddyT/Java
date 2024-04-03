// Create a university management system where you have scholarship students and normal students , every student should be able to calculate his CGPA and can apply for PostGraduation only if he is in 4th year and have more than 8.0 CGPA. A student is eligible for scholarship only if his CGPA is more than 9.0 . The student should be able to pay the fees based on his academic year , the fees would be half for scholarship students. 
// Election is around the corner we will make sure all students who have paid fees and have indian nationailty are allowed to vote. 
// Create a system where you can create 3 scholarship students 
// 1. Pragnya - Indian - 3rd year , 8.9 current CGPA 
// 2. Sameul - African - 2nd year , 7.2 current CGPA 
// 3. Tikku - Indian - 4th year , 9.2 current CGPA
//  and 3 students of the following details 
// 1. pankaj  - indonesian , 4 , 8.8
// 2. jim - Canadian , 3rd , 8.9 
// 3. Seema - Indian , 4 , 9.9

// Check if these students can Vote or not and in case they cant so ask them to pay their due fees and make them vote

import java.util.Scanner;
class University{
    private static void studentFunc(Student student,Scanner scanner) {
        // student.calculatePercentage(); // Updates cgpa based on grades
        System.out.println("Student: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
        // student.canTalk();
        // student.canWalk();
        System.out.println("Enter 1 to pay fees, 0 to skip: ");
        System.out.println("Fees: " + student.getFees());
        int choice = scanner.nextInt();
        if(choice == 1) {
            System.out.println("Enter the fees amount: ");
            double tempFees = scanner.nextDouble();
            student.payFees(tempFees);
        }
        double fee = student.getFees();
        System.out.println("Nationality: " + student.getNationality());
        System.out.println("Age: " + student.getAge());
        student.canVote(fee);
        System.out.println("Year: " + student.getYear());
        if(student.applyForPostGraduate()) {
            System.out.println("Eligible for Post Graduation");
        } else {
            System.out.println("Not eligible for Post Graduation");
        }
        System.out.println("--------------------------------------------");
    }

    private static void studentScholarFunc(ScholarshipStudent student, Scanner scanner) {
        // student.calculatePercentage();
        System.out.println("Undergraduate Student: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
        // student.canTalk();
        // student.canWalk();
        System.out.println("Enter 1 to pay fees, 0 to skip: ");
        System.out.println("Fees: " + student.getFees());
        int choice = scanner.nextInt();
        if(choice == 1) {
            System.out.println("Enter the fees amount: ");
            double tempFees = scanner.nextDouble();
            student.payFees(tempFees);
        }
        double fee = student.getFees();
        System.out.println("Nationality: " + student.getNationality());
        System.out.println("Age: " + student.getAge());
        student.canVote(fee);
        System.out.println("Eligible for scholarship: " + student.isEligible());
        System.out.println();
        student.setEligible(false);
        System.out.println("Updated Eligibility for Scholarship: " + student.isEligible());
        System.out.println("Year: " + student.getYear());
        if(student.applyForPostGraduate()) {
            System.out.println("Eligible for Post Graduation");
        } else {
            System.out.println("Not eligible for Post Graduation");
        }
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] PragnyaGrades = { 8, 9, 7 };
        ScholarshipStudent Pragnya = new ScholarshipStudent("Pragnya", 21, "Female", 55.0, "Indian", 3, 'B', 8.9,
                PragnyaGrades);
        studentScholarFunc(Pragnya,scanner);
        

        int[] SameulGrades = { 9, 8, 9 };
        ScholarshipStudent Sameul = new ScholarshipStudent("Sameul", 20, "Male", 70.5, "African", 2, 'A', 7.2,
                SameulGrades);
        studentScholarFunc(Sameul,scanner);


        int[] TikkuGrades = { 6, 8, 7 };
        ScholarshipStudent Tikku = new ScholarshipStudent("Tikku", 22, "Male", 60.5, "Indian", 4, 'A', 9.2,
                TikkuGrades);
        studentScholarFunc(Tikku,scanner);


        int[] PankajGrades = { 5, 9, 7 };
        Student Pankaj = new Student("Pankaj", 22, "Male", 60.5, "Indonesian", 4, 'A', 8.8, PankajGrades);
        studentFunc(Pankaj,scanner);


        int[] JimGrades = { 8, 5, 9 };
        Student Jim = new Student("Jim", 21, "Male", 60.5, "Canadian", 3, 'C', 8.9, JimGrades);
        studentFunc(Jim,scanner);

        
        int[] SeemaGrades = { 7, 8, 7 };
        Student Seema = new Student("Seema", 22, "Female", 60.5, "Indian", 4, 'A', 9.9, SeemaGrades);
        studentFunc(Seema,scanner);
    }
}