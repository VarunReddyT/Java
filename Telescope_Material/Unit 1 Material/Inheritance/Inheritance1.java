/*program to illustrate single inheritance 
sample input and output as follows:
Enter Employee Id :                                                                                                     
101                                                                                                                     
Enter Employee Name:                                                                                                    
ram                                                                                                                     
Enter Employee Salary:                                                                                                  
20000                                                                                                                   
Enter Registration No.:                                                                                                 
4889                                                                                                                    
Enter Company Name:                                                                                                     
virtusa                                                                                                                 
Employee Id :101                                                                                                        
Employee Name :ram                                                                                                      
Employee Salary :20000.0                                                                                                
Registration No. :4889                                                                                                  
Company Name :virtusa                                                                                                   
*/
import java.util.Scanner;

    class Employee
    {

        Scanner sc;
        int id;
        String name;
        double sal;

        void getData()
        {
            sc=new Scanner(System.in);

            System.out.println("Enter Employee Id :");
            //read id
            id=sc.nextInt();

            System.out.println("Enter Employee Name:");
            //read name 
            name=sc.next();
            System.out.println("Enter Employee Salary:");
            //read sal
            sal=sc.nextDouble();
            
        }

        void putData()
        {
            System.out.println("Employee Id :"+id);
            System.out.println("Employee Name :"+name);
            System.out.println("Employee Salary :"+sal);
        }
    }
//make Company as subclass of Employee
    class Company extends Employee
    {
        int regNo;
        String cName;
        void readData()
        {
         
            System.out.println("Enter Registration No.:");
            //read regNo
		regNo=sc.nextInt();

            System.out.println("Enter Company Name:");
            cName=sc.next();
        }

        void writeData()
        {
            System.out.println("Registration No. :"+regNo);
            System.out.println("Company Name :"+cName);
        }
    }

    class Inheritance1
    {
        public static void main(String args[])
        {
            
            Company c = new Company();
           
            c.getData();
            c.readData();
            
            c.putData();
            c.writeData();
        }
    }
            