/**
 * fileName : 숨어있는 숫자의 덧셈(1).java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */


class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String convert = my_string.replaceAll("[^0-9]","");
        int[] answers = new int[convert.length()];
        
        for(int i=0; i<convert.length(); i++){
            answers[i] = Character.getNumericValue(convert.charAt(i));
        }
        
        for(int k=0; k<answers.length;k++){
            answer += answers[k];
        }
        
        
        return answer;
    }
}
