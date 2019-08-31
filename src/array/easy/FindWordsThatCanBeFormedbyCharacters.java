package array.easy;

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
