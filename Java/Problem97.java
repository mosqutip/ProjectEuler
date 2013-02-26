public class Problem97
{
    public static void main(String[] args)
    {
        long num = 28433;
        for (int i = 1; i <= 7830457; i++)
        {
            num *= 2;
            if (num > 9999999999L)
            {
                String truncate = Long.toString(num);
                int length = truncate.length();
                String lastTen = truncate.substring(length - 10, length);
                num = Long.parseLong(lastTen);
            }
        }
        num++;
        System.out.println(num);
    }
}