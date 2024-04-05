
public class PermanentEmployee extends Employee{
    private double basicPay;
    private double hra;
    private int experience;

    public double getBasicPay(){
        return basicPay;
    }
    public void setBasicPay(double basicPay){
        this.basicPay = basicPay;
    }
    public double getHra(){
        return hra;
    }
    public void setHra(double hra){
        this.hra = hra;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public void calculateSalary(){
        double variableComp = 0;
        if(experience<3){
            variableComp = 0;
        }
        else if(experience>=3 && experience<5){
            variableComp = (5*basicPay)/100;
        }
        else if(experience>=5 && experience<10){
            variableComp = (7*basicPay)/100;
        }
        else if(experience>=10){
            variableComp = (12*basicPay)/100;
        }
        setSalary(variableComp + basicPay + hra);
    }

}
