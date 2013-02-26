import java.math.BigInteger;

public class Problem48
{
    public static void main(String[] args)
    {
        BigInteger bigInt = new BigInteger("0");

        for (int i = 1; i <= 1000; i++)
        {
            BigInteger big = new BigInteger("" + i).pow(i);
            bigInt = bigInt.add(big);
        }

        String result = bigInt.toString();
        result = result.substring((result.length() - 10), result.length());
        System.out.println(result);
    }
}