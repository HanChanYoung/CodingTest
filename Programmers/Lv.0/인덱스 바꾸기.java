/**
 * fileName : 인덱스 바꾸기.java
 * author :  한찬영
 * date : 2023-03-20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-20            한찬영             최초 생성
 */

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String change ="";
        
        String[] my_ary = my_string.split("");
        
        change = my_ary[num1];
        my_ary[num1] = my_ary[num2];
        my_ary[num2] = change;
        
        for(int i=0; i<my_ary.length; i++){
            answer += my_ary[i];
        }
        
        
        return answer;
    }
}
