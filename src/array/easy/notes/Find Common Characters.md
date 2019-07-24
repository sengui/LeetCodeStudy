# [Find Common Characters](https://leetcode.com/problems/find-common-characters/)
### Summary 
Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (**including duplicates**). 
 For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.

#### Example 1:
    Input: ["bella","label","roller"]    
    Output: ["e","l","l"]

#### Example 2:
    Input: ["cool","lock","cook"]    
    Output: ["c","o"]


#### Notes: 
    1. 1 <= A.length <= 100  
    2. 1 <= A[i].length <= 100  
    3. A[i][j] is a lowercase letter


## Solution
```java
   public class FindCommonCharacters {
   
       public List<String> commonChars(String[] A) {
           int[] arr = new int[26];
           int[] arrHelp = new int[26];
   
           for (char ch : A[0].toCharArray()) {
               arr[ch - 'a'] ++;
           }
   
           int len = A.length;
           for (int i = 1; i< len; i++) {
               for (char ch : A[i].toCharArray()) {
                   arrHelp[ch-'a'] ++;
               }
   
               for (int j = 0; j < arr.length; j++) {
                   arr[j] = arr[j] < arrHelp[j] ? arr[j] : arrHelp[j];
                   arrHelp[j] = 0;
               }
           }
   
           List<String> result = new ArrayList<>();
           for (int i = 0; i < arr.length; i++) {
               while (arr[i] > 0) {
                   result.add(String.valueOf( (char)('a' + i)));
                   arr[i]--;
               }
           }
           return result;
       }
   }
```



