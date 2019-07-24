package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public List<String> commonChars(String[] A) {
        int[] arr = new int[26];
        int[] arrHelp = new int[26];

        for (char ch : A[0].toCharArray()) {
            arr[ch - 'a'] ++;
        }

        int len = A.length;
        for (int i = 1; i< len; i++) {
            for (char ch : A[i].toCharArray()) {
                arrHelp[ch-'a'] ++;
            }

            for (int j = 0; j < arr.length; j++) {
                arr[j] = arr[j] < arrHelp[j] ? arr[j] : arrHelp[j];
                arrHelp[j] = 0;
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                result.add(String.valueOf( (char)('a' + i)));
                arr[i]--;
            }
        }
        return result;
    }
}
