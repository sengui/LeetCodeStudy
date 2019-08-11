package array.easy;

public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        int asc = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                if (asc == 0) {
                    asc = 1;
                } else if (asc == -1){
                    return false;
                }
            } else if (A[i] < A[i - 1]) {
                if (asc == 0) {
                    asc = -1;
                } else if (asc == 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
