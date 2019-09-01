# [830. Positions of Large Groups](https://leetcode.com/problems/positions-of-large-groups/)
### Summary 
In a string *S* of lowercase letters, these letters form consecutive groups of the same character.  

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has **3** or more characters.  We would like the starting and ending positions of every large group.  

The final answer should be in lexicographic order.

#### Example 1:
    Input: "abbxxxxzzy"   
    Output: [[3,6]]  
    Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.  
    
#### Example 2:
    Input: "abc"   
    Output: []  
    Explanation: We have "a","b" and "c" but no large group.  
    
#### Example 3:
    Input: "abcdddeeeeaabbbcd""   
    Output: [[3,5],[6,9],[12,14]]  

#### Notes: 
    1. 1 <= S.length <= 1000


## Solution
```java
    public class PositionsofLargeGroups {
        public List<List<Integer>> largeGroupPositions(String S) {
            List<List<Integer>> result = new ArrayList<>();
    
            char[] chars = S.toCharArray();
            char beforeChar = chars[0];
            int count = 1;
            int begin = 0;
    
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == beforeChar) {
                    count++;
                }else {
                    if (count >= 3) {
                        result.add(Arrays.asList(begin, i - 1));
                    }
                    beforeChar = chars[i];
                    count = 1;
                    begin = i;
                }
            }
    
            if (count >= 3) {
                result.add(Arrays.asList(begin,chars.length - 1));
            }
            return result;
        }
    }
```



