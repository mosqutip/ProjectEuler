import java.util.Arrays;

public class Problem38
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 9999; i++)
        {
            generateConcatenations(i);
        }
    }

    public static void generateConcatenations(int num)
    {
        String result = "";

        for (int i = 1; i <= 9; i++)
        {
            String next = Integer.toString(num * i);
            result = result + next;
            if (result.length() < 9)
                continue;
            else if (result.length() == 9)
            {
                if (checkPandigital(Integer.parseInt(result)))
                    System.out.println(num + "\t" + result);
                break;
            }
            else
                break;
        }
    }

    public static boolean checkPandigital(int num)
    {
        String test = "123456789";
        char[] c = Integer.toString(num).toCharArray();
        Arrays.sort(c);

        String numTest = new String(c);
        if (numTest.compareTo(test) == 0)
            return true;
        return false;
    }
}