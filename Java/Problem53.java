public class Problem53
{
    public static void main(String[] args)
    {
        int counter = 0;

        for (int n = 23; n <= 100; n++)
        {
            int r = 4;
            while (r < n)
            {
                double numerator = factorial(n);
                double denominator = factorial(n - r);
                denominator *= factorial(r);
                double combination = numerator / denominator;
                
                if (combination > 1000000)
                    counter++;

                r++;
            }
        }

        System.out.println(counter);
    }
    
    public static double factorial(double num)
    {
        if (num == 1 || num == 0)
            return 1;
            
        double result = num;
        for (int i = ((int)num - 1); i > 1; i--)
        {
            result *= i;
        }

        return result;
    }
}