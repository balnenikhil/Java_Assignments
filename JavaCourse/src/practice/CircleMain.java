package practice;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import  java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class CircleMain {
    public static void main(String[] args) {
        ArrayList<Circle> c = new ArrayList<>();
        int radius;
        try {
            Scanner circle = new Scanner(new File("/home/nikhC/Java/JavaCourse/circle"));
            while(circle.hasNext()) {
                radius = circle.nextInt();
                c.add(new Circle(radius));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            PrintWriter pr =new PrintWriter("/home/nikhC/Java/JavaCourse/output.txt");
            for (Circle cir : c) {
                System.out.println("Radius of circle "+cir.getRadius());
                pr.println("Radius of Circle : "+cir.getRadius());
                System.out.println("Area of Circle is "+cir.area());
                pr.println("Area of Circle : "+cir.area());

            }
            pr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
