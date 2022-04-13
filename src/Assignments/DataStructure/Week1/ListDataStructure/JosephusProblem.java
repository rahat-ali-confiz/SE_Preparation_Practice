package Assignments.DataStructure.Week1.ListDataStructure;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.Iterator;
import java.util.List;

public class JosephusProblem {

    public static void josephus(List<Integer> person, int k, int index){
         if (person.size()==1){
             System.out.println("The leader of the board is: " + person.get(0));
             return;
         }
         index = ((index + k) % person.size());
         System.out.println("Remove "+person.remove(index));

         josephus(person,k,index);

    }
    public static void main(String[] args) {
 //       int n=10;
//        int jump=3;
//        CircularLinkedList list = new CircularLinkedList();
//        for (int i=1;i<=n;i++)
//            list.add(i);
//        list.display();
//
//        list.start();
//        while (list.length()>1){
//            for (int i=1;i<=jump;i++)
//                list.next();
//            System.out.println("Remove "+list.getNode());
//            list.remove();
//        }
//        System.out.println("The leader will be"+list.getNode());
        int n = 10;
        int k = 3;
        int index=0;

        List<Integer> person = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            person.add(i);
        System.out.println(person);

        josephus(person, k, index);




//        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
//        int n = 10;
//        int k = 3;
//
//        for (int i = 1; i < n + 1; i++) {
//            list.add(i);
//        }
//        for(int i=0;i<list.size;i++){
//            System.out.print(list.getNode(i).getElement()+" ");
//        }
//        Iterator<Integer> iter = list.iterator();
//        while (iter.hasNext()) {
//            System.out.println(list.toString());
//            for (int z = 0; z < k; z++) {
//                iter.next();
//            }
//            iter.remove();
//        }
//        System.out.println(list.getNode());
       }

}
