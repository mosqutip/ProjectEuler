public class Problem47
{
    static int[] primeArr = new int[20000];

    public static void main(String[] args)
    {
        generatePrimes(20000);
        int consecutive = 0, divisors;
        int[] divisorList = new int[4];
        for (int i = 1; consecutive < 4; i++)
        {
            divisors = 0;
            int test = i;
            for (int j = 0; test > 1; j++)
            {
                int currentDivisor = primeArr[j];
                if (test % currentDivisor == 0)
                {
                    while (test % currentDivisor == 0)
                        test /= currentDivisor;
                    divisors++;
                }
                if (divisors >= 4)
                    break;
            }
            if (divisors >= 4)
            {
                divisorList[consecutive] = i;
                consecutive++;
            }
            else
                consecutive = 0;
        }
        for (int i : divisorList)
        {
            System.out.println(i);
        }
    }

    public static void generatePrimes(int num)
    {
        primeArr[0] = 2;
        int current = 1;

        for (int i = 3; current < num; i += 2)
            if (isPrime(i))
            {
                primeArr[current] = i;
                current++;
            }
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