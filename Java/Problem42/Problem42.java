import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Problem42
{
    public static void main(String[] args)
    {
        try
        {
            HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
            File file = new File("words.txt");
            
            Scanner scanner = new Scanner(file).useDelimiter(",");
            
            ArrayList<Integer> triangulars = generateTriangulars(500);
            while (scanner.hasNext())
            {
                int wordSum = 0;
                String word = scanner.next();
                word = word.substring(1, word.length() - 1);
                char[] letters = word.toCharArray();
                for (char c : letters)
                    wordSum += ((int)c - 64);
                if (triangulars.contains(wordSum))
                    dictionary.put(word, wordSum);
            }
            System.out.println(dictionary.size());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Integer> generateTriangulars(int limit)
    {
        int triangular = 0;
        ArrayList<Integer> triangulars = new ArrayList<Integer>();
        
        for (int i = 1; triangular < limit; i++)
        {
            triangular = (int)((i * (i + 1)) * 0.5);
            triangulars.add(triangular);
        }
        return triangulars;
    }
}