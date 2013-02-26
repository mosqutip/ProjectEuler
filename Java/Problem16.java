import java.lang.Math;

public class Problem16
{
    public static void main(String[] args)
    {
        long sum = 0;
        for (char c : java.math.BigInteger.valueOf(2).pow(1000).toString().toCharArray())
        {
            sum += c - 48;
        }
        System.out.println(sum);
    }
}