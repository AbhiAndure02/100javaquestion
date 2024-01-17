import java.util.Arrays;

public class RningSumOf1dArray {

    public static int[] arraySum(int[] arr, int n){

        int[] ans = new int[n];
        ans[0] = arr[0];
        for (int i = 1; i < n; i++) {
            ans[i]=ans[i-1]+arr[i];
        }


        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;

        System.out.println(Arrays.toString(arraySum(arr,n)));

    }
}
