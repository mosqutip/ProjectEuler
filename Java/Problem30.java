import java.lang.Math;

public class Problem30
{
    public static void main(String[] args)
    {
        long narcissists = 0;
        
        for (int i = 2; i < 354294; i++)
        {
            String num = Integer.toString(i);
            char[] numArr = num.toCharArray();
            int sum = 0;
            
            for (char c : numArr)
            {
                int digit = ((int)c - 48);
                sum += Math.pow(digit, 5);
            }
            
            if (sum == i)
                narcissists += sum;
        }
        System.out.println(narcissists);
    }
}