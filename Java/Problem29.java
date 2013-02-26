import java.lang.Math;
import java.util.ArrayList;

public class Problem29
{
    public static void main(String[] args)
    {
        ArrayList<Double> powers = new ArrayList<Double>();
        
        for (int i = 2; i <= 100; i++)
        {
            for (int j = 2; j <= 100; j++)
            {
                double term = Math.pow(i, j);
                if (!powers.contains(term))
                    powers.add(term);
            }
        }
        System.out.println(powers.size());
    }
}