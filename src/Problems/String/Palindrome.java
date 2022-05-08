package Problems.String;


public class Palindrome {

    public int isPalindrome(String S) {
        String str = "";

        for(int i=S.length()-1;i>=0;i--){
            str += S.charAt(i);
        }
        if (str.equals(S))
            return 1;
        return 0;
    }

    public static void main(String[] args ){
        String S = "abca";
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(S));
    }
}
