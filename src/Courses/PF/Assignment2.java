package Courses.PF;

import java.util.Scanner;

public class Assignment2 {

    public static void showMatrix(int[][] matrixArr){

        for (int i=0;i< matrixArr.length;i++) {
            for (int j = 0; j < matrixArr.length; j++) {
                System.out.print(matrixArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showTranspose(int[][] matrixArr){

        for (int i=0;i< matrixArr.length;i++){
            for(int j=0;j< matrixArr.length;j++){
                System.out.print(matrixArr[j][i] + " ");
            }
            System.out.println();
        }
    }



    public static void showAdJoint(int[][] matrixArr){
        int temp;
        temp=matrixArr[0][0];
        matrixArr[0][0]=matrixArr[1][1];
        matrixArr[1][1]=temp;
        matrixArr[0][1]=(-1)*(matrixArr[0][1]);
        matrixArr[1][0]=(-1)*(matrixArr[1][0]);
        System.out.println("AdJoint of the given matrix is");
        showMatrix(matrixArr);
    }

    public static void showDeterminant(int[][] matrixArr){

        int determinant = (matrixArr[0][0])*(matrixArr[1][1]) - (matrixArr[0][1])*(matrixArr[1][0]);
        System.out.println("Determinant of the given matrix is : "+determinant);

    }

    public static void main(String[] args){
        int[][] matrix = {{8,-4},{-6,2}};

        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter your choice");
            System.out.println("Press 1 to display the matrix and its transpose.");
            System.out.println("Press 2 to find adJoint and determinant of the matrix.");
            System.out.println("Press any other key to exit.");

            choice = in.nextInt();
            if(choice == 1){
                System.out.println("Matrix is ");
                showMatrix(matrix);
                System.out.println("Transpose of the given Matrix is");
                showTranspose(matrix);
            }
            else if(choice == 2){
                showAdJoint(matrix);
                showDeterminant(matrix);
            }
            else {
                break;
            }
        }
        while (true);


    }
}
