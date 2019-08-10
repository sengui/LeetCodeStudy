package array.easy;

public class PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] A) {
        int avg;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        avg = sum / 3;

        sum = 0 ;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum == avg) {
                sum = 0 ;
                count ++;
            }
        }
        if (count == 3) {
            return true;
        }

        return false;
    }
}
