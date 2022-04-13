package Courses.DataStructure.Week2.QueuePRactice;

public class PriorityQueue {
    private static QNode head;

    PriorityQueue(){
        head = new QNode();
    }

    public static QNode newNode(int data, int priority){
        QNode temp = new QNode();
        temp.data = data;
        temp.priority = priority;
        temp.next = null;
        return temp;
    }

    public static int peek(QNode head){
        return head.data;
    }
    public static int isEmpty(QNode head){
        return ((head) == null)?1:0;
    }

    public static QNode pop(QNode head){
        QNode temp = head;
        head = head.next;
        return head;
    }

    public static QNode enQueue(QNode head, int data, int priority){
        QNode start = head;
        QNode temp = newNode(data, priority);

        if (head.priority > priority){
            temp.next = head;
            head = temp;
        }
        else{
            while(start.next != null && start.next.priority < priority)
                start = start.next;

            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }
}
