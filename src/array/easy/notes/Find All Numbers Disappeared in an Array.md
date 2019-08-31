# [448. Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
### Summary 
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.  

Find all the elements of [1, n] inclusive that do not appear in this array.  

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.  

#### Example :
    Input: [4,3,2,7,8,2,3,1]      
    Output: [5,6]

## Solution
```java
   public class FindAllNumbersDisappearedinanArray {
       public List<Integer> findDisappearedNumbers(int[] nums) {
           List<Integer> resultList = new ArrayList<>();
           int n;
   
           for (int i = 0; i < nums.length; i++) {
               while (nums[i] - 1 != i && nums[i] != nums[nums[i] - 1]) {
                   // swap nums[i] and nums[nums[i] - 1]
                   n = nums[nums[i] - 1];
                   nums[nums[i] - 1] = nums[i];
                   nums[i] = n;
               }
           }
   
           for (int i = 0; i < nums.length; i++) {
               if (nums[i] - 1 != i) {
                   resultList.add(i + 1);
               }
           }
           return resultList;
       }
   }
```



