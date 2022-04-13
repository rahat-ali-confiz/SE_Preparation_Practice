package Assignments.PF;

import java.util.ArrayList;
import java.util.List;

public class ArrayManipulation {

    public static String strConcat(String str1, String str2){
        return (str1+" "+str2);
    }

    public static int overLoading(int i){
         System.out.println("It is a integer value:  "+i);
         return i;
    }
    public static double overLoading(double i){
        System.out.println("It is a Double value:  "+i);
        return i;
    }


    public static String overLoading(String i){
        System.out.println("It is a String value:  "+i);
        return i;
    }

    public static void reverseArray( List<Integer> arr){
        for (int i=arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i));
        }

    }
    public static void main(String[] args) {

       List<Integer> arr = new ArrayList<>(5);
        arr.add(5);
        arr.add(7);
        arr.add(3);
        arr.add(4);
        arr.add(9);

       reverseArray(arr);

//
//        int[][] arr1 = new int[][]{{1,2,3},{4,5,6}};
//        int[][] arr2 = new int[][]{{2,4,5},{6,5,4},{1,3,5}};
//
//        int[][] arr3 = new int[2][3];
//
//        for (int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                for (int m =0;m<3;m++){
//                    arr3[i][j] += (arr1[i][m]*arr2[m][j]);
//                }
//            }
//        }
//
//        for (int k=0;k<2;k++){
//            for(int l=0;l<3;l++){
//                System.out.print(arr3[k][l]+ " ");
//            }
//            System.out.println();
//        }


//        List<Integer> number = Arrays.asList(2,3,4,5);
//
//        System.out.println(number);
//        // demonstration of map method
//        List<Integer> square = number.stream().map(x -> x*x).
//                collect(Collectors.toList());
//        for (int i=0;i<square.size();i++){
//            System.out.println(square.get(i));
//        }



//        int i=10;
//        double b=10.0;
//        String str = "Rahat Ali";
//        overLoading(i);
//        overLoading(b);
//        overLoading(str);


//        int a,b,c;
//        a=15;
//        b=32;
//        c= a^b;
//        System.out.println(a<<1);
//        c = (a^b)^b;
//        System.out.println(c);
//        c= (a^b)^a;
//        System.out.println(c);
////        System.out.println("Swapping of Two Numbers Using XOR");
////        a = a^b;
////        b = b^a;
////        a = a^b;
////        System.out.println(a +"  "+b);
//        System.out.println("Swapping of Two Numbers ");
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println(a +"  "+b);



//        int[][] matrixArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] identityMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
//        int counter = 10;
//        int length = 2;
//        System.out.println("Here is the identity matrix");
//        for (int i=0;i<5;i++) {
//
//                for (int j = counter; j >=length; j -= 2) {
//                    if(j<0){
//                        System.out.print(0 + "   ");
//                    }
//                    else
//                    System.out.print(j + "   ");
//                }
//            counter -= 2;
//            length -= 2;
//            System.out.println("");
//        }



//        String[] name = new String[]{"Rahat","Ali","Shahid"};
//        char[] charArray = new char[]{'R','a','h','a','t'};
//        String str = new String(charArray);
//        String str1 = "Ali";
//        String str2 = str1;
//        System.out.println(str2.compareTo(str1));
//
//        System.out.println(strConcat(str,str1));
//        System.out.println(str.charAt(0));
//        System.out.println(str.indexOf('t'));
//        System.out.println(str.compareTo("Rahat"));
//        System.out.println(str.contains("Rah"));
//        System.out.println(str.replace('R','T'));



//        //   int sum=0;
//
//        System.out.println("Array without any change");
//        for (int[] ints : matrixArr) {
//
//            for (int j = 0; j < matrixArr.length; j++) {
//                System.out.print(ints[j] + " ");
////                if(i==j){
////                    sum +=arr[i][j];
////                }
//            }
//            System.out.println();
//        }
//        //      System.out.println("Sum of the Diagonal is :"+sum);
//
//        System.out.println("<------------------------------------------------------------------>");
//        System.out.println("Array with rows reverse order");
//        for (int i = matrixArr.length - 1; i >= 0; i--) {
//
//            for (int j = 0; j < matrixArr.length; j++) {
//                System.out.print(matrixArr[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//
//        System.out.println("<------------------------------------------------------------------>");
//        System.out.println("Array with columns reverse order");
//
//        for (int k =0;k< matrixArr.length;k++) {
//
//            for (int j = matrixArr.length - 1; j >= 0; j--) {
//                System.out.print(matrixArr[k][j] + " ");
//
//            }
//            System.out.println();
//        }
//            System.out.println("<------------------------------------------------------------------>");
//            System.out.println("Transpose of a Matrix");
//
//            for (int i=0;i<matrixArr.length;i++) {
//
//                for (int j = 0; j < matrixArr.length; j++) {
//                    System.out.print(matrixArr[j][i] + " ");
//                }
//                System.out.println();
//            }
//
////        String[] arr = new String[]{"Rahat","Ali"};
////        String[] arr1 = new String[]{"Rahat","ali"};
////        int equal =0;
////        Scanner in = new Scanner(System.in);
////
////        for(int i=0;i< arr.length;i++){
////             //System.out.println("My Name is : "+arr[i]);
////            if(arr[i]!=arr1[i]){
////                equal =1;
////                break;
////            }
////        }
////        if (equal ==1 ){
////            System.out.println("Alas! Arrays are not equal ");
////        }
////        else
////            System.out.println("Arrays are Equal Hurray!");
////  Reverse char array
//            System.out.println("<------------------------------------------------------------------>");
//
//            char[] strArr = new char[]{'A', 'i', 'l', 'i', 'a'};
//            char[] arr = new char[strArr.length];
//            int palindrome = 0;
//            for (int i = strArr.length - 1; i >= 0; i--) {
//                arr[i] = strArr[i];
//            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != strArr[i]) {
//                    palindrome = 1;
//                    break;
//                }
//            }
//            if (palindrome == 1) {
//                System.out.println("Alas! Strings is not palindrome ");
//            } else
//                System.out.println("Hurray! String is a palindrome");
//
//            System.out.println("<------------------------------------------------------------------>");
//
//            int[] intArr = new int[]{23, 12, 41, 35, 10};
//            Arrays.sort(intArr);
//            int intKey = 35;
//
//            for (int j : intArr) {
//                System.out.print(j + " ");
//
//            }
//            System.out.println();
//            System.out.println(
//                    intKey + " found at index = "
//                            + Arrays.binarySearch(intArr, intKey));
//
    }


}
