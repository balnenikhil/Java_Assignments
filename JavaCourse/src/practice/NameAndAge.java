package practice;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        String[] names=new String[5];
        int[] ages=new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter name and age");
            names[i]=scanner.next();
            ages[i]=scanner.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(names[i]+" is "+ages[i]+" years old");
        }
    }
}
