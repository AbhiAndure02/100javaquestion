import java.util.Arrays;

public class ReverseAnArray {
    public static void reverseArray(int[] arr, int n) {

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
       reverseArray(arr,n);

    }
}
