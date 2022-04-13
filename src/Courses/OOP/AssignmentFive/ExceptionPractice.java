package Courses.OOP.AssignmentFive;

public class ExceptionPractice {

    static int divideByZero(int a, int b){
        return a/b;
    }

    static int computeDivision(int a, int b) {
        int res =0;
        try{
            res = divideByZero(a,b);
        }
        catch(NumberFormatException ex){
            System.out.println("NumberFormatException is occurred");
        }
        return res;
    }
    public static void main(String[] args){
       // String str = null;
       // System.out.println(str.length());
        int a = 1;
        int b = 0;
        try{
            int i = computeDivision(a,b);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
