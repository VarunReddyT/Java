
public class ContractEmployee extends Employee{
    private double wages;
    private int hours;
    
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
