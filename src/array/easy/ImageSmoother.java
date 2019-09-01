package array.easy;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int width = M.length;
        int height = M[0].length;

        int[][] N = new int[width][height];
        int sum = 0;
        int pointCount = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i > 0 && j > 0) {
                    sum += M[i-1][j-1];
                    sum += M[i-1][j];
                    sum += M[i][j-1];
                    pointCount += 3;
                } else if (i > 0) {
                    sum += M[i-1][j];
                    pointCount++;
                } else if (j > 0) {
                    sum += M[i][j-1];
                    pointCount++;
                }

                if (i < width - 1 && j < height - 1) {
                    sum += M[i+1][j+1];
                    sum += M[i+1][j];
                    sum += M[i][j+1];
                    pointCount += 3;
                } else if (i < width - 1) {
                    sum += M[i+1][j];
                    pointCount++;
                } else if (j < height - 1) {
                    sum += M[i][j+1];
                    pointCount++;
                }

                if (i > 0 && j < height - 1) {
                    sum += M[i-1][j+1];
                    pointCount++;
                }
                if (i < width - 1 && j > 0) {
                    sum += M[i+1][j-1];
                    pointCount++;
                }

                sum += M[i][j];
                pointCount ++;

                N[i][j] = sum / pointCount;
                sum = 0;
                pointCount = 0;
            }
        }
        return N;
    }
}
