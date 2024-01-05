public class SmallestAndLargest {

    public static void main(String[] args) {
        int[] arr = {1,33,6,8,9,4,3};
        int n = arr.length;
        int max = arr[0];
        int min =arr[0];

        for (int i = 1; i < n; i++) {
            if (max< arr[i]){
                max =arr[i];

            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max is"+max+" and min is = "+min);
    }
}
