# [Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/)
### Summary 
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.
#### Example:
    Input: [4,2,5,7]  
    Output: [4,5,2,7]  
    Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
    
#### Notes: 
    1. 2 <= A.length <= 20000  
    2. A.length % 2 == 0  
    3. 0 <= A[i] <= 1000  


## Solution
```java
    public class SortArrayByParityII {
        public int[] sortArrayByParityII(int[] A) {
            int oddIndex = 0;
            int evenIndex = 1;
            int len = A.length;
            int temp;
    
            while (oddIndex < len && evenIndex < len) {
                // i is odd, but A[i] is not odd, waiting for switch the value of i
                while (oddIndex < len && A[oddIndex] % 2 == 0) {
                    oddIndex += 2;
                }
                if (oddIndex >= len) {
                    break;
                }
    
                while (evenIndex < len && A[evenIndex] % 2 != 0) {
                    evenIndex += 2;
                }
                if (evenIndex < len ) {
                    temp = A[oddIndex];
                    A[oddIndex] = A[evenIndex];
                    A[evenIndex] = temp;
    
                    oddIndex += 2;
                    evenIndex += 2;
                }
            }
            return A;
        }
    }
```
##### Notes: 
  Exchange the value of an even index that does not meet the condition with the value of an odd index



