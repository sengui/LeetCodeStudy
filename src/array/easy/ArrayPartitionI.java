package array.easy;

public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        int[] extraNums = new int[20001];
        int len = nums.length;
        int result = 0;
        boolean flag = true;

        for (int i = 0; i < len; i++) {
            extraNums[nums[i]+10000]++;
        }

        int num;
        for (int i = 0, l = extraNums.length; i < l; i++) {
            num = extraNums[i];
            while (num > 0) {
                if (flag) {
                    result += i-10000;
                }
                flag = !flag;
                num--;
            }
        }
        return result;
    }
}
