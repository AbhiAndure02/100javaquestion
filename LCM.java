public class LCM
{
    public static void main (String[]args)
    {
        int num1 = 36, num2 = 60, lcm = 0;

        // finding the larger number here
        int max1 = Math.max(num1,num2);


        for (int i = max1; i <= num1 * num2; i++)
        {
            if (i % num1 == 0 && i % num2 == 0)
            {
                lcm = i;
                break;
            }
        }
        System.out.println ("The LCM: " + lcm);
    }
}