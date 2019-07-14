package array.easy;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int oddIndex = 0;
        int evenIndex = 1;
        int len = A.length;
        int temp;

        while (oddIndex < len && evenIndex < len) {
            // i is odd, but A[i] is not odd, waiting for switch the value of i
            while (oddIndex < len && A[oddIndex] % 2 == 0) {
                oddIndex += 2;
            }
            if (oddIndex >= len) {
                break;
            }

            while (evenIndex < len && A[evenIndex] % 2 != 0) {
                evenIndex += 2;
            }
            if (evenIndex < len ) {
                temp = A[oddIndex];
                A[oddIndex] = A[evenIndex];
                A[evenIndex] = temp;

                oddIndex += 2;
                evenIndex += 2;
            }
        }
        return A;
    }
}
