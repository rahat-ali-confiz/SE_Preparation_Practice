package Courses.DataStructure.Week4;

import java.util.Arrays;

public class BinarySearch {
    int binarySearch(int[] arr, int value){
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

    static long merge(long[] arr, int l,
                      int m, int r){

        long[] left = Arrays.copyOfRange(arr, l,
                m + 1);
        long[] right = Arrays.copyOfRange(arr, m + 1,
                r + 1);

        int i = 0, j = 0, k = l;
        long swaps = 0;

        while (i < left.length && j < right.length)
        {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
            {
                arr[k++] = right[j++];
                swaps += (left.length-i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
    static long mergesort(long arr[], int l, int r){
        long count = 0;
        if(l < r){
            int mid = l + (r - l)/2;
            count += mergesort(arr, l, mid);
            count += mergesort(arr, mid+1, r);
            count += merge(arr, l, mid, r);
        }
        return count;
    }
    static long inversionCount(long arr[], long N) {
        // Your Code Here
        long res = mergesort(arr, 0, arr.length - 1);
        return res;
    }


    public static void main(String[] args){
        long[] arr = {10,10,10};

        inversionCount(arr,5);
    }
}
