/**
 * fileName : 문자열 내 p와 y의 개수.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */


import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String word = s.toLowerCase();
        int p_number =0;
        int y_number =0;
        
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)=='p'){
                p_number +=1;
            }
            else if(word.charAt(i)=='y'){
                y_number +=1;
            }
            else{
                continue;
            }
        }
        
        if (p_number==y_number){
            answer = true;
        }
        else if(p_number==0&&y_number==0){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}
