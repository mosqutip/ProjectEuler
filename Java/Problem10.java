import java.lang.Math;

public class Problem10
{
    public static void main(String[] args)
    {
        int num = 3;
        long sum = 2;
        
        while (num <= 2000000)
        {
            if (isPrime(num))
                sum += num;
            num += 2;
        }
        System.out.println(sum);
    }
    
    public static boolean isPrime(int num)
    {
	if (num < 2)
            return false;
	if (num == 2)
	    return true;

        int limit = (int)Math.sqrt(num);
        for (int i = 2; i <= limit; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
