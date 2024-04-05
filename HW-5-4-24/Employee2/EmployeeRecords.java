// A construction company wants to keep a record of the employees working in it. There are permanent employees as well as contract employees. Contract employees work on an hourly basis whereas permanent employees are paid monthly salary. 
public class EmployeeRecords{
    private int empId;
    public String name;
    private double salary;

    public EmployeeRecords(int empId, String name, double salary){
        setEmpId(empId);
        setName(name);
        setSalary(salary);
    }

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
        PermanentEmployee p1 = new PermanentEmployee(101, "Anil", 10000, 1500, 3);  // HRA - House Rent Allowance
        ContractEmployee c1 = new ContractEmployee(2, "Ashok", 100, 10);

        System.out.println("Permanent Employee - " + p1.getName() +" : Your salary is : " + p1.getSalary());
        
        System.out.println("Contract Employee - " + c1.getName() + ": Your salary is : " + c1.getSalary());

    }
}
