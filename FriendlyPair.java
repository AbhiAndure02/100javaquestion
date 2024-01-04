/*
Example
Input : 6 28
Output : Yes, they are a friendly pair
Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
Now the sum of factors of both the numbers are 6 and 28 respectively.
When we divide the sums with the numbers we get 1 and 1 respectively.
As the ratio of both the number match, they are considered as a friendly pair.
 */
public class FriendlyPair {
    static int getDivisor(int n) {
        int sum =0;
        for (int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 28;


        if(getDivisor(number1)==number1 && getDivisor(number2)==number2){
            System.out.println("it is a friendly pair");
        }else System.out.println("not friendly pair");
    }
}
