package Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1, 432, 322, 42, 53, 6};
//        System.out.println(Max(arr));
        System.out.println(MaxRange(arr, 1, 4));
    }


    static int MaxRange(int[] arr, int start, int end){
        int MaxVal = arr[start];
        for (int i = 0; i < end; i++) {
            if (arr[i] > MaxVal) {
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
    static int Max(int[] arr){
        int MaxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxVal) {
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
