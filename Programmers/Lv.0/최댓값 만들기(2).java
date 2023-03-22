/**
 * fileName : 최댓값 만들기(2).java
 * author :  한찬영
 * date : 2023-03-22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-22            한찬영             최초 생성
 */

import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int num1 = numbers[0]*numbers[1];
        int num2 = numbers[numbers.length-1]*numbers[numbers.length-2];
        
        if(num1>num2){
            answer = num1;
        }
        else{
            answer = num2;
        }
        
          
            
        return answer;
    }
}
