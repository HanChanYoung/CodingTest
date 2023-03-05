/**
 * fileName : 배열의 평균값.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int i=0;i<numbers.length;i++){
            answer = answer+numbers[i];
        }
        
        answer = answer/numbers.length;
        
        return answer;
    }
}
