public class Problem4
{
    public static void main(String[] args)
    {
        int num1 = 999;
        int num2 = 999;
        int max = 0;
        
        for (int i = num1; i > 99; i--)
        {
            for (int j = num2; j > 99; j--)
            {
                int product = (i * j);
                String test = Integer.toString(product);
                StringBuffer reversed = new StringBuffer(test);
                if (test.compareTo(new String(reversed.reverse())) == 0)
                {
                    if (product > max)
                        max = product;
                }
            }
        }
        
        System.out.println(max);
    }
}