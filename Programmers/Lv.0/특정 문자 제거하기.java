/**
 * fileName : 특정 문자 제거하기.java
 * author :  한찬영
 * date : 2023-03-14
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-14            한찬영             최초 생성
 */

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string;
        answer = answer.replaceAll(letter,"");
        
        return answer;
    }
}
