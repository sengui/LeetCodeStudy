package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        int n;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - 1 != i && nums[i] != nums[nums[i] - 1]) {
                // swap nums[i] and nums[nums[i] - 1]
                n = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = n;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                resultList.add(i + 1);
            }
        }
        return resultList;
    }
}
