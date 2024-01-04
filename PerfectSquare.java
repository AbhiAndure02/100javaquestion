public class PerfectSquare {
    static boolean isPerfectSquare(int n){
        if(n >= 0){
            int number = (int)Math.sqrt(n);
            return ((number*number) ==0 );
        }

        return false;
    }

    public static void main(String[] args) {
        int x= 84;
        if (isPerfectSquare(x))
            System.out.println("True");
        else System.out.println("False");
    }
}
