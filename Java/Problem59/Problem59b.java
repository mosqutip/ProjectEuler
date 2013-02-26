import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class program2
{
    public static void main(String[] args) throws InterruptedException
    {
        try
        {
            File file = new File("cipher1.txt");
            Scanner scanner = new Scanner(file).useDelimiter(",");
            int count = 1, sum = 0;
            StringBuilder sb = new StringBuilder("");
            char c = '\0';

            while (scanner.hasNext())
            {
                int character = Integer.parseInt(scanner.next());
                if (count == 1)
                    c = (char)(103 ^ character);
                else if (count == 2)
                    c = (char)(111 ^ character);
                else
                {
                    c = (char)(100 ^ character);
                    count = 0;
                }
                sum += (int)c;
                sb.append(c);
                count++;
            }
            System.out.println(sb);
            System.out.println();
            System.out.println("ASCII sum: " + sum);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}