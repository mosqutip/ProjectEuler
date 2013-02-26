public class Problem27
{
    public static void main(String[] args)
    {
        int max = 0, maxA = 0, maxB = 0;
        for (int i = -999; i <= 999; i++)
        {
            for (int j = -999; j <= 999; j++)
            {
                int result = consecutivePrimes(i, j);
                if (result > max)
                {
                    max = result;
                    maxA = i;
                    maxB = j;
                }
            }
        }
        System.out.println(maxA * maxB);
    }
    
    public static int consecutivePrimes(int a, int b)
    {
        int val = b, term = 0;
        while (isPrime(val))
        {
            term++;
            val = (term * term) + (a * term) + b;
        }
        return term;
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