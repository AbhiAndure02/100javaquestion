public class BinaryToDecimal {

    public static void main(String[] args) {
        int binary = 10101;

        int decimal =0;
        int n =0;
        while (binary > 0)
        {
            int temp = binary%10;
            decimal+= temp*Math.pow(2,n);
            binary = binary/10;
            n++;
        }
        System.out.println(decimal);

    }
}
