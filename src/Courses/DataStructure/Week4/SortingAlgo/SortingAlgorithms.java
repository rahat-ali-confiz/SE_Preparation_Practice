package Courses.DataStructure.Week4.SortingAlgo;

public class SortingAlgorithms {

    public void selectionSort(int[] arr){

        for (int i=0;i< arr.length;i++){
            int pos_min = i;
            for (int j = i +1; j< arr.length; j++){
                if (arr[j]< arr[pos_min])
                    pos_min = j;
            }
            swap(arr, i, pos_min);
        }
    }

    public void insertionSort(int[] arr){

        for (int i=1;i<arr.length;i++){
            int val = arr[i];
            int j;
            for (j=i-1;j>=0;j--){
                if (arr[j]>val)
                    arr[j+1]=arr[j];
                else
                    break;
            }
            arr[j+1] = val;
        }
    }

    public void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr, j+1, j);
                }
            }
        }
    }

    public void merge(int arr[],int low, int mid, int high){

            int n1 = mid - low + 1;
            int n2 = high - mid;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            for (int i = 0; i < n1; ++i)
                leftArray[i] = arr[low + i];
            for (int j = 0; j < n2; ++j)
                rightArray[j] = arr[mid + 1 + j];

            int i = 0, j = 0;
            int k = low;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                }
                else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

    public void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high-low)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    public void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pt = partition(arr,low,high);

            quickSort(arr,low,pt-1);
            quickSort(arr,pt+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
         int i = (low - 1);
         for (int j=low;j<=high-1;j++){
             if (arr[j]<pivot) {
                 i++;
                 swap(arr, i, j);
             }
         }
         swap(arr,i+1,high);
         return (i + 1);
    }
    private void swap(int[] arr, int i, int pos_min) {
        int temp = arr[pos_min];
        arr[pos_min] = arr[i];
        arr[i] = temp;
    }

    public  void printArray(int arr[]){
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


}
