public class Problem19
{
    static int sundays = 0;
    static int start = 1;

    public static void main(String[] args)
    {
        int  leap = 0;

        for (int i = 1901; i <= 2000; i++)
        {
            if (i % 100 == 0)
                if (i % 400 == 0)
                    leap = 1;
            else if (i % 4 == 0)
                leap = 1;
            else
                leap = 0;

            checkSunday(start);
            start += 31;

            checkSunday(start);
            start += (28 + leap);

            checkSunday(start);
            start += 31;

            checkSunday(start);
            start += 30;

            checkSunday(start);
            start += 31;

            checkSunday(start);
            start += 30;

            checkSunday(start);
            start += 31;

            checkSunday(start);
            start += 31;

            checkSunday(start);
            start += 30;

            checkSunday(start);
            start += 31;

            checkSunday(start);
            start += 30;

            checkSunday(start);
            start += 31;

        }
        System.out.println(sundays);
    }

    public static void checkSunday(int num)
    {
        if (num % 7 == 0)
            sundays++;
    }
}