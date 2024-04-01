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

class University {
    public static void main(String[] args) {
        // Exercise 1: Create a regular student
        int[] studentGrades = {8, 9, 7}; // Example grades
        Student student = new Student("Alice", 21, "Female", 55.0, "Indian", 4, 'B', 8.5, studentGrades);
        student.calculatePercentage();  // Updates cgpa based on grades
        System.out.println("Student: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
        student.canTalk();
        student.canWalk();
        student.canVote();
        System.out.println();

        // Exercise 2: Create an undergraduate student
        int[] undergradGrades = {9, 8, 9}; // Example grades
        ScholarshipStudent undergradStudent = new ScholarshipStudent("Bob", 20, "Male", 70.5, "Indian", 3, 'A', 9.2, undergradGrades,false);
        System.out.println("Undergraduate Student: " + undergradStudent.getName());
        System.out.println("CGPA: " + undergradStudent.getCgpa());
        undergradStudent.canTalk();
        undergradStudent.canWalk();
        undergradStudent.canVote();
        System.out.println("Eligible for scholarship: " + undergradStudent.isEligible());
        System.out.println();
        // Exercise 3: Update undergraduate student's scholarship eligibility
        undergradStudent.setEligible(false); // Change eligibility status
        System.out.println("Updated Eligibility for Scholarship: " + undergradStudent.isEligible());

        int[] undergradGrades2 = {6, 8, 7}; // Example grades
        ScholarshipStudent undergradStudent2 = new ScholarshipStudent("Dre", 20, "Male", 60.5, "Russian", 2, 'A', 9.7, undergradGrades2,false);
        undergradStudent2.calculatePercentage();
        System.out.println("Undergraduate Student: " + undergradStudent2.getName());
        System.out.println("CGPA: " + undergradStudent2.getCgpa());
        undergradStudent2.canTalk();
        undergradStudent2.canWalk();
        undergradStudent2.canVote();
        undergradStudent2.payFees(300);
        System.out.println("Eligible for scholarship: " + undergradStudent2.isEligible());
        System.out.println();
        // Exercise 3: Update undergraduate student's scholarship eligibility
        undergradStudent.setEligible(false); // Change eligibility status
        undergradStudent.setEligible(false);
        System.out.println("Updated Eligibility for Scholarship: " + undergradStudent.isEligible());

        int[] undergradGrades3 = {6, 8, 9}; // Example grades
        ScholarshipStudent undergradStudent3 = new ScholarshipStudent("Deepak", 20, "Male", 60.5, "West Indian", 2, 'A', 9.7, undergradGrades3,false);
        undergradStudent3.calculatePercentage();
        System.out.println("Undergraduate Student: " + undergradStudent3.getName());
        System.out.println("CGPA: " + undergradStudent3.getCgpa());
        undergradStudent3.canTalk();
        undergradStudent3.canWalk();
        undergradStudent3.canVote();
        System.out.println("Eligible for scholarship: " + undergradStudent3.isEligible());
        System.out.println();
        // Exercise 3: Update undergraduate student's scholarship eligibility
        undergradStudent.setEligible(false); // Change eligibility status
        System.out.println("Updated Eligibility for Scholarship: " + undergradStudent.isEligible());

        int[] undergradGrades4 = {9, 8, 7}; // Example grades
        ScholarshipStudent undergradStudent4 = new ScholarshipStudent("Jai", 20, "Male", 60.5, "Indian", 3, 'A', 9.7, undergradGrades4,false);
        undergradStudent2.calculatePercentage();
        System.out.println("Undergraduate Student: " + undergradStudent4.getName());
        System.out.println("CGPA: " + undergradStudent4.getCgpa());
        undergradStudent4.canTalk();
        undergradStudent4.canWalk();
        undergradStudent4.canVote();
        System.out.println("Eligible for scholarship: " + undergradStudent4.isEligible());
        System.out.println();
        // Exercise 3: Update undergraduate student's scholarship eligibility
        undergradStudent.setEligible(false); // Change eligibility status
        System.out.println("Updated Eligibility for Scholarship: " + undergradStudent.isEligible());

    }
}