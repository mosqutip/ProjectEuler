import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class program
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("names.txt");
            Scanner scanner = new Scanner(file).useDelimiter(",");
            
            ArrayList<String> keys = new ArrayList<String>();
            HashMap<String, Integer> sortedNames = new HashMap<String, Integer>();
            while (scanner.hasNext())
            {
                String word = scanner.next();
                word = word.substring(1, word.length() - 1);
                keys.add(word);
            }
            Collections.sort(keys);
            for (String s : keys)
            {
                int wordSum = 0, value = 0;
                char[] letters = s.toCharArray();
                for (char c : letters)
                {
                    wordSum += ((int)c - 64);
                    value = wordSum * (keys.indexOf(s) + 1);
                }
                sortedNames.put(s, value);
            }
            long totalSum = 0;
            for (int value : sortedNames.values())
                totalSum += value;
            System.out.println(totalSum);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}