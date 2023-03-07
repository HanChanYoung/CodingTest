/**
 * fileName : 숫자 문자열과 영단어.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String replace_word = s
            .replace("zero","0")
            .replace("one","1")
            .replace("two","2")
            .replace("three","3")
            .replace("four","4")
            .replace("five","5")
            .replace("six","6")
            .replace("seven","7")
            .replace("eight","8")
            .replace("nine","9");
        
        answer = Integer.parseInt(replace_word);
            
        
        return answer;
    }
}
