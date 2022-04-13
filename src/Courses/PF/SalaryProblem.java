package Courses.PF;

import java.util.Scanner;

public class SalaryProblem {

    private static void getInput(int[][] salaries , int numEmps){
        Scanner in = new Scanner(System.in);
        for (int i=0;i<numEmps;i++){
            salaries[i][0] = in.nextInt();
        }
    }

    private static void calculateSalary(int[][] salaries, int numEmps) {
        for (int i=0;i<numEmps;i++){
            // netSalary = grossSalary - Tax;
            if(salaries[i][0]>=0 && salaries[i][0]<=5000){
                salaries[i][1]=salaries[i][0];
            }
            else if(salaries[i][0]>5000 && salaries[i][0]<=10000){
                salaries[i][1] = (int) (salaries[i][0] - 0.05 * salaries[i][0]);
            }
            else if(salaries[i][0]>10000 && salaries[i][0]<=20000){
                salaries[i][1] = (int) (salaries[i][0] - 0.1 * salaries[i][0]);
            }
            else {
                salaries[i][1] = (int) (salaries[i][0] - 0.15 * salaries[i][0]);
            }
        }
    }

    private static void showSalaryTable(int[][] salaries, int numEmps){
        for (int i=0;i<numEmps;i++){
            for (int j=0;j<2;j++){
                System.out.print(salaries[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void locateUnluckyEmployees(int[][] salaries, int numEmps, int[] luckyEmployee) {
        int grossSalary;
        int netSalary;
        for (int i=0;i<numEmps;i++){
            grossSalary =salaries[i][0];
            netSalary = salaries[i][1];
            for (int j=0;j<numEmps;j++){
                if(grossSalary>salaries[j][0] && netSalary<salaries[j][1]){
                    luckyEmployee[i] = 1;
                }
            }
        }
    }

    private static void showUnlucky(int[][] salaries, int[] luckyEmployee, int numEmps) {
        for(int i=0;i<=numEmps;i++){
            if(luckyEmployee[i]==1){
                System.out.println("Employee No "+(i+1)+" is Unlucky, with Gross Salary = "+salaries[i][0]+ " and Net Salary  = "+salaries[i][1]);
            }
        }
    }

    public static void main(String[] args){
        final int arraySize = 100;
        int[][] salaries = new int[arraySize][2];
        int[] luckyEmployee = new int[arraySize];

        System.out.println("Enter Total Number of Employees of the Company: ");
        int numEmps;
        Scanner in = new Scanner(System.in);
        numEmps = in.nextInt();

        System.out.println("<------------------------------------------------------------------------>");
        System.out.println("Please Enter the Gross Salary of Employees of the Company");
        getInput(salaries,numEmps);

        System.out.println("<------------------------------------------------------------------------>");
        System.out.println("Calculate the net salary of each employee based on the Tax deduction:");
        calculateSalary(salaries,numEmps);

        System.out.println("<------------------------------------------------------------------------>");
        System.out.println("Salary Array After the calculation of net and gross Salary");
        showSalaryTable(salaries,numEmps);

        System.out.println("<------------------------------------------------------------------------>");
        System.out.println("Calculate the Unlucky Employees of the Company");
        locateUnluckyEmployees(salaries,numEmps,luckyEmployee);

        System.out.println("<------------------------------------------------------------------------>");
        System.out.println("Display the Unlucky Employees of the Company");
        showUnlucky(salaries,luckyEmployee,numEmps);
    }
}
