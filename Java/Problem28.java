public class Problem28
{
    public static void main(String[] args)
    {
        int[][] numArr = new int[1001][1001];
        int length = numArr.length, row = 0;
        int num = numArr.length * numArr.length;

        while (row <= ((numArr.length - 1) / 2))
        {
            for (int i = (length - 1); i >= row; i--)
            {
                numArr[i][row] = num;
                num--;
            }
            for (int i = row + 1; i <= (length - 1); i++)
            {
                numArr[row][i] = num;
                num--;
            }
            for (int i = row + 1; i <= (length - 1); i++)
            {
                numArr[i][(length - 1)] = num;
                num--;
            }
            for (int i = (length - 2); i >= row + 1; i--)
            {
                numArr[(length - 1)][i] = num;
                num--;
            }
            length--;
            row++;
        }

        long sum = 0;
        int arrLength = numArr.length - 1;
        for (int i = 0; i <= arrLength; i++)
        {
            sum += numArr[i][i];
            sum += numArr[(arrLength - i)][i];
        }
        sum -= 1;
        System.out.println(sum);
    }
}