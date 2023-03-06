/**
 * fileName : 자연수 뒤집어 배열로 만들기.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

class Solution {
    public int[] solution(long n) {
        
        // long to String 형변환
        String str_int = Long.toString(n);
        
        int[] answer = new int[str_int.length()];
         
        // reverse 변수 선언
        char[] char_reverse = new char[str_int.length()];
        
        int k=0;
        
        for(int i=str_int.length()-1;i>=0;i--){
            char_reverse[k] = str_int.charAt(i);
            
            k++;
        }
        
        
        for(int j=0;j<str_int.length();j++){
            
            answer[j] = Character.getNumericValue(char_reverse[j]); //Char to int 변환
        }
        
        
        return answer;
    }
}
