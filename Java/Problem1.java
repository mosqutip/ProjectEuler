public class Problem1
{
    public static void main(String[] args)
    {
        int sumMultiples = 0;
        for (int i = 999; i > 0; i--)
        {
            if ((i % 5) == 0 || (i % 3) == 0)
                sumMultiples += i;
        }
        System.out.println("The sum of multiples of 3 and 5 between 0 and 1000 is: " + sumMultiples);
    }
}