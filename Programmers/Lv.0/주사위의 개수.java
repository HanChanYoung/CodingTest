/**
 * fileName : 주사위의 개수.java
 * author :  한찬영
 * date : 2023-03-16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-16            한찬영             최초 생성
 */

class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        a = box[0]/n;
        b = box[1]/n;
        c = box[2]/n;
        
        answer =a*b*c;
        
        return answer;
    }
}
