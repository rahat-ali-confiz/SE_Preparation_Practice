package Problems;

public class TestMain {

    public static char maxOccurringChar(String str){
        int currCount =1;
        char c =str.charAt(0);

        if(str.length()==1)
            return str.charAt(0);
        int maxCount = 1;
        int i=1;
        for(;i< str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currCount++;
                if(currCount>maxCount){
                    maxCount = currCount;
                    c = str.charAt(i-1);
                }
            }
            else{
                currCount = 1;
            }
        }

        return c;
    }

    public static String powerString(String s){

        int count=1;
        String str = "";
        char c =0;
        int n = s.length();
        int i=1;
        for(;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else {
                c = s.charAt(i-1);
                str +=Character.toString(c)+count;
                count = 1;
            }
        }
        str +=Character.toString(s.charAt(i-1))+count;
        return str;
    }

    public static String ReverseFactorial(int x){
        int n = x;
        int divide_by = 2;

        while(n % divide_by == 0){
            n /= divide_by;
            divide_by++;
        }
        if(n == 1){
            return String.valueOf(divide_by - 1);
        }
        else{
            return "NONE";
        }
    }
    public static void main(String[] args){
        String s = "a";
        System.out.println(powerString(s));
        System.out.println(ReverseFactorial(24));
    }

}
