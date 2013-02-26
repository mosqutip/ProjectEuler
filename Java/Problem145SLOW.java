public class program
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        int reversables = 0;
        for (int i = 11; i <= 999999999; i++)
        {
            if (i % 10 == 0)
                continue;
            if (reverseCheck(i))
                reversables++;
        }
        System.out.println(reversables);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static boolean reverseCheck(int num)
    {
        String s = Integer.toString(num);
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        int sum = Integer.parseInt(s) + Integer.parseInt(s2.toString());
        char[] check = (Integer.toString(sum).toCharArray());
        for (char c : check)
        {
            if (((int)c - 48) % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }
}