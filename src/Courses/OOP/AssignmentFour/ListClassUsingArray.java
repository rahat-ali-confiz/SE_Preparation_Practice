package Courses.OOP.AssignmentFour;

public class ListClassUsingArray<T> {
    private T[] arr;
    private int capacity;
    private int size;

    public ListClassUsingArray() {
        arr = (T[])new Object[1];
        capacity = 1;
        size = 0;
    }
    public void add(T data){
        if (size == capacity) {
            T[] temp = (T[]) new Object[2 * capacity];

            if (capacity >= 0)
                System.arraycopy(arr, 0, temp, 0, capacity);

            capacity *= 2;
            arr = temp;
        }

        arr[size] = data;
        size++;
    }

    public void add(int index , T data){
        if (index == capacity)
            add(data);
        else
            arr[index] = data;
    }

    public boolean find(T element){
        for (int i = 0; i< size; i++){
            if (arr[i]==element)
                return true;
        }
        return false;
    }

    public T get(int index){
            return arr[index];
    }

    public T[] set(int index, T element) {
        for (int i = 0; i< size; i++){
            if (index == i){
                arr[i]= element;
            }
        }
        return arr;
    }

    public int length(){
        return size;
    }

    public T[] remove(int index){
        if (arr == null || index < 0
                || index >= size){
            return arr;
        }
        for(int i = index; i< size -1; i++){
            arr[i]= arr[i+1];
        }
        size--;
        return arr;
    }

     public boolean remove(Object obj){
        int index =-1;
        for (int i = 0; i< size; i++){
           if (obj==arr[i]){
                index= i;
                break;
           }
       }
        if (index==-1){
            return false;
        }
        else{
            if (size - 1 - index >= 0)
                System.arraycopy(arr, index + 1, arr, index, size - 1 - index);
            size--;
            return true;
        }
     }

     public boolean contains(String obj){
        for (int i = 0; i< size; i++){
            if (obj==arr[i])
                return true;
        }
        return false;
     }

     public boolean equals(Object obj){
         if (this.arr==obj)
             return true;
         else
             return false;
     }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
