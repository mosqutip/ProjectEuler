public class Problem45
{
    static double tStart = 286;
    static double pStart = 166;
    static double hStart = 144;

    public static void main(String[] args)
    {
        double test = 0;
        boolean found = false;
        while (!found)
        {
            double hex = generateHexagonal();
            double pent = generatePentagonal();
            while (pent < hex)
            {
                pent = generatePentagonal();
            }
            if (pent == hex)
            {
                found = true;
                test = pent;
            }
        }
        System.out.println(test);
    }

    public static double generateTriangle(double num)
    {
        double result = (num * ((num + 1)) / 2);
        tStart++;
        return result;
    }

    public static double generatePentagonal()
    {
        double result = (pStart * ((3 * pStart) - 1) / 2);
        pStart++;
        return result;
    }

    public static double generateHexagonal()
    {
        double result = (hStart * ((2 * hStart) - 1));
        hStart++;
        return result;
    }
}