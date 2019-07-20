# [Relative Sort Array](https://leetcode.com/problems/relative-sort-array/)
### Summary 
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  
Elements that don't appear in arr2 should be placed at the end of arr1 in **ascending** order.

#### Example:
    Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]    
    Output: [2,2,2,1,4,3,3,9,6,7,19]

#### Constraints:: 
    + arr1.length, arr2.length <= 1000
    + 0 <= arr1[i], arr2[i] <= 1000
    + Each arr2[i] is distinct.
    + Each arr2[i] is in arr1.


## Solution
```java
    public class RelativeSortArray {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int len1 = arr1.length;
            int len2 = arr2.length;
    
            int[] extraArr = new int[1001];
            for (int i = 0; i < len1; i++) {
                extraArr[arr1[i]]++;
            }
    
            int index = 0;
            for (int i = 0; i < len2; i++) {
                while (extraArr[arr2[i]] > 0) {
                    arr1[index++] = arr2[i];
                    extraArr[arr2[i]]--;
                }
            }
            for (int i = 0; i < extraArr.length; i++) {
                while (extraArr[i] > 0) {
                    arr1[index++] = i;
                    extraArr[i]--;
                }
            }
    
            return arr1;
        }
    }
```
##### Notes: 
  Use counting sorting


