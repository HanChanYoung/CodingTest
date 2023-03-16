/**
 * fileName : 모음 제거.java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

class Solution {
    public String solution(String my_string) {
        String answer = my_string
            .replace("a","")
            .replace("e","")
            .replace("i","")
            .replace("o","")
            .replace("u","");
        return answer;
    }
}
