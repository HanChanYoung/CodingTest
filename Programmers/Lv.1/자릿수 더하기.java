/**
 * fileName : 자릿수 더하기.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // int 값을 String으로 변환
        String str_int = Integer.toString(n);
        
        // char 배열 선언
        char[] char_list = new char[str_int.length()];
        
        // 배열에 String값 숫자를 한개씩 배열에저장
        for(int i=0; i<str_int.length();i++){
            char_list[i] = str_int.charAt(i);
        }
        
        //배열에 있는 모든 값을 Sum
        for(int i=0; i<str_int.length();i++){
            answer = answer+ Character.getNumericValue(char_list[i]);
        }
        
        
        

        return answer;
    }
}
