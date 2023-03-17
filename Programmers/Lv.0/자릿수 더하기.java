/**
 * fileName : 자릿수 더하기.java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String ans = Integer.toString(n);
        String[] ans2 = ans.split("");
        
        for(int i=0; i<ans2.length; i++){
            answer += Integer.parseInt(ans2[i]);
        }
        
        return answer;
    }
}
