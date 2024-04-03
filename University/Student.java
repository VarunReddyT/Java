public class Student extends Person {
    private int year;
    private char section;
    private double cgpa;
    private int[] noOfGrades;
    private double fees;

    // Instance initializer
    {
        // Initializing noOfGrades array with default values
        noOfGrades = new int[0];
    }

    // Constructor
    public Student(String name, int age, String gender, double weight, String nationality, int year, char section, double cgpa, int[] noOfGrades) {
        super(name, age, gender, weight, nationality);
        this.year = year;
        this.section = section;
        this.cgpa = cgpa;
        this.noOfGrades = noOfGrades;
        this.fees = calculateFees(year);
        this.section = section;
    }

    // Method to calculate fees based on the year
    private double calculateFees(int year) {
        switch (year) {
            case 1:
                return 20000;
            case 2:
                return 30000;
            case 3:
                return 35000;
            case 4:
                return 40000;
            default:
                return 0; // No fees for other years
        }
    }

    public void calculatePercentage() {
        int totalGrades = 0;
        int totalPoints = 0;
   
        for (int grade : noOfGrades) {
            totalGrades += 1;
            totalPoints += grade * 10;
        }

        double updatedCgpa = (double) totalPoints / (totalGrades * 10); 

        this.cgpa = updatedCgpa;
    }


    public boolean applyForPostGraduate() {
        if (year == 4 && cgpa > 8.0) {
            return true;
        }
        return false;
    }

    public int getYear() {
        return year;
    }
    
    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
    public double getCgpa() {
        return cgpa;
    }

    public void payFees(double amount) {
        this.fees -= amount;
        if (fees <= 0) {
            System.out.println("Fees paid successfully.");
        } else {
            System.out.println("Fees pending: " + fees);
        }
    }

    // Override canVote method
    @Override
    public void canVote(double fee) {
        // Implement voting eligibility criteria specific to students if needed
        // For simplicity, let's keep the canVote method as it was before
        super.canVote(fee);
    }
}