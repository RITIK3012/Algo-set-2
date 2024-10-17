public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i + 1;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumIndex(arr1)); 

        int[] arr2 = {1, 2, 3};
        System.out.println(findEquilibriumIndex(arr2)); 
    }
}