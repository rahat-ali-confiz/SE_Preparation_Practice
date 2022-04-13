package Courses.OOP.AssignmentThree;

import java.util.Scanner;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

        public SalariedEmployee addInfo(){
        Scanner in = new Scanner(System.in);
        SalariedEmployee salEmployee = new SalariedEmployee();
        System.out.print("Enter Name: ");
        String name = in.next();
        salEmployee.setName(name);
        System.out.print("Enter Age: ");
        int age = in.nextInt();
        salEmployee.setAge(age);
        System.out.print("Enter Salary: ");
        salEmployee.weeklySalary = in.nextDouble();

            return salEmployee;
        }
     public double calculateSalary(){
        return weeklySalary;
    }
     public void print(){
        System.out.print("Displaying Employee's Information\n" +
                            "************************************\n" +
                "Employee's Name: "+getName()+"\n"+
                "Employee's Age: "+getAge()+"\n" +
                "Salaried Employee's Salary: "+calculateSalary());
    }
}
