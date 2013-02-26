public class Problem33
{
    public static void main(String[] args)
    {
        int numerator = 1, denominator = 1;
        for (int i = 10; i <= 99; i++)
        {
            for (int j = 10; j <= 99; j++)
            {
                if (i >= j)
                    continue;
                if ((i % 10 == 0) && (j % 10 == 0))
                    continue;

                double num = ((double)i / j);
                char i1 = Integer.toString(i).charAt(0);
                char i2 = Integer.toString(i).charAt(1);
                char j1 = Integer.toString(j).charAt(0);
                char j2 = Integer.toString(j).charAt(1);

                int testChar1 = 0, testChar2 = 0;
                double num2 = 0.0;

                if (i1 == j1 && j2 != 0)
                {
                    testChar1 = (int)i2 - 48;
                    testChar2 = (int)j2 - 48;
                    num2 = ((double)testChar1 / testChar2);
                }
                else if (i1 == j2 && j1 != 0)
                {
                    testChar1 = (int)i2 - 48;
                    testChar2 = (int)j1 - 48;
                    num2 = ((double)testChar1 / testChar2);
                }
                else if (i2 == j1 && j2 != 0)
                {
                    testChar1 = (int)i1 - 48;
                    testChar2 = (int)j2 - 48;
                    num2 = ((double)testChar1 / testChar2);
                }
                else if (i2 == j2 && j1 != 0)
                {
                    testChar1 = (int)i1 - 48;
                    testChar2 = (int)j1 - 48;
                    num2 = ((double)testChar1 / testChar2);
                }

                if (num == num2)
                {
                    numerator *= testChar1;
                    denominator *= testChar2;
                }
            }
        }

        for (int i = (int)Math.sqrt(denominator) + 1; i > 1; i--)
       {
            if (denominator % i == 0 && numerator % i == 0)
            {
                denominator /= i;
                numerator /= i;
            }
        }     
        System.out.println(denominator);
    }
}