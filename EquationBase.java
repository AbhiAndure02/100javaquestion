//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
//
//Time:- O(n)
//
//Space:- O(1)
//
//Input:- 10
//
//Output:- 5 11 14 17 23 26 29 35 38


public class EquationBase {
    public static void equation(int n){
        int temp =0;
        int i=0;
        int x = 0;
        while(i<n){
            temp = (3*x)+2;
            if(temp % 4 != 0){
                System.out.println(temp);
                i++;
            }
            x++;

        }
    }
    public static void main(String[] args) {
        int number = 10;
        equation(number);
    }
}
