public class Problem28b
{
    public static void main(String[] args)
    {
        long sum = 0;
        for (int i = 1; i <= 1001; i += 2)
        {
            int current = ((4 * (i * i)) - (6 * i) + 6);
            sum += current;
        }
        System.out.println(sum - 3);
    }
}