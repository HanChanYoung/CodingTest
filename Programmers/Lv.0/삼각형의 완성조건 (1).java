/**
 * fileName : 삼각형의 완성조건 (1).java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int plus = sides[0]+sides[1];
        int longs = sides[2];
        
        if(plus>longs){
            answer = 1;
        }
        else{
            answer = 2;
        }
        
        
        return answer;
    }
}
