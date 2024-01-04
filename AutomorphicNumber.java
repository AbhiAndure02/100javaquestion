//Input : 5
//        Output : 25
//        Explanation : Number = 5
//        when squared you get 25
//        as 25 ends with 5
public class AutomorphicNumber {
    static boolean isAtomorphicNumber(int n){

        int sqr= n*n;
        int x = sqr%10;
        if (x == n)
        return true;
        return false;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isAtomorphicNumber(5));

    }
}
