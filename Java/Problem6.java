public class Problem6
{
    public static void main(String[] args)
    {
        int squareOfSum = 0;
        int sumOfSquares = 0;
        
        for (int i = 1; i <= 100; i++)
        {
            squareOfSum += i;
            sumOfSquares += (i*i);
        }
        squareOfSum *= squareOfSum;
        
        int diff = squareOfSum - sumOfSquares;
        System.out.println(diff);
    }
}