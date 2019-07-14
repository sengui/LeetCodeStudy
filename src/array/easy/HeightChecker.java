package array.easy;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] extraArr = new int[len];
        for (int i = 0; i < len; i++) {
            extraArr[i] = heights[i];
        }
        quickSort(extraArr, 0 ,len-1);

        int result = 0;
        for (int i = 0; i < len; i++) {
            if (heights[i] != extraArr[i]) {
                result++;
            }
        }
        return result;
    }

    private void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int mod = partition(arr, l, r);
            quickSort(arr, l, mod - 1);
            quickSort(arr, mod + 1, r);
        }
    }

    private int partition(int[] arr, int l, int r) {
        int privot = arr[l];
        while (l < r) {
            while (l < r && arr[r] >= privot) {
                r--;
            }
            if (l < r) {
                arr[l++] = arr[r];
            }

            while (l < r && arr[l] <= privot) {
                l++;
            }
            if (l < r) {
                arr[r--] = arr[l];
            }
        }
        arr[l] = privot;

        return l;
    }

}
