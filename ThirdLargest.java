public class ThirdLargest {
    static int thirdLargest(int[] nums, int n){
        int first = nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i]>first){
                first = nums[i];
            }
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i]<first && nums[i]>second){
                second = nums[i];
            }
        }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i]<second && nums[i]>third){
                third = nums[i];

            }

        }

        return third;
    }


    public static void main(String[] args) {
        int[]  arr = {1,4,7,16,14,14,15};
        int n = arr.length;
        System.out.println(thirdLargest(arr,n));
    }
}
