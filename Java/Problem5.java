public class Problem5
{
    public static void main(String[] args)
    {
        int found = 0, num = 2521;
        while (found != num)
        {
            if ((num % 20 == 0) && (num % 19 == 0) && (num % 18 == 0)
            && (num % 17 == 0) && (num % 16 == 0) && (num % 15 == 0)
            && (num % 14 == 0) && (num % 13 == 0) && (num % 12 == 0)
            && (num % 11 == 0))
                found = num;
            else
                num++;
        }
        System.out.println(found);
    }
}