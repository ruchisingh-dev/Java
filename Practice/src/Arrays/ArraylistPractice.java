package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(2334);
//        list.add(23123);
//        list.add(2334);
//        list.add(23123);
//        list.add(2332);
//        list.add(2445);
//
//        System.out.println(list.contains(2334));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

//        System.out.println(list);
    }
}
