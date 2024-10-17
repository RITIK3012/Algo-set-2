import java.util.Arrays;

public class MaxLengthSubarray {
    public static int[] findMaxLengthSubarray(int[] nums, int target) {
        int maxLength = 0;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target) {
                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }

        if (maxLength == 0) {
            return new int[0]; 
        }

        return Arrays.copyOfRange(nums, startIndex, endIndex + 1);
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int target = 8;
        int[] result = findMaxLengthSubarray(nums, target);
        System.out.println(Arrays.toString(result)); 
    }
}