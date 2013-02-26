public class Problem35
{
    public static void main(String[] args)
    {
        int circulars = 1;
        for (int i = 3; i <= 1000000; i += 2)
            if (circular(i))
                circulars++;
        System.out.println(circulars);
    }
    
    public static int rotate(int num)
    {
        String initial = Integer.toString(num);
        StringBuilder builder = new StringBuilder(initial.substring(1, initial.length()));
        builder.append(initial.charAt(0));
        int result = Integer.parseInt(builder.toString());
        return result;
    }
    
    public static boolean circular(int num)
    {
        for (char c : Integer.toString(num).toCharArray())
            if (c == '0')
                return false;
        int length = Integer.toString(num).length();
        for (int i = 1; i <= length; i++)
        {
            if (!isPrime(num))
                return false;
            num = rotate(num);
        }
        return true;
    }

    public static boolean isPrime(int num)
    {
        if (num < 2)
                return false;
        if (num == 2 || num == 3)
            return true;

        int limit = (int)Math.sqrt(num);

        for (int i = 2; i <= limit; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}