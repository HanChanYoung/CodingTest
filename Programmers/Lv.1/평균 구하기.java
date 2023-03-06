/**
 * fileName : 평균 구하기.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */


class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i=0;i<arr.length;i++){
            answer = answer+arr[i];
        }
        
        answer = answer/arr.length;
        
        return answer;
    }
}
