package day6logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1 ; i<num; i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        if(num == sum){
            System.out.println("is a Perfect Number");
        }else{
            System.out.println("is Not a Perfect Number");
        }
    }
}
