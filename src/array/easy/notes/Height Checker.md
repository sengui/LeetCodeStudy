# [Height Checker](https://leetcode.com/problems/height-checker/)
### Summary 
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students not standing in the right positions.
(This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)

#### Example:
    Input: [1,1,4,2,1,3]    
    Output: 3
    Explanation: Students with heights 4, 3 and the last 1 are not standing in the right positions. 

#### Notes: 
    1. 1 <= heights.length <= 100
    2. 1 <= heights[i] <= 100


## Solution
```java
    public class HeightChecker {
        public int heightChecker(int[] heights) {
            int len = heights.length;
            int[] extraArr = new int[len];
            for (int i = 0; i < len; i++) {
                extraArr[i] = heights[i];
            }
            quickSort(extraArr, 0 ,len-1);
    
            int result = 0;
            for (int i = 0; i < len; i++) {
                if (heights[i] != extraArr[i]) {
                    result++;
                }
            }
            return result;
        }
    
        private void quickSort(int[] arr, int l, int r) {
            if (l < r) {
                int mod = partition(arr, l, r);
                quickSort(arr, l, mod - 1);
                quickSort(arr, mod + 1, r);
            }
        }
    
        private int partition(int[] arr, int l, int r) {
            int privot = arr[l];
            while (l < r) {
                while (l < r && arr[r] >= privot) {
                    r--;
                }
                if (l < r) {
                    arr[l++] = arr[r];
                }
    
                while (l < r && arr[l] <= privot) {
                    l++;
                }
                if (l < r) {
                    arr[r--] = arr[l];
                }
            }
            arr[l] = privot;
    
            return l;
        }
    
    }
```
##### Notes: 
  Sort the array and count the number different from the original array value



