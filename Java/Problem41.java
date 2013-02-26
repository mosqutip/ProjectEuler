import java.util.Arrays;

public class Problem41
{
    static long[] longArr = new long[40320];
    static int next = 0;

    public static void main(String[] args)
    {
        generatePandigitals("", "1234567");
        checkPandigitals();
    }

    public static void generatePandigitals(String beginningString, String endingString)
    {
        if (endingString.length() <= 1)
        {
            long num = Long.parseLong(beginningString + endingString);
            if (num >= 1234567)
            {
                longArr[next] = num;
                next++;
            }
        }
        else
        {
            for (int i = 0; i < endingString.length(); i++) {
                try
                {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                    generatePandigitals(beginningString + endingString.charAt(i), newString);
                }
                catch (StringIndexOutOfBoundsException exception)
                {
                    exception.printStackTrace();
                }
            }
        }
    }    

    public static void checkPandigitals()
    {
        int length = longArr.length - 1;
        for (int i = length; i >= 0; i--)
        {
            if (isPrime(longArr[i]))
            {
                System.out.println(longArr[i]);
                break;
            }
        }
    }

    public static boolean isPrime(long num)
    {
        if (num < 2)
            return false;
        if (num == 2)
            return true;

        int limit = (int)Math.sqrt(num);

        for (int i = 2; i <= limit; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}