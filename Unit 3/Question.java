// Create a file named employee.txt
// Meena,23,WaterDept,2300
// Sheila,29,Accounts,40000
// Jim,45,Accounts,80000
// Naina,78,Water,90000
// Kiran,56,Houeskeeping,67000
// Read the file and reports user defined exceptions if 
// 1. Any employee is working in any department other than Water and Accounts
// 2. Any employee above 65
// 3. Any employee getting less than 10k

import java.util.*;
import java.io.*;


public class Question {
    public static void main(String[] args) throws IOException{
        File f = new File("employee.csv");
        FileReader f1 = new FileReader(f);
        BufferedReader br = new BufferedReader(f1);
        String line;
        while ((line = br.readLine()) != null) {
            String[] employeeData = line.split(",");
            String name = employeeData[0];
            int age = Integer.parseInt(employeeData[1]);
            String department = employeeData[2];
            int salary = Integer.parseInt(employeeData[3]);
            try{
                if (!department.equals("Water") && !department.equals("Accounts")) {
                    throw new InvalidDepartment();
                }
                if (age > 65) {
                    throw new InvalidAge();
                }
    
                if (salary < 10000) {
                    throw new InvalidSalary();
                }
                else{
                    System.out.println(name + " Approved");
                }
            }
            catch(Exception e){
                System.out.println(name + " - " + e.getMessage());
            }
        }
        br.close();
    }

    static class InvalidDepartment extends RuntimeException{
        @Override
        public String getMessage() {
            return "Wrong Department";
        }
    }

    static class InvalidAge extends RuntimeException{
        @Override
        public String getMessage() {
            return "Age is greater than 65";
        }
    }

    static class InvalidSalary extends RuntimeException{
        @Override
        public String getMessage() {
            return "Salary is less than 10000";
        }
    }
}
