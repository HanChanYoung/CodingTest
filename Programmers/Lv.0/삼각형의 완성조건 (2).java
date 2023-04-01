/**
 * fileName : 삼각형의 완성조건 (2).java
 * author :  한찬영
 * date : 2023-04-01
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-01            한찬영             최초 생성
 */

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int long_side = sides[1];
        int plus_side = sides[0]+sides[1];
        
        // 나머지 한 변이 가장 긴 변인 경우
        int ans1 = 0;
        // 가장 긴 변이 sides안에 있는 경우
        int ans2 = 0;
        
        ans1 = plus_side - long_side -1;
        
        for(int i=1; i<=long_side; i++){
            if(sides[0]+i>long_side){
                ans2++;
            }
        }
        
        
        answer = ans1+ans2;
        
        
        return answer;
    }
}
