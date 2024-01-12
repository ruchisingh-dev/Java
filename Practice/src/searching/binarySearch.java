package searching;

public class binarySearch{
    public static void main(String[] args) {
        //used for sorted array (ascending/descending order)
        // 1. find the middle element==> (start + end)/2
        // 2. check if the target > mid then you search in right else search in left
        // 3. if middle element == target element found else repeat from step 1
        int[] arr = {2, 3, 4, 67, 78, 89, 90};
        int target = 76;
        int ans = binarysearch(arr, target);
        int Cieling = ceiling(arr, target);
        int Floor = floor(arr, target);
        System.out.println(Cieling);
    }
    // return the index
    // return -1 if it does not exist
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find middle element
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
// return the index of smallest no >= target
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // but what if target is greater than greatest number in the array
        if (target > arr[arr.length - 1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
    // return the index: greatest number <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}















