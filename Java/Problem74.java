import java.util.ArrayList;

public class Problem74
{
    static int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int counter = 0;

        for (int i = 3; i < 1000000; i++)
        {
            nums.clear();
            nums.add(i);
            int num = i;
            while (nums.size() <= 61)
            {
                num = sumFactorials(num);
                if (!nums.contains(num))
                    nums.add(num);
                else
                    break;
            }
            if (nums.size() == 60)
                counter++;
        }
        System.out.println(counter);
    }

    public static int sumFactorials(int num)
    {
        char[] digits = Integer.toString(num).toCharArray();
        int sum = 0;
        for (char c : digits)
        {
            sum += factorials[((int)c - 48)];
        }
        return sum;
    }
}