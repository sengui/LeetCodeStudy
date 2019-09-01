package array.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = (sum * 2 + A[i]) % 5;
            result.add(sum == 0);
        }
        return result;
    }
}
