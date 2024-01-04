public class MinInArray {

    public static void main(String[] args) {
        int arr[] = {3,4,2,6,3,9,0};

        int min =arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}
