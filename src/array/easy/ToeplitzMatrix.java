package array.easy;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean result = true;
        int ele;
        int rLen = matrix.length;
        int cLen = matrix[0].length;

        int k, m;

        for (int i = 0; i < rLen; i++) {
            ele = matrix[i][0];
            k = i + 1;
            m = 1;
            while (k < rLen && m < cLen) {
                if (matrix[k][m] != ele){
                    result = false;
                    break;
                }
                k++;
                m++;
            }
            if (!result) {
                break;
            }
        }

        for (int j = 1; j < cLen; j++) {
            ele = matrix[0][j];
            k = 1;
            m = j + 1;
            while (k < rLen && m < cLen) {
                if (matrix[k][m] != ele){
                    result = false;
                    break;
                }
                k++;
                m++;
            }
            if (!result) {
                break;
            }
        }
        return result;
    }
}
