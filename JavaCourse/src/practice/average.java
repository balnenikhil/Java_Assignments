package practice;

import java.util.Scanner;

public class average {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Enter Three Numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        double avg = (n1 + n2 + n3)/3;

        System.out.println("The Average is : " + avg);
    }
}
