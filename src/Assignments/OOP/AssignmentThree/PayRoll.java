package Assignments.OOP.AssignmentThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayRoll {

    public static void main(String[] args){
        Employee employeeInfo;

        List simpleList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        char employeeType;
        Scanner in = new Scanner(System.in);
        System.out.print("How many Employee's Data you want to enter: ");
        int noOfEmployee = in.nextInt();

        for(int i=0;i<noOfEmployee;i++){
            System.out.print("Enter Choice: S for SalariedEmployee, H for HourlyEmployee: ");
            employeeType = in.next().charAt(0);

            if (employeeType=='S' || employeeType == 's'){

                employeeInfo = new SalariedEmployee();
                employeeInfo = employeeInfo.addInfo();
                employeeList.add(employeeInfo);

            }
            else if(employeeType=='H' || employeeType=='h'){
                employeeInfo = new HourlyEmployee();
                employeeInfo = employeeInfo.addInfo();
                employeeList.add(employeeInfo);
            }
        }

        for (Employee employee : employeeList) {
            employee.print();
            System.out.println();
        }
    }
}
