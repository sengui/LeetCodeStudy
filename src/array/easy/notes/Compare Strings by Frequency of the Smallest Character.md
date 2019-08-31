# [1170. Compare Strings by Frequency of the Smallest Character](https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/)
### Summary 
Let's define a function f(s) over a non-empty string s, which calculates the frequency of the smallest character in s. For example, if s = "dcce" then f(s) = 2 because the smallest character is "c" and its frequency is 2.  

Now, given string arrays queries and words, return an integer array answer, where each answer[i] is the number of words such that f(queries[i]) < f(W), where *W* is a word in *words*.  

#### Example 1:

    Input: queries = ["cbd"], words = ["zaaaz"]
    Output: [1]
    Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz")

#### Example 2:

    Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
    Output: [1,2]
    Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").   

#### Note:  
    1. 1 <= queries.length <= 2000 
    2. 1 <= words.length <= 2000  
    3. 1 <= queries[i].length, words[i].length <= 10  
    4. queries[i][j], words[i][j] are English lowercase letters.


## Solution   
```java
    public class CompareStringsbyFrequencyoftheSmallestCharacter {
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] result = new int[queries.length];
            int[] wordNums = new int[11];
            for (String word : words) {
                wordNums[getFrequencySmallestCharSize(word)] ++;
            }
    
            for (int i = 0; i < queries.length; i++) {
                int querySize = getFrequencySmallestCharSize(queries[i]);
                for (int j = querySize + 1; j < 11; j++) {
                    result[i] += wordNums[j];
                }
            }
            return result;
        }
    
        private int getFrequencySmallestCharSize(String str) {
            int[] charNum = new int[26];
            for (char ch : str.toCharArray()) {
                charNum[ch - 'a'] ++;
            }
            for (int i = 0; i < 26; i++) {
                if (charNum[i] > 0) {
                    return charNum[i];
                }
            }
            return 0;
        }
    }
```  



