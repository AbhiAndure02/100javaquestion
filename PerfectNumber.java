//Input : 6
//        Output : Yes, it's a Perfect Number
//        Since, 6 = 1 + 2 + 3 (which are its divisors)
public class PerfectNumber {
    public static boolean isPerfect(int n){
        int sum = 0;


        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                sum += i;
            }
        }
        if (sum == n)
            return true;

        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
}
