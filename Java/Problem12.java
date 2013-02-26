import java.util.ArrayList;

public class Problem12
{
    static ArrayList<Integer> primeArr = new ArrayList<Integer>();
    static double pentagonals = 1;
    static int pentNum = 1; 

    public static void main(String[] args)
    {
        generatePrimes(10000);
        
        while (true)
        {
            generatePentagonal();
            double testNum = pentagonals;
            double testCopy = testNum;
            int divisors = 1;
            for (int i = 0; testCopy > 1; i++)
            {
                int currentDivisor = primeArr.get(i);
                int divisorPower = 0;
                while (testCopy % currentDivisor == 0.0)
                {
                    testCopy /= currentDivisor;
                    divisorPower++;
                }
                if (divisorPower != 0)
                    divisors *= (divisorPower + 1);
            }
            if (divisors > 500)
            {
                System.out.println("GOT IT!: " + testNum);
                break;
            }
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

    public static void generatePentagonal()
    {
        pentagonals = (pentNum * (pentNum + 1) / 2);
        pentNum++;
    }
}