/**
 * fileName : 암호 해독.java
 * author :  한찬영
 * date : 2023-03-20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-20            한찬영             최초 생성
 */


class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] cipher_ary = cipher.split("");
        
        int k =code-1;
        for(int i=k; i<cipher_ary.length; i+=code){
            answer += cipher_ary[i];
        }
        
        return answer;
    }
}
