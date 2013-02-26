import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem102
{
    public static void main(String[] args)
    {
        Vector origin = new Vector(0, 0, 0);
        int counter = 0;
        try
        {
            File file = new File("triangles.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext())
            {
                String word = scanner.next();
                String[] coords = word.split(",");
                Vector v1 = new Vector(Long.parseLong(coords[0]), Long.parseLong(coords[1]), 0);
                Vector v2 = new Vector(Long.parseLong(coords[2]), Long.parseLong(coords[3]), 0);
                Vector v3 = new Vector(Long.parseLong(coords[4]), Long.parseLong(coords[5]), 0);
                if (inTriangle(origin, v1, v2, v3))
                    counter++;
            }
            System.out.println(counter);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static boolean SameSide(Vector p1, Vector p2, Vector v1, Vector v2)
    {
        Vector temp1 = v2.sub(v1);
        Vector temp2 = p1.sub(v1);
        Vector temp3 = p2.sub(v1);
        
        Vector cp1 = temp1.cross(temp2);
        Vector cp2 = temp1.cross(temp3);
        
        if (cp1.dot(cp2) >= 0)
            return true;
        return false;
    }

    public static boolean inTriangle(Vector p, Vector a, Vector b, Vector c)
    {
        if (SameSide(p, a, b, c) && SameSide(p, b, a, c) && SameSide(p, c, a, b))
            return true;
        return false;
    }
}