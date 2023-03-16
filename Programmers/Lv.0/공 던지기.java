/**
 * fileName : 공 던지기.java
 * author :  한찬영
 * date : 2023-03-16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-16            한찬영             최초 생성
 */

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int count = ((k-1)*2)%numbers.length;
        
        answer = numbers[count];
        
        return answer;
    }
}
