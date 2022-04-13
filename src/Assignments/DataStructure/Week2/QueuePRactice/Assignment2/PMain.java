package Assignments.DataStructure.Week2.QueuePRactice.Assignment2;

import java.util.Scanner;

import static Assignments.DataStructure.Week2.QueuePRactice.Assignment2.PatientQueue.getPriority;

public class PMain {
    public static void main(String[] args){
        int choice, age, priority =0;
        PatientQueue pq = new PatientQueue();
        int value;
        System.out.println("Welcome to Patient Information System");
        System.out.println("Enter your choice of the activity");
        do {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input the age of the patient : ");
                    age = in.nextInt();

                    priority = getPriority(age, priority);

                    pq.addPatient(age, priority);
                    break;
                case 2:
                    value = pq.removePatient();

                    if (value==0) {
                        System.out.println( "The queue is empty.");
                    } else {
                        System.out.println("The patient have age : " + value + " is deleted from the queue." );

                    }
                    break;
                case 3:
                    if (pq.isEmpty()) {
                        System.out.println( "The queue is empty");
                    } else {
                        System.out.println("Queue is: ");

                        while (!pq.isEmpty()) {
                            System.out.println(pq.removePatient());
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 4);
    }

}
