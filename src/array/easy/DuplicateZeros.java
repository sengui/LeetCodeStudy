package array.easy;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int len  = arr.length;
        int count = 0;
        int i = 0;
        for (i = 0; i < len; i++) {
            if (arr[i] == 0) {
                count++;
            }
            count++;
            if (count >= len) {
                break;
            }

        }

        int index = len - 1;
        if (count > len) {
            arr[index--] = arr[i--];
        }

        while (index >= 0 && i >= 0) {
            if (arr[i] == 0) {
                arr[index--] = 0;
                arr[index--] = 0;
                i--;
            }
            else {
                arr[index--] = arr[i--];
            }
        }

    }
}
