package Problems.Queue;

public class QueueUsingLinkedList {
    private static QNode head;
    private static QNode rear;

    QueueUsingLinkedList(){
        head = null;
        rear = null;
    }

    public void enQueue(int data){
        QNode node = new QNode(data);
        if (head == null) {
            head = node;
        }
        else {
            rear.next = node;
        }
        rear = node;
    }
    public void dequeue(){
        if (head == null)
            return;

        head = head.next;
    }

    public void display(){
        if (head==null)
            System.out.println("Queue is Empty");

        QNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
