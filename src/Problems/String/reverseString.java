package Problems.String;


public class reverseString {
    public static void reverseWords(String str){

        String[] arr = str.split("\\.");
        int strSize  = arr.length-1;

        for (int i= strSize; i>=0; i--)
            System.out.print(arr[i]+".");
    }
    public static void main(String[] args ) {
        String str = "This.is.the.test.to.check.Applications";

       reverseWords(str);
    }
    }
