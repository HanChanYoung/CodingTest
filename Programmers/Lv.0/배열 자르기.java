/**
 * fileName : 배열 자르기.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */


import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = {};
        
        answer = Arrays.copyOfRange(numbers,num1,num2+1);
        
        
        return answer;
        
    }
}
