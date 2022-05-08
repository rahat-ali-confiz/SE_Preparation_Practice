package Problems.String;

public class reverseString {
    public static void reverseWords(String S){

        int n = S.length();
        String str="";
        for(int i=n-1;i>=0;i--){
            str += S.charAt(i);

            if (S.charAt(i)=='.'){
                for (int j = str.length()-2;j>=0;--j)
                    System.out.print(str.charAt(j));
                System.out.print(".");
                str = "";
            }
        }
        for (int j=str.length()-1;j>=0;j--)
            System.out.print(str.charAt(j));

    }
    public static void main(String[] args ) {
        String str = "This.is.the.test.to.check.Applications";
        reverseWords(str);
    }
}
