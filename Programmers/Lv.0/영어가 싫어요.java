/**
 * fileName : 영어가 싫어요.java
 * author :  한찬영
 * date : 2023-03-20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-20            한찬영             최초 생성
 */

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String int_num = numbers
            .replace("one","1")
            .replace("two","2")
            .replace("three","3")
            .replace("four","4")
            .replace("five","5")
            .replace("six","6")
            .replace("seven","7")
            .replace("eight","8")
            .replace("nine","9")
            .replace("zero","0");
        
        answer = Long.parseLong(int_num);
        
        return answer;
    }
}
