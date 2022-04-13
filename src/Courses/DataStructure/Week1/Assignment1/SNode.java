package Courses.DataStructure.Week1.Assignment1;

public class SNode {
    public SNode next;
    private Student student;

    SNode(){
        this.next = null;
        student = null;
    }

    SNode(Student data){
        student = data;
        next = null;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
