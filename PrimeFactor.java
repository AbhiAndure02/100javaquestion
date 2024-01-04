public class PrimeFactor {

   public static int isprime(int n){
       for(int i = 2; i<=Math.sqrt(n); i++){
           if(n%i==0)
               return 0;
       }

       return 1;
   }



     public static void factor(int n) {
        {

            for (int i = 2; i <= n; i++) {
                if (isprime(i) == 1) {
                    int x = n;
                    while (x % i == 0) {
                        System.out.print(i + " ");
                        x /= i;
                    }
                }
            }

        }




        }

    public static void main(String[] args) {
        factor(12);
    }
    }
