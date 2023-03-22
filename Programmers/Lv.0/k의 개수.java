/**
 * fileName : k의 개수.java
 * author :  한찬영
 * date : 2023-03-22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-22            한찬영             최초 생성
 */

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        char q = Character.forDigit(k,10);
        String k2 = "";
        
        for(int a=i; a<=j; a++){
            k2 += Integer.toString(a);
        }
        
        for(int n=0; n<k2.length(); n++){
            if(k2.charAt(n)==q){
                answer++;
            }
        }
        
        return answer;
    }
}
