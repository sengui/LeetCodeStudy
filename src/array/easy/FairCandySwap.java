package array.easy;

public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;
        int sumA = 0;
        int sumB = 0;
        boolean[] hashB = new boolean[100001];
        int[] result = new int[2];

        for (int i = 0; i < lenA; i++) {
            sumA += A[i];
        }
        for (int i = 0; i < lenB; i++) {
            sumB += B[i];
            hashB[B[i]] = true;
        }

        int diff = (sumA - sumB) / 2;
        for (int i = 0; i < lenA; i++) {
            if (A[i] - diff > 0 && A[i] - diff < 100000 && hashB[A[i] - diff]) {
                result[0] = A[i];
                result[1] = A[i] - diff;
            }
        }
        return result;
    }
}
