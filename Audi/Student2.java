class Student2 extends Person2{
    String section;
    String department;
    int year;
    int[] currentYearGrades;
    float cgpa;
    Student2(String name, int age, String gender, String section, String department, int year,int[] currentYearGrades){
        this.name = name;
        this.age =age;
        this.gender = gender;
        this.section = section;
        this.department = department;
        this.year = year;
        this.currentYearGrades = currentYearGrades;
        this.cgpa = calculateCGPA(currentYearGrades);
    }
    float calculateCGPA(int[] currentYearGrades){
        int sum = 0;
        for(int i = 0; i < currentYearGrades.length; i++){
            sum += currentYearGrades[i];
        }
        float percentage = ((sum*100) / (currentYearGrades.length * 100));
        float finalcgpa = (percentage / 9.5f);
        return finalcgpa;
    }
}

