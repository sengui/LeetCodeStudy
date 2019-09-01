package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
