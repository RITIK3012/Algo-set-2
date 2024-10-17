public class Icount {
    public static int countInversions(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 6, 3};
        int result = countInversions(arr);
        System.out.println("Number of inversions: " + result);
    }
}
