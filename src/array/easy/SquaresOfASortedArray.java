package array.easy;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];

        int l = 0;
        int r = A.length - 1;
        int index = A.length - 1;
        while (l <= r) {
            if (Math.abs(A[l]) < Math.abs(A[r])) {
                result[index--] = A[r] * A[r];
                r--;
            } else {
                result[index--] = A[l] * A[l];
                l++;
            }
        }
        return result;
    }
}
