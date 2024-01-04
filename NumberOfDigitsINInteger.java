public class NumberOfDigitsINInteger {
    public static void main(String[] args) {
        int n = 1234;

        int ans = (int)Math.log10(n)+1;
        System.out.println(ans);
        System.out.println(NumerOfCount.numerOfDigit(n));

    }
}

//second Approach
class NumerOfCount
{
   static int numerOfDigit(int n){
       int count =0;
       while(n!=0){
           n = n/10;
           count++;
       }
       return count;
   }
}
