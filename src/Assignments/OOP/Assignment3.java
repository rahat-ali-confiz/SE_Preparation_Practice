package Assignments.OOP;


import Assignments.PF.Circle;
import Assignments.PF.Rectangle;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args ){
        double radius = 5.6;
        double length = 5.0;
        double width = 4.0;
        Circle obj = new Circle(radius);
        Rectangle rectangleArea = new Rectangle(length,width);
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.println("************************************SCIENTIFIC CALCULATOR************************************");
            System.out.println("OPTION 1 for computing the Area and Circumference of a Circle");
            System.out.println("OPTION 2 for the Area of a Rectangle");
            System.out.println("Select your desired option(1-2):");
            int input = sc.nextInt();

            if (input == 1) {

                obj.computeAreaCircumference();
            } else if (input == 2) {
                rectangleArea.computeArea();
            } else {
                System.out.println("User enter an Invalid Input");
            }

            System.out.println("Do you want to perform any other Calculation");
            option = sc.next().charAt(0);

        }while (option == 'y' || option == 'Y');

    }
}
