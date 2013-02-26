import java.lang.Math;

public class Problem7
{
    public static void main(String[] args)
    {
        int num = 3;
        int primes = 1;
        
        while (primes <= 10000)
        {
            if (isPrime(num))
                primes++;
            num += 2;
        }
        System.out.println(num - 2);
    }
    
    public static boolean isPrime(int num)
    {
	if (num < 2)
            return false;
	if (num == 2)
	    return true;

        int limit = (int)Math.sqrt(num);
        for (int i = 2; i <= test; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}