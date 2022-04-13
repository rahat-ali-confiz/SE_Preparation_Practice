package Assignments.PF;


class Matrix{
    private double[][] matrixArray;

    private final int cols;
    private final int rows;

    Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        matrixArray = new double[rows][cols];
    }

    Matrix(Matrix m){
        this.rows = m.rows;
        this.cols = m.cols;
        matrixArray = new double[m.rows][m.cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrixArray[i][j] = m.matrixArray[i][j];
            }
        }
    }

    final void displayMatrix(double[][] arr, int numRows, int numCols){
        for (int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    final void transposeMatrix(double[][] arr, int numRows, int numCols){

        double[][] arrayMatrix = new double[numRows][numCols];
        for (int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                arrayMatrix[i][j] = arr[j][i];
            }
        }
        displayMatrix(arrayMatrix,numRows,numCols);
    }



    final void multiplyMatrix(
            int row1, int col1, double[][] arr1,
            int row2, int col2, double[][] arr2)
    {
        int i, j, k;
        System.out.println("Matrix A:");
        displayMatrix(arr1, row1, col1);
        System.out.println("Matrix B:");
        displayMatrix(arr2, row2, col2);

        if (row2 != col1) {
            System.out.println("Multiplication Not Possible");
            return;
        }

        double[][] arr3 = new double[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
        System.out.println("Resultant Matrix:");
        displayMatrix(arr3, row1, col2);
    }
}


public class PracticeClass {

     public static void main(String[] args){
         Matrix matrix = new Matrix(3,3);
         Matrix matrix2 = new Matrix(matrix);

         System.out.println(matrix);
         System.out.println(matrix2);
     }
}
