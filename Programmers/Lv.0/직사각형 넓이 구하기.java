/**
 * fileName : 직사각형 넓이 구하기.java
 * author :  한찬영
 * date : 2023-03-30
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-30            한찬영             최초 생성
 */

class Solution {
    public int solution(int[][] dots) {
           int x1 = 0; int y1 = 0;
        
        for(int i = 1; i < 4; i++) {
            if((dots[0][0] != dots[i][0]) && (dots[0][1] != dots[i][1])) {
                x1 = dots[i][0];
                y1 = dots[i][1];
                break;
            }
        }
        
        int xdis = (int)Math.sqrt((int)(Math.pow(dots[0][0] - x1, 2)));
        int ydis = (int)Math.sqrt((int)(Math.pow(dots[0][1] - y1, 2)));
        int area = xdis * ydis;
        
        return area;
}

}
