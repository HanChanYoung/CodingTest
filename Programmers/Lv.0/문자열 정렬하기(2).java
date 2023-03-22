/**
 * fileName : 문자열 정렬하기(2).java
 * author :  한찬영
 * date : 2023-03-22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-22            한찬영             최초 생성
 */

import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String answers = my_string.toLowerCase();
        
        String[] ans_ary = answers.split("");
        Arrays.sort(ans_ary);
        
        for(int i=0; i<ans_ary.length; i++){
            answer = answer + ans_ary[i];
        }
        
       
        
        return answer;
    }
}
