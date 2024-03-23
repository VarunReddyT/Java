class University {
    public static void main(String[] args) {
        // Exercise 1: Create a regular student
        int[] studentGrades = {8, 9, 7}; // Example grades
        Student student = new Student("Alice", 21, "Female", 55.0, "Indian", 2023, 'B', 8.5, studentGrades);
        student.calculatePercentage();  // Updates cgpa based on grades
        System.out.println("Student: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
        student.canTalk();
        student.canWalk();
        student.canVote();
        System.out.println();

        // Exercise 2: Create an undergraduate student
        int[] undergradGrades = {9, 8, 9}; // Example grades
        ScholarshipStudent undergradStudent = new ScholarshipStudent("Bob", 20, "Male", 70.5, "Indian", 2022, 'A', 9.2, undergradGrades);
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
    }
}