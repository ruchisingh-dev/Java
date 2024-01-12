package searching;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -1, 0, 3, 5, 6, 23, 45, 56, 89, 90};
        int target = 23;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }
    static int oabs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // find weather array is in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            //find middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
