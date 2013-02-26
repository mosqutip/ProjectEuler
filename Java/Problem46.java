public class Problem46
{
    public static void main(String[] args)
    {
        int num = 9;
        boolean found = true;
        while (found)
        {
            if (!isPrime(num))
            {
                int limit = (int)Math.sqrt(num / 2);
                found = false;
                for (int i = 1; i <= limit; i++)
                {
                    int test = num - (2 * (i * i));
                    if (isPrime(test))
                    {
                        found = true;
                        break;
                    }
                }
            }
            num += 2;
        }
        System.out.println(num - 2);
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