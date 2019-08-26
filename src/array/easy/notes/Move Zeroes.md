# [Move Zeroes](https://leetcode.com/problems/move-zeroes/)
### Summary 
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements. 

#### Example:
    Input: [0,1,0,3,12]   
    Output: [1,3,12,0,0]  

#### Notes: 
    1. You must do this **in-place** without making a copy of the array
    2. Minimize the total number of operations.


## Solution
```java
    public class MoveZeroes {
        public void moveZeroes(int[] nums) {
            int len = nums.length;
            int n = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    nums[n++] = nums[i];
                }
            }
            for (int i = n; i < len; i++) {
                nums[i] = 0;
            }
        }
    }
```



