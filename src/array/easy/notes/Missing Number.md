# [268. Missing Number](https://leetcode.com/problems/missing-number/)
### Summary 
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array. 

#### Example 1:
    Input: [3,0,1]
    Output: 2

#### Example 2:
    Input: [9,6,4,2,3,5,7,0,1]
    Output: 8

#### Notes: 
    Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?  


## Solution
```java
    public class MissingNumber {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int sum =0;
            int sumN = ((n)*(n+1))/2;
            for(int i= 0;i<n;i++)
                sum+=nums[i];
            return sumN-sum;
        }
    }
```

