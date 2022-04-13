package Courses.DataStructure.Week1.Assignment1;

public class Student {

    private String name;
    private int marks;


    public Student(){
        this.name = null;
        this.marks = -1;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

}
