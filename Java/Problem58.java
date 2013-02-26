public class Problem58
{
    public static void main(String[] args)
    {
        int inc = 8;
        double proportion = 1.0;

        int UR = 3, UL = 5, LL = 7, LR = 9;
        int URinc = 2, ULinc = 4, LLinc = 6, LRinc = 8;
        int[] currentDiagonals = new int[100000];
        int terms = 5, primes = 3;

        currentDiagonals[0] = 1;
        currentDiagonals[1] = 3;
        currentDiagonals[2] = 5;
        currentDiagonals[3] = 7;
        currentDiagonals[4] = 9;

        while (proportion >= 0.1)
        {
            URinc += inc;
            UR += URinc;
            currentDiagonals[terms] = UR;
            terms++;

            ULinc += inc;
            UL += ULinc;
            currentDiagonals[terms] = UL;
            terms++;

            LLinc += inc;
            LL += LLinc;
            currentDiagonals[terms] = LL;
            terms++;

            LRinc += inc;
            LR += LRinc;
            currentDiagonals[terms] = LR;
            terms++;

            int term = currentDiagonals[terms - 4], counter = (terms - 4 + 1);
            for (int i = 0; i <= 3; i++)
            {
                if (isPrime(term))
                    primes++;
                term = currentDiagonals[counter];
                counter++;
            }

            proportion = (double)primes / terms;
        }
        System.out.println((0.5 * (terms + 1)) + " " + proportion);
    }

    public static boolean isPrime(int num)
    {
        if (num < 2)
            return false;
        if (num == 2)
            return true;

        int limit = (int)Math.sqrt(num);

        for (int i = 2; i <= limit; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}