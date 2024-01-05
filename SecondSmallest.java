public class SecondSmallest {
    public static int secsmallest(int[] arr, int n){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            if (arr[i]  < first) {
                first = arr[i];

            }
            else if(second>arr[i]){
                second = arr[i];
            }


        }
        return second;
    }
    public static void main(String[] args) {
        int[ ] arr = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.println(secsmallest(arr, n));


    }
}
