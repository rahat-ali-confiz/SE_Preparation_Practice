package Courses.OOP.AssignmentThree;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
    private int hours;
    private int wage = 400;
    private double salary;

    public HourlyEmployee addInfo(){
        Scanner in = new Scanner(System.in);

        HourlyEmployee employee = new HourlyEmployee();
        System.out.print("Enter Name: ");
        String name = in.next();
        employee.setName(name);
        System.out.print("Enter Age: ");
        int age = in.nextInt();
        employee.setAge(age);
        System.out.print("Enter Hours: ");
        employee.hours = in.nextInt();
        System.out.print("Enter Wage: ");
        employee.wage = in.nextInt();

        return employee;
    }

    public double calculateSalary(){
        if(hours <= 40){
            salary = wage*hours;
        }
        else
        {
            salary = (40*wage) +((hours-40)*wage*1.5);
        }
        return salary;
    }
    public void print(){
        System.out.print("Displaying Employee's Information\n" +
                "************************************\n" +
                "Employee's Name: "+getName()+"\n"+
                "Employee's Age: "+getAge()+"\n" +
                "Hourly Employee's Salary: "+calculateSalary());
    }
}
