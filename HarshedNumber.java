/*
Question :
check the given number is harshed number or not
if number is divisible by the sum of that individual digit
 */
public class HarshedNumber {

    static boolean isHarshNumber(int n){
        int org = n;
        int sumOfDigit =0;
        while (n!=0){
            int rem = n%10;
            sumOfDigit += rem;
            n = n/10;
        }
        if (org % sumOfDigit ==0){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHarshNumber(21));
    }
}
