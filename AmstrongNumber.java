public class AmstrongNumber {
    static boolean isAmastrong(int n){
       int orgNumber = n;
       int sum =0;

       while(n!=0){
           int rem = n%10;
           sum += rem*rem*rem;
           n =n/10;

       }
       if(orgNumber == sum ){
           return true;

       }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(isAmastrong(371));
    }
}
