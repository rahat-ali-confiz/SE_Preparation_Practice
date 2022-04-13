package Courses.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRM {
    private final List<Person> personList = new ArrayList<>();
    private int currentEmp;
    final int size = 10;
    private int initialPersonalID = 824801;


    public boolean addEmployee() {
        if (currentEmp == size) {
            System.out.println("You have added the maximum number of Employees");
            return false;
        } else {
            addEmployeeInfo();
            return true;
        }

    }

    public boolean deleteEmployee() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the ID of Employee whom do you want to remove: ");
        int employeeId = in.nextInt();
        System.out.print("Do you really want to remove the Employee (Y/N)?: ");
        char delete = in.next().charAt(0);
        if (delete == 'n' || delete == 'N') {
            return false;
        } else {
            for (int i = 0; i < currentEmp; i++) {
                if (personList.get(i).getPersonalID() == employeeId) {
                    personList.remove(i);
                    --currentEmp;
                }
            }
            return true;
        }
    }

    public boolean updateEmployee() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Employee Id you want to modify : ");
        int employeeIdToUpdate = in.nextInt();
        System.out.println("""
                Please enter the related number of field you want to modify
                1. First Name
                2. Last Name
                3. Salary""");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                updateFirstName(employeeIdToUpdate);
                return true;
            case 2:
                updateLastName(employeeIdToUpdate);
                return true;
            case 3:
                updateSalary(employeeIdToUpdate);
                return true;
            default:
                return false;
        }
    }

    public void employeeListing() {
        System.out.println("First Name       Last Name       Personal ID       Salary per Year (Rupees)\n" +
                "------------     -----------     -------------     --------------------------");
        for (int i = 0; i < currentEmp; i++) {
            System.out.println(personList.get(i).getFirstName() + "            " + personList.get(i).getLastName() + "             " +
                    personList.get(i).getPersonalID() + "            " + personList.get(i).getSalary());
        }
    }

    private void addEmployeeInfo() {
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        double salary;
        System.out.println("Enter the Information of new Employee");
        Person person = new Person();
        System.out.print("First Name : ");
        firstName = in.next();
        person.setFirstName(firstName);
        System.out.print("Last Name : ");
        lastName = in.next();
        person.setLastName(lastName);
        System.out.print("How much is his/her Salary? : ");
        salary = in.nextDouble();
        person.setSalary(salary);
        person.setPersonalID(initialPersonalID);
        ++initialPersonalID;
        personList.add(person);
        currentEmp++;
    }

    private void updateSalary(int employeeIdToUpdate) {
        double salary;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < currentEmp; i++) {
            if (personList.get(i).getPersonalID() == employeeIdToUpdate) {
                salary = in.nextInt();
                personList.get(i).setSalary(salary);
            }
        }
    }

    private void updateLastName(int employeeIdToUpdate) {
        String lastName;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < currentEmp; i++) {
            if (personList.get(i).getPersonalID() == employeeIdToUpdate) {
                lastName = in.next();
                personList.get(i).setLastName(lastName);
            }
        }
    }

    private void updateFirstName(int employeeIdToUpdate) {
        String firstName;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < currentEmp; i++) {
            if (personList.get(i).getPersonalID() == employeeIdToUpdate) {
                firstName = in.next();
                personList.get(i).setFirstName(firstName);
            }
        }
    }

}
