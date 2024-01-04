public class Factorial {

    public static int factorial(int n){

        if(n==0 || n==1){
            return 1;
        }



        return n*factorial(n-1);
    }

    public static int sceondMethod(int n){
        if(n==0){
            return 1;

        }
        int val =1;
        for (int i = 1; i <= n; i++) {
            val *= i;

        }
        return val;
    }
    public static void main(String[] args) {
        int a= 1;
        System.out.println(factorial(0));
        System.out.println(sceondMethod(0));
    }

}
