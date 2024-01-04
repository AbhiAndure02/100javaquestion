public class PrimeNumberRange {




    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        int count =0;
        for(int i=1; i<=n; i++){
            if(n % i ==0){
                count++;
            }

        }
        if (count > 2){
            return false;
        }
        return true;

    }


    public static void main(String[] args) {
        int l =3, h=18;

        for (int i = l; i <= h ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }

        }

    }
}
