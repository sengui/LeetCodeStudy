package array.easy;

public class DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int len = max - min + 1;
        int[] arr = new int[len];
        int[] begin = new int[len];
        int[] end = new int[len];

        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] - min;
            if (arr[index] == 0) {
                begin[index] = i;
                end[index] = i;
            } else {
                end[index] = i;
            }
            arr[index] ++;
            if (arr[index] > degree) {
                degree = arr[index];
            }
        }

        int minLen = nums.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == degree) {
                minLen = Math.min(minLen, end[i] - begin[i] + 1);
            }
        }
        return minLen;
    }
}
