# [Array Partition I](https://leetcode.com/problems/array-partition-i/)
### Summary 
Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., 
(an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
#### Example:
    Input: [1,4,3,2]    
    
    Output: 4
    Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4). 

#### Notes: 
    1. **n** is a positive integer, which is in the range of [1, 10000].
    2. All the integers in the array will be in the range of [-10000, 10000].


## Solution
```java
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
```
##### Notes: 
  sort array, then result is sum of the odd of value in the array



