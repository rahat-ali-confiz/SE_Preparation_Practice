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
    public int dequeue(){
        if (this.head == null)
            return -1;

        int temp = head.data;
        head = head.next;
        if (head == null)
            rear = null;
        return temp;
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
