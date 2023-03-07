/**
 * fileName : 정수 제곱근 판별.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */

import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double sqr = Math.sqrt(n);
       
        
        if(sqr ==(long)sqr){
            answer = ((long)sqr + 1)*((long)sqr + 1);
        }
        else{
            answer = -1;
        }
        
        return answer;
    }
}
