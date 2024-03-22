class Student extends Person {
    String section;
    String department;
    int[] currentYearGrades;
    float cgpa;
    void calculatePercentage(int[] currentYearGrades){
        int sum = 0;
        for(int i = 0; i < currentYearGrades.length; i++){
            sum += currentYearGrades[i];
        }
        float percentage = ((sum*100) / (currentYearGrades.length * 100));
        System.out.println("Percentage : " + percentage);
    }
}

