import java.util.Arrays;

public class MinOperation {

    static int minOperation(int[] arr, int n){

        Arrays.sort(arr);
        int step =0;
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            while (i<n-1 && arr[i+1]==current){
                i++;
            }
            if(i<n-1) {
                int next = arr[i + 1];
                if (next == current * 2 || next == current * 3) {
                    i++;
                }
            }
            step++;

        }
        return step;
    }



    public static void main(String[] args) {
        int arr[] ={2,3,2,3};
        int n = arr.length;
        System.out.println(minOperation(arr, n));
    }
}
