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