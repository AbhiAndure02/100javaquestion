public class PalindromeNumber {

    public static void main(String[] args) {

        int n = 1701;
        System.out.println(isPalindrom(n));
    }

    public static boolean isPalindrom(int n) {

        int orginalNumber = n;
        int rev =0;

        while(n!=0){
            int digit = n % 10;
            rev =  rev*10+digit;
            n /= 10;
        }
        if(rev == orginalNumber) {
            return true;
        }
        return false;
    }
}
