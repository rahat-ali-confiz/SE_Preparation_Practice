package Courses.DataStructure.Week2.QueuePRactice;

public class QueueUsingLinkedList {
    private static QNode head;
    private static QNode rear;

    QueueUsingLinkedList(){
        head = null;
        rear = null;
    }

    public void enQueue(int data){
        QNode temp = new QNode(data);

        if (rear==null){
            rear = temp;
            head = temp;
            return;
        }
        else{
            temp.next = rear;
            rear = temp;
        }
    }
    public QNode dequeue(){
        if (this.head == null)
            return null;

        QNode temp = this.head;
        head = head.next;
        if (head == null)
            rear = null;
        return temp;
    }
}
