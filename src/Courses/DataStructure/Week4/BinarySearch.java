package Courses.DataStructure.Week4;

public class BinarySearch {
    int binarySearch(int[] arr, int value)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == value)
                return mid;
            if (arr[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
