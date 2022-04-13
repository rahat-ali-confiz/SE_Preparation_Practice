package Assignments.OOP;

import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args ){

        HRM employee = new HRM();
        Scanner in = new Scanner(System.in);
        int command;
        char choice;
        System.out.println("""
                Welcome Aboard...
                ************************************************************************************************

                """);
        System.out.println("Welcome to Human Resource Management (HRM) Software of Company XYZ. " +
                "To do the specific task please choose one " +
                "of the following commands\n");
        do{
            System.out.println("""
                    1. Add new Employee
                    2. Delete Employee Information
                    3. Update Employee Information
                    4. Quit""");
            command =in.nextInt();
            if(command==1){
                    do{
                        employee.addEmployee();
                        employee.employeeListing();
                        System.out.print("Do you want to add add another Employee(Y/N): ");
                        choice = in.next().charAt(0);
                    }while(choice=='y' || choice=='Y');

            }
            else if(command==2){
                do{
                    employee.deleteEmployee();
                    employee.employeeListing();
                    System.out.print("Do you want to Delete another Record (Y/N):");
                    choice= in.next().charAt(0);
                }while(choice=='y' || choice=='Y');

            }
            else if (command == 3){
                do{
                    employee.updateEmployee();
                    employee.employeeListing();
                    System.out.print("Do you want to update another field (Y/N):");
                    choice= in.next().charAt(0);
                }while(choice=='y' || choice=='Y');
            }
        }while(command!=4);
    }
}
