package Problems.LinkedList;



public class LinkedListMain {
    public static void main(String[] args ){

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();


        list.add(1);
        list.add(2);
        list.add(4);
        list1.add(1);
        list1.add(3);
        list1.add(4);

        list.display();
        list1.display();

        list.mergeTwoLists(list.head,list1.head);
//        list.removeNthFromEnd(list.head, 2);

//        list.reverseBetween(1,3);
        list.display();
//
//        LinkedList<Character> l = new LinkedList<>();
//        l.add('W');
//        l.add('B');
//        l.add('W');
//        l.add('B');
////        l.add('W');
//        l.blackWhiteChar();





//        list.head = list.delete(list.head,2);
//        list.display();
//        LinkedList<Integer> list1 = new LinkedList<>();
//
//        list1.add(10);
//        list1.add(15);
//        list1.add(30);
//
//        System.out.println(list.intersectPoint(list.head,list1.head));
//
//        list.display();
//        list.rotate(1);
//        list.display();
//
//        list.deleteNode(5);
//        list.display();
//        list.reverseBetween(1,6);
//        list.display();

//        list.head = list.reverseByNthGroup(list.head, 3);
//        list.display();
//
//        System.out.println("Middle Element of Linked List is: "+list.middleElement());
//        list.deleteMiddle();
//        list.display();
//        list.reverse();
//        list.display();

    }
}
