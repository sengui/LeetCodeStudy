package array.easy;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        boolean[] extraArray = new boolean[max - min + 1];
        for (int n : nums) {
            if (extraArray[n - min]) {
                return true;
            } else {
                extraArray[n - min] = true;
            }
        }
        return false;
    }
}
