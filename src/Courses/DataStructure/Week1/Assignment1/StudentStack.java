package Courses.DataStructure.Week1.Assignment1;


import static java.lang.System.exit;

public class StudentStack{
    private SNode head;


    StudentStack(){
        this.head = null;
    }
    public SNode pop(){
        if (head == null) {
            System.out.println("StackPractice Underflow");
        }
        SNode temp = head;
        head = head.next;
        return temp;
    }

    public void push(SNode newStudent){
        newStudent.next = head;
        head = newStudent;
    }
    public SNode peek(){
        return head;
    }
    public boolean IsEmpty(){
        return (head == null);
    }

    public StudentStack sortStack(StudentStack orgStack){
        StudentStack tempStack = new StudentStack();

        while(!orgStack.IsEmpty()){
            SNode student = orgStack.pop();
            while (!tempStack.IsEmpty() && (student.getStudent().getMarks()) < (tempStack.peek().getStudent().getMarks())) {
                orgStack.push(tempStack.pop());
        }
            tempStack.push(student);
        }
        return tempStack;
    }

    public void display(){

        if (head == null) {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else {
            SNode temp = head;
            while (temp != null) {
                System.out.println(temp.getStudent().getName()+"\t "+ temp.getStudent().getMarks());
                temp = temp.next;
            }
        }
    }
}
