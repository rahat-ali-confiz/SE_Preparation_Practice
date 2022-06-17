package Problems.Arrays;

import java.util.*;

public class DriverArray {
    public static ArrayList<Integer> subArraySum(int[] arr, int n, int s){
        // Your code here
        ArrayList<Integer> list=new ArrayList();
        int i=0,j=0;
        long sum=0;
        while(i<n && j<n){
            sum += arr[j];
            if(sum<s)
                j++;
            if(sum>s){
                sum =0;
                i++;
                j=i;
            }
            if (sum==s){
                list.add(i+1);
                list.add(j+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }

    public static int countTriplet(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();

        for(int val : arr){
            set.add(val);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int sum =arr[i]+arr[j];
                if(set.contains(sum)){
                    count++;
                }
            }
        }
        return count;
    }
    static int MissingNumber(int a[], int n) {
        int  total;
        total = (n*(n-1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        total = sum - total;
        return total;
    }

    public static int print2largest(int arr[], int n) {
        // code here
        if (n < 2){
            return -1;
        }
        Arrays.sort(arr);
        int sMax=-1;
        int max=arr[n-1];

        for(int i=0;i<n;i++){
            if (arr[i] > sMax && arr[i] != max)
                sMax = arr[i];
        }
        return sMax;
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        int median = arr.get(arr.size()/2);


        return median;


    }

    public static int[] twoSum(int[] nums, int target) {

        int[] temp = new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if ((nums[i]+nums[j])==target){
                    temp[0]=i;
                    temp[1]=j;
                    return temp;
                }
            }
        }
        return temp;
    }

    public static void reverse(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length;
        int size2 = nums2.length;

        int[] mergedArray = new int[size2+size];

        for (int i=0;i<size;i++)
            mergedArray[i] = nums1[i];
        for (int j=size;j<mergedArray.length;j++)
            mergedArray[j] = nums2[j-size];

        Arrays.sort(mergedArray);

        double median = mergedArray.length/2;
        return median;

    }

    public static int largestIsland(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        int count =0;
        int update =0;
        for(int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                if (update<1){
                    if (grid[i][j]==0) {
                        grid[i][j] = 1;
                        update++;
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                if (grid[i][j]==1)
                    count++;
            }
        }
        return count;
    }

    static void transpose(int matrix[][], int n) {

        int[][] matrix1 = new int[matrix.length][matrix[0].length];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j]= matrix[j][i];
            }
        }

        for (int i=0;i<n;i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        int[][] invertImage = new int[image.length][image[0].length];
        int k=0;
        for (int i =0;i< image.length;i++) {
            for (int j = image.length - 1; j >= 0; j--) {
                invertImage[i][k] = image[i][j];
                k++;
            }
          k=0;
        }
        for(int i=0;i<invertImage.length;i++) {
            for (int j = 0; j <invertImage.length; j++) {
                if (invertImage[i][j]== 0)
                    invertImage[i][j] = 1;
                else
                    invertImage[i][j] = 0;
            }
        }
        return invertImage;
    }

    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void moveZeroes(int[] nums) {
        int j=0, k=0;

        int countZero = 0;
        for(int i=0;i<nums.length-1;i++) {
            if (nums[i] == 0) {
                countZero++;
            }
        }
        int[] arr = new int[countZero];
        if(nums.length>1){
            for(int i=0;i<nums.length;i++) {
                if (nums[i] == 0) {
                    arr[j] = nums[i];
                    j++;
                } else {
                    nums[k] = nums[i];
                    k++;
                }
            }

            int z =0;
            for(int i=k;i<nums.length;i++){
                if(z < arr.length){
                    nums[i] = arr[z];
                    z++;
                }
            }
        }

    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k =0;
        int i;
        for (i=0;i<n-1;i++){
            if (nums[i]!=nums[i+1]){
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[i];

        return k+1;
    }


    public static void merge(long arr1[], long arr2[], int n, int m){
        // code here
        long[] arr3 = new long[n+m];

        for(int i=0;i<n;i++) arr3[i] = arr1[i];

        int k =0;
        for(int i=n;i<arr3.length;i++){
            arr3[i] = arr2[i-n];

        }

        Arrays.sort(arr3);

        long a[]= new long[n+m];
        System.arraycopy(arr1,0,a,0,n);
        System.arraycopy(arr2,0,a,n,m);
        Arrays.sort(a);

    }

    public static void rearrange(long arr[], int n){

        int start = 0;
        int end = n-1;

        int i=0;
        long[] arr1 = new long[n];
        while(start<end){
            arr1[i] = arr[end];
            arr1[i+1] = arr[start];
            i +=2;
            start++;
            end--;
        }


//        Stack<Long> s = new Stack<>();
//        Queue<Long> q = new LinkedList<>();
//
//        for(int i=0; i<n; i++){
//
//            s.push(arr[i]);
//            q.add(arr[i]);
//
//        }
//
//        for(int i=1; i<=n; i++){
//
//            if(!s.isEmpty() && i%2==1){
//
//                arr[i-1]=s.pop();
//
//            }
//
//            if(!q.isEmpty() && i%2==0){
//
//                arr[i-1] = q.remove();
//
//            }
//
//        }
    }
    static long countPairs(int x[], int y[], int M, int N){
        // your code here
        long count =0;
        int j=0;

        for(int i=0;i<M;i++){
            if(j<N){
                if(Math.pow(x[i],y[j])>Math.pow(y[j],x[i]))
                    count++;
                j++;
            }
            else
            j=0;
        }

        return count;
    }

    static int mostFrequent(int arr[], int n) {
        Arrays.sort(arr);

        int max_count = 1, res = arr[0], curr_count = 1;
        for (int i = 1; i < n; i++){
            if (arr[i] == arr[i - 1]){
                curr_count++;
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
            }
            else {
                curr_count = 1;
            }
        }

        return res;
    }

    public static void sort012(int arr[], int n) {
        // code here
        int z=0,o=0,t=0,i;
        for(i=0;i<n;i++){
            if(arr[i]==0)z++;
            else if(arr[i]==1)o++;
            else t++;
        }
        for(i=0;i<n;i++){
            if((z--)>0){
                arr[i]=0;
            }
            else if((o--)>0){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
        return;
    }

    public static int equilibriumPoint(long a[], int n) {

        if(n == 1)
        {
            return 1;
        }

        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum += a[i];
        }

        for(int i = 1; i < n; i++)
        {
            a[i] = a[i] + a[i-1];

            if(a[i-1] == (sum - a[i]))
                return(i+1);
        }

        return -1;

    }

    public static void main(String[] args ){
        int[][] arr1 = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        DriverArray d = new DriverArray();

   //     System.out.println(flipAndInvertImage(arr1));
//        transpose(arr1,arr1.length);
//        System.out.println(largestIsland(arr1));
        int[] nums = {1,1,2,4,4,5,5,5};
        int[] nums1 = {1,5};

        System.out.println(mostFrequent(nums,8));
//            moveZeroes(nums);
//        System.out.println(removeDuplicates(nums));
//        int[] nums1 = {2,4,5};
//        int size=5;
//        int target = 6;

 //       System.out.println(findMedianSortedArrays(nums,nums1));
//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(5);
//        list.add(4);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(findMedian(list));
//        reverse(arr,size);
//        print2largest(arr,arr.length);
//        System.out.println(countTriplet(arr,size));
//
//       System.out.println(subarraySum(arr,size,s));
    }

}
