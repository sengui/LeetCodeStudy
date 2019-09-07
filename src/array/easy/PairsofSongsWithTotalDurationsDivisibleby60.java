package array.easy;

public class PairsofSongsWithTotalDurationsDivisibleby60 {
    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        int[] remainderArr = new int[60];
        int remainder;
        int index;

        for (int i = 0; i < time.length; i++) {
            remainder = time[i] % 60;
            index = remainder == 0 ? 0 : 60 - remainder;
            result += remainderArr[index];
            remainderArr[remainder] ++;
        }
        return result;
    }
}
