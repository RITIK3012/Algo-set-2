public class MaximumSubarray {
    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int subarraySum = 0;
                for (int k = i; k <= j; k++) {
                    subarraySum += nums[k];
                }
                if (subarraySum > maxSum) {
                    maxSum = subarraySum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubarraySum(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}