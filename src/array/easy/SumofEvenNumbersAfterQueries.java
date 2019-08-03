package array.easy;

import java.util.Arrays;

public class SumofEvenNumbersAfterQueries {

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4};
        int[][] queries = new int[][]{{1,0},{-3,1},{-4,0},{2,3}};

        SumofEvenNumbersAfterQueries sumofEvenNumbersAfterQueries = new SumofEvenNumbersAfterQueries();
        int[] result = sumofEvenNumbersAfterQueries.sumEvenAfterQueries(A, queries);
        System.out.println(Arrays.toString(result));
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int sumEven = 0;
        int len = A.length;
        int result[] = new int[queries.length];
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                sumEven += A[i];
            }
        }

        boolean isOldEven = false;
        boolean isNewEven = false;
        for (int i = 0; i < queries.length; i++) {
            isOldEven = A[queries[i][1]] % 2 ==0;
            isNewEven = queries[i][0] % 2 ==0;
            if (isOldEven && isNewEven) {
                sumEven += queries[i][0];
            } else if(!isOldEven && !isNewEven){
                sumEven += queries[i][0] + A[queries[i][1]];
            } else if (isOldEven) {
                sumEven -=  A[queries[i][1]];
            }
            A[queries[i][1]] += queries[i][0];
            result[i] = sumEven;
        }

        return result;
    }
}
