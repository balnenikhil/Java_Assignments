package assignment11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterOccurance{

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        File f = new File(args[0]);
        FileReader fr = new FileReader(f);
        int i;
        while ((i = fr.read()) != -1) {
            Character c = (char) i;
            if (myMap.containsKey(c))
                myMap.put(c, myMap.get(c) + 1);
            else
                myMap.put(c, 1);
        }
        FileWriter resultsFile=new FileWriter("results.txt");
        for(Map.Entry<Character, Integer> entry:myMap.entrySet())
            resultsFile.write(String.valueOf(entry.getKey())+" "+String.valueOf(entry.getValue())+"\n");
    }
}
