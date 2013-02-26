import java.util.ArrayList;
import java.util.Collections;

public class program
{
    static ArrayList<Integer> primeArr = new ArrayList<Integer>();
    static ArrayList<Integer> sums = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        for (int k = 10000; k > 0; k--)
        {
        generatePrimes(k);

        for (int i = 1; i <= 100000; i++)
        {
            int testNum = i, divisorProduct = 1;
            for (int j = 0; testNum > 1; j++)
            {
                int currentDivisor = primeArr.get(j), divisorPower = 0;
                while (testNum % currentDivisor == 0)
                {
                    testNum /= currentDivisor;
                    divisorPower++;
                }
                if (divisorPower != 0)
                    divisorProduct *= currentDivisor;
            }
            sums.add(divisorProduct);
        }
        Collections.sort(sums);
        System.out.println(sums.get(10000));
        }
    }

    public static void generatePrimes(int num)
    {
        primeArr.clear();
        primeArr.add(2);

        for (int i = 3; primeArr.size() <= num; i += 2)
            if (isPrime(i))
                primeArr.add(i);
    }

    public static boolean isPrime(int num)
    {
        if (num < 2)
            return false;
        if (num == 2)
            return true;

        int limit = (int)Math.sqrt(num);

        for (int i = 2; i <= limit; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}