
public class ContractEmployee extends Employee{
    private double wages;
    private int hours;
    ContractEmployee(int empId, String name, double wages, int hours){
        super(empId, name, 0);
        setWages(wages);
        setHours(hours);
        calculateSalary();
    }
    public double getWages(){
        return wages;
    }
    public void setWages(double wages){
        this.wages = wages;
    }
    public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    public void calculateSalary(){
        setSalary(wages*hours);
    }
}
