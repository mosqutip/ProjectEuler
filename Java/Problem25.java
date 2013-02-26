import java.math.BigInteger;

public class Problem25
{
    public static void main(String[] args)
    {
        BigInteger currentTerm = BigInteger.ZERO;
        BigInteger n1 = BigInteger.ONE;
        BigInteger n2 = BigInteger.ONE;
        int counter = 2;
        boolean found = false;
        
        while (!found)
        {
            counter++;
            currentTerm = n1.add(n2);
            if (currentTerm.toString().toCharArray().length == 1000)
                found = true;
            else
            {
                n1 = n2;
                n2 = currentTerm;
            }
        }
        System.out.println("The first Fibonnaci number with 1000 digits is: "
                            + counter);
        System.out.println("This number is:\n" + currentTerm.toString());
    }
}