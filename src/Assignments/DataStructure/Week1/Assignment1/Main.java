package Assignments.DataStructure.Week1.Assignment1;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int choice = 0;
        String name = "";
        int marks = 0;
        StudentStack orgStack = new StudentStack();
        StudentStack tempStack = new StudentStack();
        Scanner in = new Scanner(System.in);
        while (choice != 5 && choice > -1) {
            System.out.println("1.\tTo add a student in Stack. \n" +
                    "2.\tTo remove a Student from Stack. \n" +
                    "3.\tDisplay all students of Stack. \n" +
                    "4.\tDisplay top 3 positions of students. (Student with highest marks is at first place, other positions are according to same highest marks criteria).  \n" +
                    "5.\tPress 5 or any other key to close the program\n");
            System.out.print("Enter your Choice (1, 2 , 3, 4, 5): ");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.print("Enter the name the of the Student: ");
                name = in.next();
                System.out.print("Enter the marks of the Student: ");
                marks = in.nextInt();

                Student orgStudent = new Student();
                orgStudent.setMarks(marks);
                orgStudent.setName(name);
                SNode node = new SNode(orgStudent);
                orgStack.push(node);

                Student tempStudent = new Student();
                tempStudent.setName(name);
                tempStudent.setMarks(marks);
                node.setStudent(tempStudent);
                tempStack.push(node);

                System.out.println("Student's Information Successfully added to the Stack ");
                System.out.println();

            } else if (choice == 2) {
                if (!orgStack.IsEmpty()) {
                    orgStack.pop();
                    tempStack.pop();

                    System.out.println("Student is Successfully removed from the Stack");
                } else
                    System.out.println("The Stack is Empty");

            } else if (choice == 3) {
                System.out.println("The Information of all the Students: ");
                System.out.println(" Name \t Marks");
                orgStack.display();

            } else if (choice == 4) {
                tempStack = orgStack.sortStack(tempStack);
                System.out.println("Top Positions: ");
                System.out.println("Name \t Marks");
                tempStack.display();
                }
            else
                return;
        }
    }
}
