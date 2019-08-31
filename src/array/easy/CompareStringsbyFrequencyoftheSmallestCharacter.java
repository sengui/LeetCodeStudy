package array.easy;

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
