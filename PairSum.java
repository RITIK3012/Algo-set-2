public class PairSum {
    public static String findPairWithSum(int[] A, int N, int X) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] + A[j] == X) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 5, 7, 11};
        int N = 6;
        int X = 9;
        System.out.println(findPairWithSum(A, N, X));
    }
}