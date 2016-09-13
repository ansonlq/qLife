package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_79 {
    public boolean exist(final char[][] board, final String word) {
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    final boolean[][] flagBoard = new boolean[board.length][board[0].length];
                    final boolean result = checkWords(board, flagBoard, word, i, j);
                    if (result) {
                        return result;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkWords(final char[][] board, final boolean[][] flagBoard, final String word, final int row,
            final int column) {
        if (row < 0 || column < 0 || row > board.length - 1 || column > board[row].length - 1 || flagBoard[row][column]) {
            return false;
        }

        final boolean check = board[row][column] == word.charAt(0);

        if (word.length() == 1) {
            return check;
        }

        if (check) {
            flagBoard[row][column] = true;
            final boolean dimension1 = checkWords(board, flagBoard, word.substring(1), row + 1, column);
            final boolean dimension2 = checkWords(board, flagBoard, word.substring(1), row, column - 1);
            final boolean dimension3 = checkWords(board, flagBoard, word.substring(1), row, column + 1);
            final boolean dimension4 = checkWords(board, flagBoard, word.substring(1), row - 1, column);
            final boolean result = dimension1 || dimension2 || dimension3 || dimension4;
            if (!result) {
                flagBoard[row][column] = false;
            }
            return result;
        }
        return false;
    }
}
