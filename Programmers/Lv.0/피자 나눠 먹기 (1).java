/**
 * fileName : 피자 나눠 먹기 (1).java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */


class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // pizza의 갯수
        int pizza = 0;
        pizza = n/7;
        
        if(n%7==0){
            answer = n/7;
        }
        else{
            answer = pizza+1;
        }
        
        return answer;
    }
}
