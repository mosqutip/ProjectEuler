public class Problem36
{
    public static void main(String[] args)
    {
        int sum = 0;
        
        for (int i = 1; i < 1000000; i += 2)
        {
            String decimalNum = Integer.toString(i);
            String binaryNum = Integer.toBinaryString(i);
            
            StringBuffer decimal = new StringBuffer(decimalNum);
            StringBuffer binary = new StringBuffer(binaryNum);
            decimal = decimal.reverse();
            binary = binary.reverse();
            
            String dec = decimal.toString();
            String bin = binary.toString();
            
            if (decimalNum.compareTo(dec) == 0)
                if (binaryNum.compareTo(bin) == 0)
                    sum += i;
        }
        System.out.println(sum);
    }
}