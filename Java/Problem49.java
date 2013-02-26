import java.util.ArrayList;
import java.util.Arrays;

public class Problem49
{
    static ArrayList<Integer> primeArr = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        ArrayList<Integer> testArr = new ArrayList<Integer>();
        generatePrimes(1001, 10000);
        for (int i = 0; i < primeArr.size(); i++)
        {
            int t1 = primeArr.get(i);
            testArr.clear();
            testArr.add(t1);
            for (int j = i; j < primeArr.size(); j++)
            {
                int t2 = primeArr.get(j);
                if (t1 == t2)
                    continue;
                if (permutate(t1, t2))
                    testArr.add(t2);
            }
            if (testArr.size() == 3)
            {
                if ((testArr.get(2) - testArr.get(1)) == (testArr.get(1) - testArr.get(0)))
                    break;
            }
        }
        for (int i : testArr)
            System.out.print(i + " ");
    }

    public static void generatePrimes(int start, int end)
    {
        primeArr.clear();

        for (int i = start; i <= end; i += 2)
            if (isPrime(i))
                primeArr.add(i);
    }

    public static boolean isPrime(int num)
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
    
    public static boolean permutate(int a, int b)
    {
        char[] c1 = Integer.toString(a).toCharArray();
        char[] c2 = Integer.toString(b).toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        String s1 = new String(c1);
        String s2 = new String(c2);
        
        if (s1.compareTo(s2) == 0)
            return true;
        return false;
    }
}