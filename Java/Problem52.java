import java.util.Arrays;

public class Problem52
{
    public static void main(String[] args)
    {
        int x = 100, x2, x3, x4, x5, x6;
        
        while(true)
        {
            x2 = x * 2;
            x3 = x * 3;
            x4 = x * 4;
            x5 = x * 5;
            x6 = x * 6;

            char[] xChar = Integer.toString(x).toCharArray();
            Arrays.sort(xChar);
            String xString = new String(xChar);

            char[] x2Char = Integer.toString(x2).toCharArray();
            Arrays.sort(x2Char);
            String x2String = new String(x2Char);

            char[] x3Char = Integer.toString(x3).toCharArray();
            Arrays.sort(x3Char);
            String x3String = new String(x3Char);

            char[] x4Char = Integer.toString(x4).toCharArray();
            Arrays.sort(x4Char);
            String x4String = new String(x4Char);

            char[] x5Char = Integer.toString(x5).toCharArray();
            Arrays.sort(x5Char);
            String x5String = new String(x5Char);

            char[] x6Char = Integer.toString(x6).toCharArray();
            Arrays.sort(x6Char);
            String x6String = new String(x6Char);
            
            if (xString.compareTo(x2String) == 0 && xString.compareTo(x3String) == 0
            && xString.compareTo(x4String) == 0 && xString.compareTo(x5String) == 0
            && xString.compareTo(x6String) == 0)
                break;

            if ((x + 1) == 200)
                x = 1000;
            else if ((x + 1) == 2000)
                x = 10000;
            else if ((x + 1) == 20000)
                x = 100000;
            else if ((x + 1) == 200000)
                x = 1000000;
            else
                x++;
        }
        System.out.println(x);
    }
}