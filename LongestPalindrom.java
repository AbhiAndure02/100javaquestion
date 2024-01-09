import java.util.Arrays;

public class LongestPalindrom {


    static boolean isPalindrom(int n){
        int divisor = 1;
        while(n/divisor >= 10)
            divisor *= 10;

        while(n != 0){
            int x= n/divisor;
            int y = n%10;
            if(x!= y){
                return false;
            }
            n = (n%divisor) /10;
            divisor = divisor/100;
        }
        return true;
    }
    public static int longestPalindrom(int[] arr, int n){
        Arrays.sort(arr);
        for (int i = n-1; i >= 0; i--) {
            if(isPalindrom(arr[i]))
                return  arr[i];

        }
        return -1;
    }


    public static void main(String[] args) {
        int []A = { 121, 2322, 54545, 999990 };
        int n = A.length;

// print required answer
        System.out.println(longestPalindrom(A, n));

    }
}
