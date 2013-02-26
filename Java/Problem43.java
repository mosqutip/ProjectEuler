import java.util.Arrays;

public class Problem43
{
    static long[] longArr = new long[3265920];
    static int next = 0;

    public static void main(String[] args)
    {
        generatePandigitals("", "0123456789");
        checkPandigitals();
    }

    public static void generatePandigitals(String beginningString, String endingString)
    {
        if (endingString.length() <= 1)
        {
            long num = Long.parseLong(beginningString + endingString);
            if (num >= 1023456789)
            {
                longArr[next] = num;
                next++;
            }
        }
        else
        {
            for (int i = 0; i < endingString.length(); i++) {
                try
                {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                    generatePandigitals(beginningString + endingString.charAt(i), newString);
                }
                catch (StringIndexOutOfBoundsException exception)
                {
                    exception.printStackTrace();
                }
            }
        }
    }    

    public static void checkPandigitals()
    {
        long sum = 0L;
        for (int i = 0; i < longArr.length; i++)
        {
            long counter = longArr[i];
            if (counter % 9 == 0)
            {
                String test = Long.toString(counter);
                String firstPrime = test.substring(test.length() - 3, test.length());
                if (Integer.parseInt(firstPrime) % 17 == 0)
                {
                    String secondPrime = test.substring(test.length() - 4, test.length() - 1);
                    if (Integer.parseInt(secondPrime) % 13 == 0)
                    {
                        String thirdPrime = test.substring(test.length() - 5, test.length() - 2);
                        if (Integer.parseInt(thirdPrime) % 11 == 0)
                        {
                            String fourthPrime = test.substring(test.length() - 6, test.length() - 3);
                            if (Integer.parseInt(fourthPrime) % 7 == 0)
                            {
                                String fifthPrime = test.substring(test.length() - 7, test.length() - 4);
                                if (Integer.parseInt(fifthPrime) % 5 == 0)
                                {
                                    String sixthPrime = test.substring(test.length() - 8, test.length() - 5);
                                    if (Integer.parseInt(sixthPrime) % 3 == 0)
                                    {
                                        String seventhPrime = test.substring(test.length() - 9, test.length() - 6);
                                        if (Integer.parseInt(seventhPrime) % 2 == 0)
                                        {
                                            char[] toSort = test.toCharArray();
                                            Arrays.sort(toSort);
                                            String sorted = new String(toSort);
                                            if (sorted.compareTo("0123456789") == 0)
                                                sum += counter;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}