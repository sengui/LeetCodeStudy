# [697. Degree of an Array](https://leetcode.com/problems/degree-of-an-array/)
### Summary 
Given a non-empty array of non-negative integers *nums*, the degree of this array is defined as the **maximum** frequency of any one of its elements.  
  
Your task is to find the smallest possible length of a (contiguous) subarray of *nums*, that has the same degree as *nums*.  

#### Example 1:
    Input: [1, 2, 2, 3, 1]      
    Output: 2  
    Explanation： The input array has a degree of 2 because both elements 1 and 2 appear twice.  
                  Of the subarrays that have the same degree: [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]  
                  The shortest length is 2. So return 2.

#### Example 2:
    Input: [1,2,2,3,1,4,2]       
    Output: 6

#### Note:   
    1. nums.length will be between 1 and 50,000.
    2. nums[i] will be an integer between 0 and 49,999.

## Solution
```java
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
```



