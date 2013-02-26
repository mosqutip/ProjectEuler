public class Problem92
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        int counter = 0;
        for (int i = 2; i < 10000000; i++)
        {
            int current = digitSquareSum(i);
            while (current != 1 && current != 89)
            {
                current = digitSquareSum(current);
            }
            if (current == 1)
                continue;
            else if (current == 89)
                counter++;
        }
        System.out.println(counter);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int digitSquareSum(int num)
    {
        char[] digits = Integer.toString(num).toCharArray();
        int sum = 0;
        for (char c : digits)
        {
            int square = (int)c - 48;
            square *= square;
            sum += square;
        }
        return sum;
    }
}