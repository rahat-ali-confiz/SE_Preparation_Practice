package Courses.PF;


public class Circle {
    private double radius;
    private final double PI = 3.1427;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeAreaCircumference(){

        double area = PI*radius*radius ;
        System.out.println("Area of a circle is: "+area);
        double circumference = 2*PI*radius;
        System.out.println("Circumference of a Circle is: "+circumference);

    }
}
