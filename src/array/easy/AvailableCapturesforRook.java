package array.easy;

public class AvailableCapturesforRook {
    public int numRookCaptures(char[][] board) {
        int size = 0;
        int ri = 0;
        int rj = 0;
        boolean flag = false;
        int rowLen = board.length;
        int colLen = board[0].length;

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (board[i][j] == 'R') {
                    ri = i;
                    rj = j;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        for (int i = ri; i >=0; i--) {
            if (board[i][rj] == 'p') {
                size++;
                break;
            } else if (board[i][rj] == 'B') {
                break;
            }
        }

        for (int i = ri; i < rowLen; i++) {
            if (board[i][rj] == 'p') {
                size++;
                break;
            } else if (board[i][rj] == 'B') {
                break;
            }
        }

        for (int j = rj; j >= 0; j--) {
            if (board[ri][j] == 'p') {
                size++;
                break;
            } else if (board[ri][j] == 'B') {
                break;
            }
        }

        for (int j = rj; j < colLen; j++) {
            if (board[ri][j] == 'p') {
                size++;
                break;
            } else if (board[ri][j] == 'B') {
                break;
            }
        }
        return size;
    }
}
