import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class Problem3
{
    public static void main(String[] args)
    {
        double num = 600851475143.0;
        ArrayList<Integer> list = factors(num);
        
        if (!list.isEmpty())
        {
            for (int i : list)
            {
                ArrayList tempArr = factors(i);
                if (!tempArr.isEmpty())
                    continue;
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("This number has no prime factors");
        }            
    }
    
    private static ArrayList factors(double num)
    {
        double factor_limit = Math.sqrt(num) + 1;
        int i = (int)factor_limit;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (i > 1)
        {
            if ((num % i) == 0)
                list.add(i);
            i--;
        }
        
        if (list.isEmpty())
            return list;
        else
        {
            Collections.sort(list);
            Collections.reverse(list);
            return list;
        }
    }
}