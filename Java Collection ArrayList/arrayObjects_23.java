// 23. Write a Java program to ArrayList of user defined objects

import java.util.ArrayList;


public class arrayObjects_23 {
    static class Student{
        int id;
        String name;

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "A"));
        list.add(new Student(2, "B"));
        list.add(new Student(3, "C"));
        list.add(new Student(4, "D"));
        list.add(new Student(5, "E"));

        for(Student s : list){
            System.out.println(s.id + " " + s.name);
        }
    }
}
