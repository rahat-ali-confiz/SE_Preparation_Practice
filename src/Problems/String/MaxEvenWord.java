package Problems.String;

public class MaxEvenWord {

    public static String maxWordInSentence(String str){


        String curLen = "";
        String maxLen = "";
        String[] s = str.split("\\.");

        for (String value : s) {
            if (value.length() % 2 == 0)
                curLen = value;

            if (curLen.length() > maxLen.length()) {
                maxLen = curLen;
                curLen = "";
            }
        }
        return maxLen;
//        int n = str.length();
//        int curLen = 0;
//        int maxLen = 0;
//        int startingPoint = -1;
//        int i =0;
//        while(i<n){
//            if (str.charAt(i)=='.'){
//                if(curLen%2==0){
//                    if (maxLen < curLen){
//                        maxLen = curLen;
//                        startingPoint = i - curLen;
//                    }
//                }
//                curLen=0;
//            }
//            else{
//                curLen++;
//            }
//            i++;
//        }
//        if (curLen%2==0){
//            if (maxLen < curLen){
//                maxLen = curLen;
//                startingPoint = i - curLen;
//            }
//        }
//        if (startingPoint == -1)
//            return "-1";
//        return str.substring(startingPoint,startingPoint+maxLen);
//
//
    }

    public static void main(String[] args ){
        String str = "This.is.the.test.to.check.Application";
        System.out.println("The Max even word in the string is :"+maxWordInSentence(str));

    }
}
