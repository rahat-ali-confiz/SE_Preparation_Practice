package Problems.String;


import java.util.*;


public class StringDriver {

    public static int isPalindrome(String s) {
        String str = "";
        s = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        for(int i=s.length()-1;i>=0;i--){
            str += s.charAt(i);
        }
        if (str.equals(s))
            return 1;
        return 0;
    }

    public static boolean saveIronman(String s) {
        if (s.length()==1)
            return true;
        s = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();

        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=new String(sb);
        return(rev.equals(s));
    }

    public static char getMaxOccurringChar(String str) {
        int count[] = new int[256];

        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
    private static String upperCaseTitle(String s) {
        String[] str = s.split(" ");
        String t ="";
        for (int i=0;i<str.length;i++){
            t += str[i].substring(0,1).toUpperCase()+str[i].substring(1);
            if(i < str.length - 1)
                t += " ";
        }
        return t;
    }
    // Do it with comparator
    public String ReverseSort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String s = "";
        for (int i=arr.length-1;i>=0;i--)
            s += arr[i];

        return s;
    }

    public static String mergeTwoString(String str1, String str2){
        String s = "";

        int str1Length = str1.length()-1;
        int str2Length = str2.length()-1;
        for (int i=0,j=0;i<=str1Length || j<=str2Length;i++,j++){
            if(i<=str1Length)
            s += str1.charAt(i);
            if(j<=str2Length)
            s += str2.charAt(j);

        }
        return s;
    }

    public static int strStr(String s, String x) {
        String s1;
        int xSize = x.length();
        if(s.contains(x)) {
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i) == x.charAt(0)) {
                    s1 = s.substring(i,i+xSize);
                    if(s1.equals(x)) {
                        return i;
                    }
                }

            }
        }
        return -1;

    }

    public static int firstUniqueChar(String s) {

        char[] arr = new char[256];

        int size = s.length();
        for(int i=0;i<size;i++)
            arr[s.charAt(i)]++;

        int index =-1;

        for(int i=0;i<size;i++){
            if(arr[s.charAt(i)]==1){
                index = i;
                return index;
            }
        }
        return index;
    }

    public int myAtoi(String str) {
        int res = 0;
        str = str.replaceAll(" ","");

        char[] s = str.toCharArray();
        int i = 0;
        int flag = 1;
        if(s[0] == '-'){
            flag = -1;
            i++;
        }

        for (; i < s.length; ++i)
            res = res * 10 + s[i] - '0';

        return res*flag;

    }

    public static String longestCommonPrefix(String[] strs){

        int count =0;
        String s = "";
        int maxCount = 0;
        for(int i=1;i<strs.length;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[i].charAt(i)==strs[i].charAt(j))

                    count++;
            }
            if(maxCount<count){
                maxCount = count;
                count =0;
            }
        }
        if (maxCount == 0)
            return "";
        else
            return s;
    }
    public static List<String> getPermutation(String str) {
        List<String> permutations = new ArrayList<>();

        if (str == null) {
            return null;
        }
        else if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);

        String sub = str.substring(1);
        List<String> words = getPermutation(sub);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        Collections.sort(permutations);
        return permutations;
    }

    public static boolean isRotated(String str1, String str2){

        if(str1.length()!=str2.length())
            return false;
        String str ="";
        str = str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2);
        String s = str1.substring(2)+str1.substring(0,2);
        if(str.equals(str2) || s.equals(str2))
            return true;
        return false;
    }

    public static void main(String[] args ){
        String s = "I am :IronnorI Ma, i";

        String str1 = "GeeksFor";
        String str =  "eksForGe";

        String[] strs = {"flower","flow","flight"};

    //    System.out.println(longestCommonPrefix(strs));

        isRotated(str1,str);

     //   System.out.println(firstUniqueChar(str));

      //  System.out.println(strStr(str1,str));
//        getMaxOccurringChar(str);
          System.out.println(mergeTwoString(str,str1));
//        System.out.println(upperCaseTitle(s));
//        System.out.println(isPalindrome(s));
    }
}
