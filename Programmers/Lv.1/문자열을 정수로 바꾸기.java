/**
 * fileName : 문자열을 정수로 바꾸기.java
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
        String answer1 ="";
        
        
        if(s.contains("+")==true){
            answer1=s.substring(1);
            answer = Integer.valueOf(answer1);

        }
        else if(s.contains("-")==true){
            answer1 = s.substring(1);
            answer = (Integer.valueOf(answer1))*-1;
        }
        
        else{
            
            answer = Integer.valueOf(s);
        }
        
        return answer;
    }
}
