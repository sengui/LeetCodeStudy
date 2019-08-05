# [Duplicate Zeros](https://leetcode.com/problems/duplicate-zeros/)
### Summary 
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.  

Note that elements beyond the length of the original array are not written.  

Do the above modifications to the input array in place, do not return anything from your function.  

#### Example 1:
    Input: [1,0,2,3,0,4,5,0]      
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]  

#### Example 2:
    Input: [1,2,3]      
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,2,3]  


#### Notes: 
    1. 1 <= arr.length <= 10000  
    2. 0 <= arr[i] <= 9  


## Solution
```java
    public class DuplicateZeros {
        public void duplicateZeros(int[] arr) {
            int len  = arr.length;
            int count = 0;
            int i = 0;
            for (i = 0; i < len; i++) {
                if (arr[i] == 0) {
                    count++;
                }
                count++;
                if (count >= len) {
                    break;
                }
    
            }
    
            int index = len - 1;
            if (count > len) {
                arr[index--] = arr[i--];
            }
    
            while (index >= 0 && i >= 0) {
                if (arr[i] == 0) {
                    arr[index--] = 0;
                    arr[index--] = 0;
                    i--;
                }
                else {
                    arr[index--] = arr[i--];
                }
            }
    
        }
    }
```



