/**
 * fileName : 대문자와 소문자.java
 * author :  한찬영
 * date : 2023-03-20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-20            한찬영             최초 생성
 */

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        
        for(int i=0; i<my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))==true){
                answer += (String.valueOf(my_string.charAt(i))).toLowerCase();
            }
            else{
                answer += (String.valueOf(my_string.charAt(i))).toUpperCase();
            }
        }
        
        return answer;
    }
}
