import java.util.Arrays;
import java.util.ArrayList;

public class Problem32
{
    static String master = "123456789";

    public static void main(String[] args)
    {
        ArrayList<Integer> products = new ArrayList<Integer>();
        int sum = 0;
        
        for (int i = 1; i <= 9876; i++)
        {
            for (int j = i; j <= 9876; j++)
            {
                int product = i * j;
                if (product > 987654321)
                    break;
                if (checkPandigitalProduct(i, j, product))
                {
                    if (!products.contains(product))
                        products.add(product);
                }
            }
        }

        for (int i : products)
            sum += i;
        System.out.println(sum);
    }

    public static boolean checkPandigitalProduct(int n1, int n2, int n3)
    {
        String concat = Integer.toString(n1) + Integer.toString(n2) + Integer.toString(n3);
        char[] c = concat.toCharArray();
        Arrays.sort(c);
        String test = new String(c);

        if (test.length() != master.length())
            return false;

        if (test.compareTo(master) == 0)
            return true;
        return false;
    }
}