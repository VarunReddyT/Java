import java.util.Arrays;

public class comparable_student{
    static class Student implements Comparable<Student>{
        int id;
        String name;
        float GPA;
        public Student(int id, String name, float GPA){
            this.id = id;
            this.name = name;
            this.GPA = GPA;
        }
        @Override
        public int compareTo(Student s){
            if (this.GPA > s.GPA) {
                return 1;
            } else if (this.GPA < s.GPA) {
                return -1;
            } else {
                return 0;
            }
        }

    }
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student(1, "John", 9.8f);
        students[1] = new Student(2, "Jane", 7.8f);
        students[2] = new Student(3, "Jack", 6f);

        Arrays.sort(students);
        for (Student s : students){
            System.out.println(s.name + " " + s.GPA);
        }
        
    }
}