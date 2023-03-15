/**
 * fileName : 모스부호(1).java
 * author :  한찬영
 * date : 2023-03-15
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-15            한찬영             최초 생성
 * 2023-03-15            한찬영             fileName 변경
 */

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] alphabet={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        String[] str_arr =letter.split(" ");
        
        
        for(int i=0;i<str_arr.length;i++){
            for(int k=0;k<morse.length;k++){
                if(str_arr[i].equals(morse[k])){
                    answer = answer+alphabet[k];
                }
            }
            
        }
        
        return answer;
    }
}
