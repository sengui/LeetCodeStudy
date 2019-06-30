package org.data.array.easy;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] A = new int[]{3,2,1,4};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        System.out.println(Arrays.toString(sortArrayByParity.sortArrayByParity(A)));
    }

    public int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int n ;
        while (l < r){
            if (A[l] % 2 != 0){
                if(A[r] % 2 == 0){
                    n = A[l];
                    A[l] = A[r];
                    A[r] = n;
                    l++;
                    r--;
                }else {
                    r--;
                }
            } else {
                l++;
            }
        }
        return A;
    }
}
