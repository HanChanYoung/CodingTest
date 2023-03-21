/**
 * fileName : 문자열 계산하기.java
 * author :  한찬영
 * date : 2023-03-21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-21            한찬영             최초 생성
 * 2023-03-21            한찬영             Date 변경
 */

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] ans_ary = my_string.split(" ");
        
        answer = Integer.parseInt(ans_ary[0]);
        for(int i=1; i<ans_ary.length; i++){
            if(ans_ary[i].equals("+")){
                answer += Integer.parseInt(ans_ary[i+1]);
            }
            else if(ans_ary[i].equals("-")){
                answer -= Integer.parseInt(ans_ary[i+1]);
            }
            else{
                continue;
            }
        }
        
        
        return answer;
    }
}
