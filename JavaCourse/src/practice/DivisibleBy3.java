package practice;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter a Number: ");
        num = sc.nextInt();

        if(num%3==0)
        {
            System.out.println("Number is divisible by 3");
        }
        else {
            System.out.println("Number is not divisible by 3");
        }
    }
}
