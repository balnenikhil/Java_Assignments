package assignment1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
public class FilePathFinding {

    public  static void getFileNames(String pattern,File f){
        if(f.isDirectory()){
            File files[]=f.listFiles();
            for(File file:files){
                if(file.isDirectory()){
                    getFileNames(pattern,file);
                }
                else {
                    if (file.getName().matches(pattern)){
                        System.out.println("Files Absolute Path is " + file.getAbsolutePath());
                    }
                }
            }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File dir=new File("/home/nikhC");
        while(true){
            System.out.print("Enter a Regular expression to search: ");
            String pattern=sc.next();
            getFileNames(pattern,dir);
            System.out.println(" To continue Searching press Y / To stop searching press N");
            char quit = sc.next().charAt(0);
            if(quit == 'N')
            {
                break;
            }
        }
        System.out.println("Thanks for using FilePathFinder");
    }
}
