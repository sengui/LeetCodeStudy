package array.easy;

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
