# [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
### Summary 
Given an array of integers, find if the array contains any duplicates.  

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.  

#### Example 1:
    Input: [1,2,3,1]      
    Output: true

#### Example 2:
    Input: [1,2,3,4]      
    Output: false

#### Example 3:
    Input: [1,1,1,3,3,4,3,2,4,2]      
    Output: true

## Solution
```java
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
```



