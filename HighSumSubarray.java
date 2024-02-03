public class HighSumSubarray {
//using kandels algorithm
    static int sumOfSubArray(int[] nums){
        int n = nums.length;
        int currSum = nums[0];
        int totalSum = nums[0];

        for (int i = 1; i < n; i++) {
            if(nums[i] > currSum+nums[i]){
                currSum = nums[i];
            }else {
                currSum = currSum +nums[i];
            }
            if(currSum>totalSum){
                totalSum = currSum;
            }

        }
        return totalSum;

    }


    public static void main(String[] args) {
        int[] num = {-1,4,-6,8};

        System.out.println(sumOfSubArray(num));

    }

}
