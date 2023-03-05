/**
 * fileName : 문자열 뒤집기.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=my_string.length()-1; i>=0; i--){
            answer = answer + my_string.charAt(i);
        }
        
        
        return answer;
    }
}
