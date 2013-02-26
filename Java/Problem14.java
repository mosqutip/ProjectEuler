import java.util.HashMap;
import java.util.ArrayList;

public class Problem14
{
    public static void main(String[] args)
    {
        HashMap<Double, Integer> values = new HashMap<Double, Integer>();
        ArrayList<Double> progress = new ArrayList<Double>();
        
        int begin = 1, end = 1000000, maxSeqLength = 0, num = 0;
        for (int i = begin; i < end; i++)
        {
            double start = i;
            int seqLength = 0, iter = 0;
            while (start != 1.0)
            {
                if (values.containsKey(start))
                {
                    seqLength += values.get(start);
                    start = 1;
                }
                else
                {
                    if (progress.size() < 1001)
                        progress.add(start);
                    if (start % 2 == 0)
                        start /= 2;
                    else
                        start = (start * 3) + 1;
                    seqLength++;
                }
            }
            for (int j = 0; j < progress.size(); j++)
            {
                if (!values.containsKey(progress.get(j)))
                    values.put(progress.get(j), seqLength - j);
            }
            progress.clear();
            if (seqLength > maxSeqLength)
            {
                maxSeqLength = seqLength;
                num = i;
            }
        }
        System.out.println("The number " + num + " produces a sequence " + maxSeqLength + " numbers long.");
    }
}