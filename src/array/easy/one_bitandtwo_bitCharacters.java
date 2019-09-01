package array.easy;

public class one_bitandtwo_bitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i ++;
            }
        }
        if (i == bits.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}
