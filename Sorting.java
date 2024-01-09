import java.util.Arrays;

public class Sorting {

    public static int[] sorting(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,40,20,30};
        System.out.println(Arrays.toString(sorting(arr,4)));

    }
}
