public class SumeOfNumber {
    static int sumOfNumber(int number){
        int sum =0;

        while(number != 0){
            int digit = number%10;
            sum += digit;
            number /= 10;

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumber(1234));

    }
}
