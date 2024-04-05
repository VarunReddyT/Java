// A construction company wants to keep a record of the employees working in it. There are permanent employees as well as contract employees. Contract employees work on an hourly basis whereas permanent employees are paid monthly salary. 
public class Employee{
    private int empId;
    public String name;
    private double salary;

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee();
        p1.setName("Anil");
        p1.setEmpId(101);
        p1.setBasicPay(10000);
        p1.setHra(1500);
        p1.setExperience(3);
        p1.calculateSalary();

        System.out.println("Permanent Employee - " + p1.getName() +" : Your salary is : " + p1.getSalary());
        
        ContractEmployee c1 = new ContractEmployee();
        c1.setName("Ashok");
        c1.setEmpId(102);
        c1.setWages(100);
        c1.setHours(10);
        c1.calculateSalary();
        
        System.out.println("Contract Employee - " + c1.getName() + ": Your salary is : " + c1.getSalary());

    }
}
