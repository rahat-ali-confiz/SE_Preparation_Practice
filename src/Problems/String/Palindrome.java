package Problems.String;


public class Palindrome {

    public int isPalindrome(String s) {
        String str = "";

        for(int i=s.length()-1;i>=0;i--){
            str += s.charAt(i);
        }
        if (str.equals(s))
            return 1;
        return 0;
    }

    public static void main(String[] args ){
        String S = "abca";
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(S));
    }
}
