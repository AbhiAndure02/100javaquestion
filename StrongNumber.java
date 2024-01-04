public class StrongNumber {

    static boolean isStrong(int n){
        int sum =0;
        int orginal = n;
        while(n!=0){
            int rem = n %10;
            sum += factoril(rem);
            n = n/10;

        }


        if(orginal == sum)
            return true;
        return false;
    }
   static int factoril(int n){

        if (n==0){
            return 1;
        }
      ;
        return n* factoril(n-1);
   }

    public static void main(String[] args) {

        System.out.println(isStrong(145));

    }
}
