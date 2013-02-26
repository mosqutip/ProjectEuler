import java.math.BigInteger;

public class Problem55
{
    public static void main(String[] args)
    {
        int lychrels = 0;
        
        for (int i = 10; i < 10000; i++)
        {
            BigInteger palindrome = new BigInteger(Integer.toString(i));
            int counter = 0;
            boolean found = false;
            
            while (!found && (counter <= 51))
            {
                StringBuffer s = new StringBuffer(palindrome.toString());
                s = s.reverse();
                BigInteger next = new BigInteger(s.toString());
                if (palindrome.equals(next) && counter != 0)
                    found = true;
                else
                {
                    palindrome = palindrome.add(next);
                    counter++;
                }
            }
            if (counter == 52)
            {
                System.out.println(i);
                lychrels++;
            }
        }
        System.out.println(lychrels);
    }
}