import java.util.Arrays;

public class Countfrequence {

    public static void frequencyCounter(int[] arr, int n){
        Arrays.sort(arr);

        for(int j = 0; j < n-1; j++) {
            int count =1;

            while(j<n-1 && arr[j] == arr[j+1]){
                count++;
                j++;
            }
            System.out.println(arr[j]+" "+count);
            count++;

        }

    }

    public static void main(String[] args) {
        int[] nums ={5,8,5,7,8,10};
        frequencyCounter(nums, nums.length);

    }
}

/*
we have to calculate the count  of the individual number
so what we can do
sort the array first then
we can use for loop from 0 to n-1
and we can check up to j is less than n-1 and arr[j] = arr[j+1]



 */
