package Courses.DataStructure.Week4;

public class TableADTMain {
    public static void main(String[] args)
    {
        BinarySearch ob = new BinarySearch();
        int[] arr = { 2, 3, 4, 6,10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
