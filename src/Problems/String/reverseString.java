package Problems.String;


public class reverseString {
    public static void reverseWords(String str){

        String[] arr = str.split("\\.");
        int strSize  = arr.length-1;

        for (int i=strSize; i>=0; i--)
            System.out.print(arr[i]+".");
    }

    public static void reverseString(char[] s) {

        int strSize = s.length-1;

        char[] reverse = new char[s.length];
        int k = 0;
        int i;
        for (i= strSize; i>=0; i--){
            reverse[k] = s[i];
            k++;
        }

        for (int j=0; j<=strSize; j++){
            s[j] = reverse[j];

        }

    }

    public static int reverse(int x) {

        boolean negativeFlag = false;
        if (x < 0)
        {
            negativeFlag = true;
            x = -x ;
        }

        int result = 0;
        while(x!=0){
            int temp = x%10;
            result = result*10 + temp;
            x = x/10;
        }
        return (negativeFlag == true)? -result : result;

    }
    public static void main(String[] args ) {

        int x = 123;
        System.out.println(reverse(x));
        String str = "This.is.the.test.to.check.Applications";
       reverseWords(str);
       char[] s = {'H','e','l','l','o'};
       reverseString(s);
    }
}
