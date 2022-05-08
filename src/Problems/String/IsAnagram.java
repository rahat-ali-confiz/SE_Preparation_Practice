package Problems.String;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class IsAnagram {
    public static boolean isAnagram(String a,String b) {

        if (a.length() != b.length()) {
            return false;
        }
        char[] arr = a.toLowerCase().toCharArray();
        char[] arr1 = b.toLowerCase().toCharArray();
        sort(arr);
        sort(arr1);

        if (Arrays.equals(arr,arr1))
            return true;
        else
            return false;
    }
    public static void main(String[] args ){
        String S = "abca";
        String b = "baca";
        System.out.println(isAnagram(S,b));
    }
}
