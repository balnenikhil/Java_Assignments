package assignment2;

import java.util.Scanner;
import java.util.Arrays;
 // time complexity = O[n]
// space complexity = O[n]
public class AlphabetsChecker {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to Check");
        String inputString = sc.next();

        boolean alphabetChecker[] = new boolean[26];
        Arrays.fill(alphabetChecker, false);
        for(int i = 0 ; i < inputString.length(); i++)
        {
            int position = Character.toLowerCase(inputString.charAt(i)) - 'a';
            alphabetChecker[position] = true;
        }
        for(int i=0; i<alphabetChecker.length ; i++)
        {
            if( alphabetChecker[i] == false)
            {
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("All alphabets are present in the String");
        }
        else{
            System.out.println("All alphabets are not present in the String");
        }
    }
}
