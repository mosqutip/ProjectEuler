import java.math.BigInteger;
import java.lang.Math;

public class Problem56
{
    public static void main(String[] args)
    {
        int max = 0;
        for (int i = 1; i <= 99; i++)
        {
            for (int j = 1; j <= 99; j++)
            {
                BigInteger b1 = new BigInteger(Integer.toString(i));
                BigInteger b2 = b1.pow(j);
                int sum = sumDigits(b2);
                if (sum > max)
                {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    public static int sumDigits(BigInteger b)
    {
        char[] charArr = b.toString().toCharArray();
        int sum = 0;
        for (char c : charArr)
        {
            sum += (int)c - 48;
        }
        return sum;
    }
}