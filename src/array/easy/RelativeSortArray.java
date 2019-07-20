package array.easy;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] extraArr = new int[1001];
        for (int i = 0; i < len1; i++) {
            extraArr[arr1[i]]++;
        }

        int index = 0;
        for (int i = 0; i < len2; i++) {
            while (extraArr[arr2[i]] > 0) {
                arr1[index++] = arr2[i];
                extraArr[arr2[i]]--;
            }
        }
        for (int i = 0; i < extraArr.length; i++) {
            while (extraArr[i] > 0) {
                arr1[index++] = i;
                extraArr[i]--;
            }
        }

        return arr1;
    }
}
