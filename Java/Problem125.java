import java.util.ArrayList;

public class Problem125
{
    static ArrayList<Integer> squareSums = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        ArrayList<Integer> palindromes = new ArrayList<Integer>();
        generateSquareSums(100000000);
        long sum = 0;
        for (int i : squareSums)
        {
            if (isPalindrome(i) && !palindromes.contains(i))
            {
                sum += i;
                palindromes.add(i);
            }
        }
        System.out.println(sum);
    }

    public static void generateSquareSums(int num)
    {   
        for (int i  = 1; i <= Math.sqrt(num); i++)
        {
            int sum = i * i;
            for (int j = (i + 1); sum < num; j++)
            {
                if ((sum + (j * j)) > num)
                    break;
                else
                    sum += (j * j);
                squareSums.add(sum);
            }
        }
    }

    public static boolean isPalindrome(int num)
    {
        String test = Integer.toString(num);
        StringBuffer reversed = new StringBuffer(test);
        if (test.compareTo(new String(reversed.reverse())) == 0)
            return true;
        return false;
    }
}