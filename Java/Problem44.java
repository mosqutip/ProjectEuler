import java.util.ArrayList;

public class Problem44
{
    static ArrayList<Integer> pentagonals = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        generatePentagonals();
        int finalNum = 0;
        for (int i = 0; i < pentagonals.size(); i++)
        {
            for (int j = 0; j < pentagonals.size(); j++)
            {
                int diff = Math.abs(pentagonals.get(j) - pentagonals.get(i));
                if (isPentagonalB(diff))
                {
                    int sum = pentagonals.get(j) + pentagonals.get(i);
                    if (isPentagonalB(sum))
                    {
                        finalNum = diff;
                        System.out.println("GOT IT: " + finalNum);
                        break;
                    }
                }
            }
            if (finalNum != 0) break;
        }
    }
    
    public static boolean isPentagonal(int num)
    {
        double test = Math.sqrt((24 * num) + 1);
        test = ((test + 1) / 6);
        if (((int)test == test) && test > 0)
            return true;
        return false;
    }

    public static void generatePentagonals()
    {
        for (int i = 1; i <= 5000; i++)
        {
            int num = i * ((3 * i) - 1) / 2;
            pentagonals.add(num);
        }
    }
}