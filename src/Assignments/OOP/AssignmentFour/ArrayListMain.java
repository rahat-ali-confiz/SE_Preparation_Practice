package Assignments.OOP.AssignmentFour;

public class ArrayListMain {
    public static void main(String[] args){
        ListClassUsingArray<Integer> list = new ListClassUsingArray<>();
        list.add(12);
        list.add(22);
        list.add(2,32);
        list.print();

        ListClassUsingArray<String> stringList = new ListClassUsingArray<>();
        stringList.add("Rahat");
        stringList.add("Ali");
        stringList.add("Confiz");
        stringList.add("Hafeez");
        stringList.print();

        ListClassUsingArray<String> stringList1 = new ListClassUsingArray<>();
        stringList1.add("Rahat");
        stringList1.add("Ali");
        stringList1.add(2,"Confiz");
        stringList1.set(3,"Hafeez");
        stringList.add(4,"Lahore");

        System.out.println(stringList.contains("Rahat"));
        System.out.println(stringList.equals(stringList1));
        stringList.remove(1);
        stringList.print();


    }
}
