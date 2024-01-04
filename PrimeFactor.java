public class PrimeFactor {

   static boolean isprime(int n){
       if (n<2){
           return false;
       }
        int count =0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

      
            if (count>2){
                return false;
            }



        return true;

    }

    static void factor(int n){
        for (int i = 1; i <= n; i++) {

            if(n%i==0){
                if(isprime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        factor(12);


    }
}
