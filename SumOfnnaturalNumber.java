public class SumOfnnaturalNumber {
    int sum(int n){
        int sum1 = n*(n+1)/2;


        return sum1;
    }

    public static void main(String[] args) {
        SumOfnnaturalNumber obj = new SumOfnnaturalNumber();
        System.out.println(obj.sum(10));

    }
}
