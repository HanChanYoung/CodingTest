/**
 * fileName : 외계어 사전.java
 * author :  한찬영
 * date : 2023-04-01
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-01            한찬영             최초 생성
 */

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        int spell_len = spell.length;
        
        
        for(int i=0; i<dic.length; i++){
            int num = 0;
            for(int k=0; k<spell_len; k++){
                if(dic[i].contains(spell[k])){
                    num++;
                }
                else{
                    continue;
                }
            }
            if(num == spell_len){
                answer = 1;
                break;
            }
            else{
                answer = 2;
            }
        }
        
        
        return answer;
    }
}
