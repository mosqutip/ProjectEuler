import java.math.BigInteger;

public class Problem20
{
    public static void main(String[] args)
    {
        int num = 100, sum = 0;
        BigInteger bigInt = factorial(num);

        for (char c : bigInt.toString().toCharArray())
        {
            sum += c - 48;
        }
        System.out.println(sum);
    }

    public static BigInteger factorial(int num)
    {
        BigInteger bigInt = new BigInteger("1");

        for (int i = num; i > 1; i--)
        {
            BigInteger temp = new BigInteger(Integer.toString(i));
            bigInt = bigInt.multiply(temp);
        }
        return bigInt;
    }
}