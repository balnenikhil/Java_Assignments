package practice;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        double posnum = 1;
        ArrayList<Double> realnums=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to store in Arraylist : ");
        posnum=scanner.nextDouble();
        while(posnum != 0){
            realnums.add(posnum);
            System.out.println("Enter zero to quit and print ArrayList");
            System.out.print("Enter number to store in Arraylist : ");
            posnum=scanner.nextDouble();
        }
        for(int i=realnums.size()-1;i>=0;i--){
            System.out.println(realnums.get(i));
        }

    }
}
