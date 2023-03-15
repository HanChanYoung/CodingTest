/**
 * fileName : 구슬을 나누는 경우의 수.java
 * author :  한찬영
 * date : 2023-03-15
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-15            한찬영             최초 생성
 */


class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}
