/**
 * fileName : 문자열안에 문자열.java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String a = str2;
        
        if(str1.contains(str2)==true){
            answer = 1;
        }
        else{
            answer = 2;
        }
        
        return answer;
    }
}
