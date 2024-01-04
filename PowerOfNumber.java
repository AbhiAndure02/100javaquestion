public class PowerOfNumber {

    static long powerOfNumber(int a, int b){
        long result = 1;

        for (int i = 1; i <= b; i++) {
            result = result*a;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(2,32));

    }
}
