public class MaxInArray {
    public static void main(String[] args) {

        int arr[] = {12, 13, 1, 10, 34, 10};
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
