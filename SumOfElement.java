public class SumOfElement {


    public static void main(String[] args) {
        int sum =0;
        int[] arr ={5,3,4,3,4,3,3};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum);
    }
}
