package Assignments.OOP.AssignmentFive;

public class PointMain {
    public static void main(String[] args){
        Point<Integer,String> p = new Point();
        Point<Integer,String> p1 = new Point<>(1, "Rahat");

        Point<String , String> p2 = new Point<>("Rahat", "Confiz");

       System.out.println("The value of X is :"+p1.getX());
       System.out.println("The value of Y is :"+p1.getY());
       p.move(1,"Rahat");
        System.out.println("The value of X is :"+p.getX());
        System.out.println("The value of Y is :"+p.getY());
       System.out.println(p.getLocation().getY());
       System.out.println(p.equals(p1));
    }
}
