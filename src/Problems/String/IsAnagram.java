package Problems.String;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String a,String b){
        if (a.length() != b.length()){
            return false;
        }

        char[] arr = a.toLowerCase().toCharArray();
        char[] arr1 = b.toLowerCase().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr, arr1);
    }
    public static void main(String[] args ){
        String S = "abca";
        String b = "baca";
        System.out.println(isAnagram(S,b));
    }
}
