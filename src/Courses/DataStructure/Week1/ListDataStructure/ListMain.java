package Courses.DataStructure.Week1.ListDataStructure;

public class ListMain {
    public static void main(String[] args){

        ListUsingLinkedList<Integer> list = new ListUsingLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(6);
        list.start();
        list.display();
        list.next();
        System.out.println("Item to be removed: "+list.get());
        list.remove();
        list.display();
//        list.reverse();
//        list.display();

        ListUsingLinkedList<String> list1 = new ListUsingLinkedList<>();
        list1.add("Rahat");
        list1.add("Ali");
        list1.add("Confiz");
        list1.add("Lahore");
        list1.start();
        list1.next();
        list.display();
        System.out.println("Item to be removed "+list1.get());
        list1.remove();
        list1.display();
        list1.reverse();
        list1.display();
    }
}
