package Courses.OOP.AssignmentFour;


import java.util.ArrayList;

public class ListWithGenerics<T> {

    private ArrayList<T> list;

    public ListWithGenerics() {
        this.list = new ArrayList<>();
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    public T set(int index, T element) {
         return list.set(index,element);
    }

    public void add(int index,T element){
       list.add(index,element);
    }

    public void remove(int index){
        list.remove(index);
    }

    public boolean equals(Object element){
         return list.equals(element);
    }

    public boolean contains(Object element){
        return list.contains(element);
    }
}
