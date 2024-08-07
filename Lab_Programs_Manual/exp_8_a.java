// 8. a. Write a java program to store the employee details in an ArrayList and display the employee details in ascending order of their experience. Create 'Employee' class with two instance variables Employee name and Employee experience (no. of years).
import java.util.*;
public class exp_8_a {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("John",5));
        arr.add(new Employee("Nic",3));
        arr.add(new Employee("Roma",9));

        System.out.println("List before sorting");
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i).toString());
        }
        Collections.sort(arr,new SortByExp());
        System.out.println("List after sorting");
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i).toString());
        }
    }
}

class Employee{
    String empname;
    int exp;
    Employee(String empname,int exp){
        this.empname = empname;
        this.exp = exp;
    }
    public String toString(){
        return this.empname + " " + this.exp;
    }
}
class SortByExp implements Comparator<Employee>{
    public int compare(Employee a, Employee b){
        return a.exp - b.exp;
    }
}