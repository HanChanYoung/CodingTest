/**
 * fileName : 최댓값 만들기.java
 * author :  한찬영
 * date : 2023-03-16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-16            한찬영             최초 생성
 */

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        
        Arrays.sort(numbers);
        
        answer = numbers[len-1]*numbers[len-2];
        
        return answer;
    }
}
