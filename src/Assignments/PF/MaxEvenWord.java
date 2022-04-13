package Assignments.PF;

public class MaxEvenWord {

    public static String maxWordInSentence(String str){
        int n = str.length();
        int curLen = 0;
        int maxLen = 0;
        int startingPoint= -1;
        int i =0;
        while(i<n){
            if (str.charAt(i)==' '){
                if(curLen%2==0){
                    if (maxLen < curLen){
                        maxLen = curLen;
                        startingPoint = i - curLen;
                    }
                }
                curLen=0;
            }
            else{
                curLen++;
            }
            i++;
        }
        if (curLen%2==0){
            if (maxLen < curLen){
                maxLen = curLen;
                startingPoint = i - curLen;
            }
        }
        if (startingPoint == -1)
            return "-1";
        return str.substring(startingPoint,startingPoint+maxLen);
    }

    public static void main(String[] args ){
        String str = "This is the test to check Application";
        System.out.println("The Max even word in the string is :"+maxWordInSentence(str));

        int i = 1234;
        int result =0;
        while (i!=0){
            int temp = i%10;
            result = result *10+temp;
            i = i/10;
        }
        System.out.println(result);
    }
}
