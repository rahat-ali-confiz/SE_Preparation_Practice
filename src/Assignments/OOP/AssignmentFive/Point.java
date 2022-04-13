package Assignments.OOP.AssignmentFive;


public class Point<T,U>{
    private T x;
    private U y;

    Point(){}
    Point(T x, U y){
        this.x = x;
        this.y =y;
    }

    public T getX(){
        return x;
    }
    public U getY(){
        return y;
    }

    public Point getLocation(){
        Point point = new Point();
        point.x = this.x;
        point.y = this.y;
        return point;
    }

    public boolean equals(Object obj){
        return this == obj;
    }

    public void move(T x,U y){
        this.x = x;
        this.y = y;
    }

//    public double r() { return Math.sqrt((double)x*(double)x + (double)y*(double)y); }
//    public double theta() { return Math.atan2((double)y, (double)x); }
//    public double distanceTo(Point that) {
//        double dx = (double)(this.x) - (double)(that.x);
//        double dy = (double)(this.y) - (double)(that.y);
//        return Math.sqrt(dx*dx + dy*dy);
//    }

}
