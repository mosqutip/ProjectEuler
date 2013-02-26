public class Problem37
{
    public static void main(String[] args)
    {
        int truncateSum = 0, truncatables = 0;
        for (int i = 11; truncatables < 11; i += 2)
            if (truncatable(i))
            {
                truncateSum += i;
                truncatables++;
            }
        System.out.println(truncateSum);
    }

    public static int truncateLeft(int num)
    {
        String initial = Integer.toString(num);
        StringBuilder builder = new StringBuilder(initial.substring(1, initial.length()));
        if (builder.length() >= 1)
        {
            int result = Integer.parseInt(builder.toString());
            return result;
        }
        return 0;
    }

    public static int truncateRight(int num)
    {
        String initial = Integer.toString(num);
        StringBuilder builder = new StringBuilder(initial.substring(0, initial.length() - 1));
        if (builder.length() >= 1)
        {
            int result = Integer.parseInt(builder.toString());
            return result;
        }
        return 0;
    }

    public static boolean truncatable(int num)
    {
        for (char c : Integer.toString(num).toCharArray())
            if (c == '0')
                return false;
        int length = Integer.toString(num).length();
        int num2 = num;
        for (int i = 1; i <= length; i++)
        {
            if (!isPrime(num) || !isPrime(num2))
                return false;
            num = truncateLeft(num);
            num2 = truncateRight(num2);
        }
        return true;
    }

    public static boolean isPrime(int num)
    {
        if (num < 2)
                return false;
        if (num == 2 || num == 3)
            return true;

        int limit = (int)Math.sqrt(num);

        for (int i = 2; i <= limit; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}