package Patterns;

public class Singleton {
    public static Singleton obj = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){

        return obj;
    }

    public static void display(){
        System.out.print("In a Singleton Class");
    }



}

