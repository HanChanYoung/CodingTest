/**
 * fileName : 안전지대.java
 * author :  한찬영
 * date : 2023-04-01
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-01            한찬영             최초 생성
 */

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    boolean isSafe = true;
                    // 위, 아래, 좌, 우, 대각선에 지뢰가 있는지 확인
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if (i + k >= 0 && i + k < n && j + l >= 0 && j + l < m) {
                                if (board[i + k][j + l] == 1) {
                                    isSafe = false;
                                    break;
                                }
                            }
                        }
                        if (!isSafe) {
                            break;
                        }
                    }
                    if (isSafe) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
