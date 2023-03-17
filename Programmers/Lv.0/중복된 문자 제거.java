/**
 * fileName : 중복된 문자 제거.java
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
        String answer = "";
        
        String[] ans_ary = my_string.split("");
        
        
        
        for(int i=0; i<ans_ary.length; i++){
            if(answer.contains(ans_ary[i])==true){
                continue;
            }
            else{
                answer = answer+ans_ary[i];
            }
        }
        
        return answer;
    }
}
