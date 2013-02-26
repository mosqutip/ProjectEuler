public class Problem21
{
    public static void main(String[] args)
    {
        int amicableSum = 0;
        for (int i = 1; i < 10000; i++)
        {
            int sum = divisorSum(i);
            if (divisorSum(sum) == i && (sum != i))
                amicableSum += sum;
        }
        System.out.println(amicableSum);
    }
    
    public static int divisorSum(int num)
    {
        int limit = (num / 2);
        int sum = 1;
        
        if (num % 2 == 0)
        {
            for (int i = 2; i <= limit; i++)
            {
                if (num % i == 0)
                    sum += i;
            }
        }
        else
        {
            for (int i = 3; i <= limit; i+=2)
            {
                if (num % i == 0)
                    sum += i;
            }
        }
        return sum;
    }
}