/**
 * fileName : 세균 증식.java
 * author :  한찬영
 * date : 2023-03-22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-22            한찬영             최초 생성
 */

import java.lang.Math;
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        
        for(int i=0; i<t; i++){
            answer *= 2;
        }
        
        return answer;
    }
}
