package org.data.stack.easy;


public class MajorityElement {

    public int majorityElement(int[] nums) {
        int key = nums[0];
        int times = 0;

        int halfLength = nums.length / 2;

        for (int n : nums) {
            if (key == n) {
                times ++;
            }else {
                times --;
            }

            if (times < 1){
                key = n;
                times = 1;
            } else if (times > halfLength) {
                break;
            }
        }

        return key;
    }
}
