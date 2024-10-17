public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;

       
        for (int i = 0; i < k; i++) {
            int maxIndex = 0;

          
            for (int j = 1; j < n; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }

            
            if (i == k - 1) {
                return nums[maxIndex];
            }

           
            nums[maxIndex] = Integer.MIN_VALUE; 
        }

        
        return -1; 
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println(findKthLargest(nums1, k1)); 

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println(findKthLargest(nums2, k2));
    }
}