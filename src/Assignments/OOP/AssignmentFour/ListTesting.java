package Assignments.OOP.AssignmentFour;



public class ListTesting {
    public static void main(String[] args){

        ListWithGenerics<Integer> list = new ListWithGenerics<>();
        list.add(0,10);
        list.add(1,12);
        list.add(2,13);

      //  list.remove(0);

        ListWithGenerics<Integer> list1 = new ListWithGenerics<>();
        list1.add(0,10);
        list1.add(1,12);
        list1.add(2,13);
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.equals(list1));
        System.out.println(list.contains(12));

    }
}
