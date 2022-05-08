package Problems.LinkedList;

public class LinkedListMain {
    public static void main(String[] args ){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(6);
        list.add(8);

        list.reverseBetween(1,6);
        list.display();

        list.head = list.reverseByNthGroup(list.head, 3);
        list.display();

        System.out.println("Middle Element of Linked List is: "+list.middleElement());
        list.deleteMiddle();
        list.display();
        list.reverse();
        list.display();

    }
}
