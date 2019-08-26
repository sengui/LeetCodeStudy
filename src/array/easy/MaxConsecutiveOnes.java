package array.easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                n++;
            } else {
                if (n > max) {
                    max = n;
                }
                n = 0;
            }
        }
        if (n > max) {
            max = n;
        }
        return max;
    }
}
