import java.util.ArrayList;

public class Problem23
{
    static ArrayList<Integer> abundant = new ArrayList<Integer>();
    public static void main(String[] args)
    {
        generateAbundant(28123);
        int sum = 395465626;
        int[] arrNums = new int[28124];

        for (int i = 1; i <= 28123; i++)
            arrNums[i] = i;

        for (int i = 0; i < abundant.size(); i++)
        {
            for (int j = i; j < abundant.size(); j++)
            {
                int testVal = abundant.get(i) + abundant.get(j);
                if (testVal <= 28123)
                {
                    sum -= arrNums[testVal];
                    arrNums[testVal] = 0;
                }
            }
        }
        System.out.println(sum);
    }

    public static void generateAbundant(int num)
    {
        abundant.clear();
        abundant.add(12);
        int previous = 13;

        for (int i = 2; previous < num; i++)
        {
            int divisorSum = sumDivisors(previous);
            if (divisorSum > previous)
                abundant.add(previous);
            previous++;
        }
    }

    public static int sumDivisors(int num)
    {
        int divisorSum = 1;
        for (int i = 2; i <= (num / 2); i++)
            if (num % i == 0)
                divisorSum += i;
        return divisorSum;
    }
}