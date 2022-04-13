package Assignments.DataStructure.Week2.QueuePRactice.Assignment2;

public class PatientQueue {
    public PNode head;

    public PatientQueue(){
    }
    public PNode newNode(int age, int priority){
        PNode newPatient = new PNode();
        newPatient.setAge(age);
        newPatient.setPriority(priority);
        newPatient.next = null;
        return newPatient;
    }

    public int peek(){return head.getAge();}
    public boolean isEmpty(){return head==null;}

    public int removePatient(){
        int x = 0;
        if (head != null) {
            x = head.getAge();
            PNode temp = head;
            head = head.next;
        }
        return x;
    }

    public void addPatient(int age, int priority){
        PNode start = head;
        PNode newPatient = newNode(age, priority);

        if (head == null || head.getPriority() > priority) {
            newPatient.next = head;
            head = newPatient;
        }
        else{
            while(start.next != null && start.next.getPriority() <= priority)
                start = start.next;

            newPatient.next = start.next;
            start.next = newPatient;
        }
    }

    public static int getPriority(int age, int priority) {
        if (age > 60) {
            priority = 0;
        } else if (age <= 60 && age > 50) {
            priority = 1;
        } else if (age <= 50 && age > 40) {
            priority = 2;
        } else if (age <= 40 && age > 30) {
            priority = 3;
        } else if (age <= 30) {
            priority = 4;
        }
        return priority;
    }

}
