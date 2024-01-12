import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salary = 5000;
        if ( salary > 10000 ){
            salary = salary + 10000;
        }else {
            salary = salary + 5000;
        }
//        System.out.println(salary);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
//        for (int num = 1; num <= n; num++){
//            System.out.println(num);
//        }

        int num = 1;
        while (num <= n){
            System.out.print(num + " ");
            num++;
        }

    }
}
