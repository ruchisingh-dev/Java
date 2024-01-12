package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 18;
//        arr[2] = 13;
//        arr[3] = 14;
//        arr[4] = 15;
//        System.out.println();
        //for each loop
//        for (int j : arr) {   //for every element in the array print the element
//            System.out.print(j + " ");
//        }

//        System.out.println(Arrays.toString(arr));
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = input.next();
//        }
//        System.out.println(Arrays.toString(str));


//        int[][] arr = new int[3][];
//        int[][] arr2d = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };
//        System.out.println(Arrays.toString(arr2d));

        int[][] arr2 = new int[3][3];

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = input.nextInt();
            }
        }

//        for (int row = 0; row < arr2.length; row++) {
//            for (int col = 0; col < arr2[row].length; col++) {
//                System.out.print(arr2[row][col] + " ");
//            }
//            System.out.println();
//        }

        for (int[] ints : arr2) {
            System.out.println(Arrays.toString(ints));
//            System.out.println();
        }

    }
}
