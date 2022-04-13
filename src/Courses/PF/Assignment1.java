package Courses.PF;

public class Assignment1 {

    public static void main(String[] args) {

        String student_name = "Rahat Ali";
        String student_id = "BCSF16M502";
        int x,y,z,last_Digit,count,sum;
        x=2;
        y=1;
        last_Digit = 2;

        z = x^2 +2*(x*y)-x/y;
        sum = z+last_Digit;

        System.out.println("After evaluation of given expression the value of z = "+z);
        System.out.println("Last digit of my id is "+ last_Digit);

        if(sum%2 != 0) {
            System.out.println("I got an odd sum "+ sum);
            count = 0;
            while(count<sum){
                ++count;
                System.out.println("Iteration: "+ count);
                System.out.println("My Id is "+ student_id);

            }
        }
        else {
            System.out.println("I got an even sum "+ sum);
            count = 0;
            while(count<sum){
                ++count;
                System.out.println("Iteration: "+ count);
                System.out.println("My name is "+ student_name);

            }
        }
    }
}
