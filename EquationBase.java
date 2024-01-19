//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
//
//Time:- O(n)
//
//Space:- O(1)
//
//Input:- 10
//
//Output:- 5 11 14 17 23 26 29


public class EquationBase {
    public static void equaltion(int n){
        int temp =0;
        for (int i = 1; i <= n; i++) {
            temp = (3*i)+2;
            if(temp % 4 != 0){
                System.out.println(temp);
            }

        }
    }
    public static void main(String[] args) {
        int number = 10;
        equaltion(number);
    }
}
