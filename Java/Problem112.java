public class Problem112
{
    public static void main(String[] args)
    {
        double proportion = 0;
        int counter = 1, numBouncy = 0;
        while (proportion < 0.99)
        {
            if (isBouncy(counter))
            {
                numBouncy++;
            }
            proportion = (double)numBouncy / counter;
            //System.out.println(counter + "\t" + numBouncy + "\t" + proportion);
            counter++;
        }
        System.out.println(counter - 1);
    }

    public static boolean isBouncy(int num)
    {
        char[] digits = Integer.toString(num).toCharArray();
        char test = digits[0];
        boolean increasing = true, decreasing = true;
        for (int i = 0; i < digits.length; i++)
        {
            for (int j = (i + 1); j < digits.length; j++)
            {
                if (digits[j] > digits[i])
                    decreasing = false;
                if (digits[j] < digits[i])
                    increasing = false;
            }
        }
        if (!increasing && !decreasing)
            return true;
        return false;
    }
}