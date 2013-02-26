public class Problem206
{
    static String master = "1234567890";

    public static void main(String[] args)
    {
        long limit = 1010101030;
        long upperLimit = 1389026570;
        int counter = 0;

        while (limit <= upperLimit)
        {
            long test = limit * limit;
            if (match(test))
            {
                System.out.println(limit);
                break;
            }

            if (counter == 0)
            {
                limit += 40;
                counter--;
            }
            else
            {
                limit += 60;
                counter++;
            }
        }
    }

    public static boolean match(long num)
    {
        char[] digits = Long.toString(num).toCharArray();
        String temp = "";
        for (int i = 0; i <= 18; i += 2)
        {
            temp += digits[i];
        }
        if (temp.compareTo(master) == 0)
            return true;
        return false;
    }
}