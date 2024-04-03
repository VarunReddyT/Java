class ScholarshipStudent extends Student {
    private boolean isEligible;
    private double fees;

    // Constructor
    public ScholarshipStudent(String name, int age, String gender, double weight, String nationality, int year,
            char section, double cgpa, int[] noOfGrades) {
        super(name, age, gender, weight, nationality, year, section, cgpa, noOfGrades);
        this.fees = calculateFees(year);
        this.isEligible = checkEligibilityForScholarship(cgpa, nationality);
    }

    private double calculateFees(int year) {
        double fee = super.getFees();
        return (fee/2);
    }

    // Method to check eligibility for scholarship
    private boolean checkEligibilityForScholarship(double cgpa, String nationality) {
        return cgpa > 9.0 && (nationality.equalsIgnoreCase("Indian"));
    }

    // Setter for isEligible attribute
    public void setEligible(boolean isEligible) {
        if (isEligible && checkEligibilityForScholarship(getCgpa(), getNationality())) {
            this.isEligible = true;
        } else {
            this.isEligible = false;
        }
    }

    // Getter for isEligible attribute
    public boolean isEligible() {
        return isEligible;
    }

    public double getFees() {
        return fees;
    }

    public void payFees(double amount) {
        this.fees -= amount;
        if (fees <= 0) {
            System.out.println("Fees paid successfully.");
        } else {
            System.out.println("Fees pending: " + fees);
        }
    }
}
/*
 * Renewal of Scholarship: Implement a method to renew the scholarship annually
 * based on certain criteria like maintaining a minimum GPA or fulfilling
 * specific academic requirements.
 * 
 * Scholarship Benefits: Include methods to display the benefits of the
 * scholarship, such as financial assistance, access to special programs, or
 * academic resources.
 * 
 * Scholarship Application: Develop a method for scholarship students to apply
 * for additional scholarships or grants within the university or externally.
 * 
 * Scholarship Termination: Implement a method to terminate the scholarship if
 * the student fails to meet the renewal criteria or violates the terms and
 * conditions of the scholarship.
 */