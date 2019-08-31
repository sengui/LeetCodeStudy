# [Find Words That Can Be Formed by Characters](https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/)
### Summary 
You are given an array of strings *words* and a string *chars*.  
 
A string is *good* if it can be formed by characters from *chars* (each character can only be used *once*).  

Return the sum of lengths of all good strings in *words*.

#### Example 1:
    Input: words = ["cat","bt","hat","tree"], chars = "atach"    
    Output: 6  
    Explanation： The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

#### Example 2:
    Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"    
    Output: 10  
    Explanation： The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

#### Notes: 
    1. 1 <= words.length <= 1000  
    2. 1 <= words[i].length, chars.length <= 100  
    3. All strings contain lowercase English letters only.


## Solution
```java
   public class FindWordsThatCanBeFormedbyCharacters {
       public int countCharacters(String[] words, String chars) {
           int size = 0;
           int maxLen = chars.length();
   
           int[] charsNums = new int[26];
           for (char ch : chars.toCharArray()) {
               charsNums[ch - 'a'] ++;
           }
   
           for (String word : words) {
               int len = word.length();
               if (len <= maxLen && canCompose(word, charsNums)) {
                   size += len;
               }
           }
           return size;
       }
   
       private boolean canCompose(String word, int[] charsNum) {
           boolean isGoodWord = true;
           int[] wordNum = new int[26];
           int index;
   
           for (char ch : word.toCharArray()) {
               index = ch - 'a';
               wordNum[index] ++;
               if (wordNum[index] > charsNum[index]) {
                   isGoodWord = false;
                   break;
               }
           }
           return isGoodWord;
       }
   }
```



