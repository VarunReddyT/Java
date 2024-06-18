import java.util.Comparator;
import java.util.List;
import java.util.ArrayList; 

public class EmployeeSort {

    public static class salaryFilter implements Comparator<Object>{
        public int compare(Object o1, Object o2){
            Employee e1 = (Employee)o1;
            Employee e2 = (Employee)o2;
            return (int)(e1.salary - e2.salary);
        }
        }
        
        public static class NameFilter implements Comparator<Object>{
        public int compare(Object o1, Object o2){
            Employee e1 = (Employee)o1;
            Employee e2 = (Employee)o2;
            return e1.name.compareTo(e2.name);
        }
        }
        
        public static class Employee implements Comparable<Employee>{
        int id;
        String name;
        int age;
        double salary;
        public Employee(int id, String name, int age, double salary){
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
        @Override
        public int compareTo(Employee e){
            return this.age - e.age;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + age + " " + salary;
        }
    }
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(5,"John",25,90000));
        list.add(new Employee(3,"Quallis",22,30000));
        list.add(new Employee(1,"Bob",30,70000));
        list.sort(new NameFilter());
        System.out.println(list);
    }
}
