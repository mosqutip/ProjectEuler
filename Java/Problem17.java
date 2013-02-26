public class Problem17
{
    public static void main(String[] args)
    {
        int ninety_nine_sum = 39 + 67 + 460 + (36 * 8);
        int one_hundred_sum = 10 + (99 * 13 + ninety_nine_sum);
        int two_hundred_sum = 10 + (99 * 13 + ninety_nine_sum);
        int three_hundred_sum = 12 + (99 * 15 + ninety_nine_sum);
        int four_hundred_sum = 11 + (99 * 14 + ninety_nine_sum);
        int five_hundred_sum = 11 + (99 * 14 + ninety_nine_sum);
        int six_hundred_sum = 10 + (99 * 13 + ninety_nine_sum);
        int seven_hundred_sum = 12 + (99 * 15 + ninety_nine_sum);
        int eight_hundred_sum = 12 + (99 * 15 + ninety_nine_sum);
        int nine_hundred_sum = 11 + (99 * 14 + ninety_nine_sum);
        int thousand_sum = 11;
        
        int sum = ninety_nine_sum + one_hundred_sum + two_hundred_sum + three_hundred_sum + four_hundred_sum + five_hundred_sum + six_hundred_sum + seven_hundred_sum + eight_hundred_sum + nine_hundred_sum + thousand_sum;
        
        System.out.println(sum);
    }
}