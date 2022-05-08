package Courses.DataStructure.Week4.SortingAlgo;

public class SortMain {
    public static void main(String[] args)
    {
        SortingAlgorithms ob = new SortingAlgorithms();
        int[] arr = {64,25,12,22,11};
        ob.selectionSort(arr);
        System.out.println("Sorted array after SelectionSort");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        ob.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array after Bubble Sort");
        ob.printArray(arr);
    }
}
