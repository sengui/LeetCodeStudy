package array.easy;

public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int or = nums.length;
        int oc = nums[0].length;
        if (or * oc != r * c) {
            return nums;
        }

        int[][] arr = new int[r][c];
        int k = 0;
        int m = 0;

        for (int i = 0; i < or; i++) {
            for (int j = 0; j < oc; j++) {
                arr[k][m++] = nums[i][j];
                if (m >= c) {
                    m = 0;
                    k++;
                }
            }
        }

        return arr;
    }
}
