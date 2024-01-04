/*
Example
Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number
 */
public class AbundantNumber {
    static boolean isAbundantNumber(int n){

        int sum = 0;

     for (int i =1; i<n; i++){
         if(n%i==0){
             sum += i;
         }
     }
     if(sum>n)
         return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAbundantNumber(21));
    }
}
