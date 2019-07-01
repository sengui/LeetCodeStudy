package array.easy;

import java.util.Arrays;

public class Flipping_an_Image {

    public static void main(String[] args) {
        int[][] A = new int[][]{{1,1,0}, {1,0,1} , {0,0,0}};

        Flipping_an_Image flipping_an_image = new Flipping_an_Image();

        int[][] result = flipping_an_image.flipAndInvertImage(A);
        System.out.println(Arrays.deepToString(result));
      /*  int i = 0 ;
        int j = 1;
        int n = 0x01;
        i = i ^ n;
        j = j ^ n;
        System.out.println(i);
        System.out.println(j);*/
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int l;
        int r;
        int n;
        for (int i = 0; i < A.length; i++) {
            l = 0;
            r = A[i].length - 1;
            while (l < r){
               n = A[i][l];
               A[i][l] = A[i][r] ^ 1;
               A[i][r] = n ^ 1;
               l++;
               r--;
            }
            if (l == r) {
                A[i][l] ^= 1;
            }
        }
        return A;
    }
}
