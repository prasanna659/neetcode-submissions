class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char current = board[r][c];
                if (current == '.') {
                    continue;
                }

               
                String rowKey = "r" + r + "_" + current;
                String colKey = "c" + c + "_" + current;
                String boxKey = "b" + (r / 3) + "_" + (c / 3) + "_" + current;

                // If any of these are already in the set, the board is invalid
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
    }
            }
        }


         return true;
    }}
