/**
 * fileName : 문자 반복 출력하기.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0;i<my_string.length();i++){
            for(int k=0;k<n;k++){
            answer = answer+ my_string.charAt(i);
            }
        }
        
        return answer;
    }
}
