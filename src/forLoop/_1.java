package src.forLoop;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number:");

        int num=sc.nextInt();

        for (int i = 0; i <=num ; i++) {
            System.out.println(i);
        }
    }
}
