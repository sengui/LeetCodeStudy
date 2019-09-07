# [1128. Number of Equivalent Domino Pairs](https://leetcode.com/problems/number-of-equivalent-domino-pairs/)
### Summary 
Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.  

Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].  

#### Example:
    Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]   
    Output: 1  

#### Notes: 
    1. 1 <= dominoes.length <= 40000  
    2. 1 <= dominoes[i][j] <= 9


## Solution
```java
    public class NumberofEquivalentDominoPairs {
        public int numEquivDominoPairs(int[][] dominoes) {
            int result = 0;
            int[][] tempArr = new int[10][10];
    
            int a;
            int b;
            for (int i = 0; i < dominoes.length; i++) {
                a = dominoes[i][0];
                b = dominoes[i][1];
                if (a != b) {
                    result += tempArr[a][b] + tempArr[b][a];
                } else {
                    result += tempArr[a][b];
                }
    
                tempArr[a][b] ++;
            }
            return result;
        }
    }
```



