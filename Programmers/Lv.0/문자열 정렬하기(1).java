/**
 * fileName : 문자열 정렬하기(1).java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        
        String convert = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[convert.length()];
        
        for(int i=0; i<convert.length(); i++){
            answer[i] = Character.getNumericValue(convert.charAt(i));
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
