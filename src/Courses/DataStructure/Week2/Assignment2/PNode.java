package Courses.DataStructure.Week2.Assignment2;

public class PNode {
    private int age;
    private int priority;
    public PNode next;

    PNode(int age){
        this.age = age;
    }
    PNode(){
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


}
