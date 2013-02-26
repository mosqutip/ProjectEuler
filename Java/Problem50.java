public class Problem50
{
    static int[] primeArr = new int[78498];

    public static void main(String[] args)
    {
        generatePrimes(78498);
        int primeSum, length, maxLength = 0, maxSum = 0;
        for (int i = 0; i < primeArr.length; i++)
        {
            primeSum = 0;
            length = 0;
            for (int j = i; j < primeArr.length; j++)
            {
                primeSum += primeArr[j];
                length++;
                if (primeSum > 1000000)
                    break;
                if (length > maxLength && isPrime(primeSum))
                {
                    maxLength = length;
                    maxSum = primeSum;
                }
            }
        }
        System.out.println("Maximum consecutive sum is: " + maxSum + " which is "
            + maxLength + " terms long.");
    }

    public static void generatePrimes(int num)
    {
        primeArr[0] = 2;
        int primes = 1, testVal = 3;
        while (primes < num)
        {
            if (isPrime(testVal))
            {
                primeArr[primes] = testVal;
                primes++;
            }
            testVal += 2;
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