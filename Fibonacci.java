package day6logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        int a =0;
        int b =1;

        int c;
        int i;
        for(i=1; i<=num; i++){
            c = a + b;
            System.out.print(" " +c);
            a=b;
            b=c;
        }
    }
}
