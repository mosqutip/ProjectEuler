public class Problem34
{
    public static void main(String[] args)
    {
        int sum = 0;

        for (int i = 10; i <= 2540160; i++)
        {
            int digitSum = 0;
            char[] charArr = Integer.toString(i).toCharArray();

            for (char c : charArr)
                digitSum += factorial((int)c - 48);

            if (digitSum == i)
                sum += i;
        }
        System.out.println(sum);
    }

    public static int factorial(int num)
    {
        if (num == 1 || num == 0)
            return 1;
        for (int i = (num - 1); i > 1; i--)
            num *= i;
        return num;
    }
}