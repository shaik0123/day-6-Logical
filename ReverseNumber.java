package day6logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        int rev = 0;
        int rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        num = sc.nextInt();

        while (num != 0){
            rem = num %10;
            rev = rev*10 + rem;
            num = num /10;
        }
        System.out.println("Reverse is : " +rev);
    }
}
