public class Problem34b
{
    public static void main(String[] args)
    {
        int sum = 0;
        int[] facArr = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        
        for (int i = 10; i <= 2540160; i++)
        {
            int digitSum = 0;
            char[] charArr = Integer.toString(i).toCharArray();

            for (char c : charArr)
                digitSum += facArr[((int)c - 48)];

            if (digitSum == i)
                sum += i;
        }
        System.out.println(sum);
    }
}