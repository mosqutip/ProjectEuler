import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class program
{
    public static void main(String[] args) throws InterruptedException
    {
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();

        try
        {
            File file = new File("cipher1.txt");
            Scanner scanner = new Scanner(file).useDelimiter(",");
            while (scanner.hasNext())
            {
                int character = Integer.parseInt(scanner.next());
                if (table.get(character) != null)
                {
                    int value = table.get(character);
                    value++;
                    table.put(character, value);
                }
                else
                {
                    table.put(character, 1);
                }
            }
            System.out.println(table.entrySet());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}