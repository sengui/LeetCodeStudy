# [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)

### Summary 
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

#### Example 1:
    Input: [-4,-1,0,3,10]
    Output: [0,1,9,16,100]

#### Example 2:
    Input: [-7,-3,2,3,11]
    Output: [4,9,9,49,121]

#### Note:
  1. 1 <= A.length <= 10000
  2. -10000 <= A[i] <= 10000
  3. A is sorted in non-decreasing order.
 

## Solution 1

```java
class Solution {
    public int[] sortedSquares(int[] A) {
         int[] result = new int[A.length];

        int l = 0;
        int r = A.length - 1;
        int index = A.length - 1;
        while (l <= r) {
            if (Math.abs(A[l]) < Math.abs(A[r])) {
                result[index--] = A[r] * A[r];
                r--;
            } else {
                result[index--] = A[l] * A[l];
                l++;
            } 
        }
        return result;
    }
}
```

##### Notes:
  From the array left and the array right to the middle