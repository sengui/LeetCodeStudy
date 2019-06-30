# [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)
### Summary 
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

#### Example 1:
Input: [3,1,2,4]  
Output: [2,4,3,1]  
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.  

### Note:
  1. 1 <= A.length <= 5000  
  2. 0 <= A[i] <= 5000




## Solution 
```java
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int n ;
        while (l < r){
            if (A[l] % 2 != 0){
                if(A[r] % 2 == 0){
                    n = A[l];
                    A[l] = A[r];
                    A[r] = n;
                    l++;
                    r--;
                }else {
                    r--;
                }
            } else {
                l++;
            }
        }
        return A;
    }
}
```

##### Notes:
  + With the idea of QuickSort  
  + Time complexity: O(n)  
  + Space complexity: O(1)