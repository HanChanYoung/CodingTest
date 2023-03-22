/**
 * fileName : 제곱수 판별하기.java
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
    public int solution(int n) {
        int answer = 0;
        
        double sqrt = Math.sqrt(n);
        double a = 10.0;
        
        if(sqrt*a%10 == 0){
            return 1;
        }
        
        else{
            return 2;
            
        }
    }
}
