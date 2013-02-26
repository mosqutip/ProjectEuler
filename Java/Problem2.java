public class Problem2
{
    public static void main(String[] args)
    {
        int num1 = 1;
        int num2 = 2;
        int even = 2;
        
        int sum = num1 + num2;
        while (sum < 4000000)
        {
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
            if (sum % 2 == 0)
                even += sum;
        }
        
        System.out.println(even);
    }
}