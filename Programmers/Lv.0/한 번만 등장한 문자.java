/**
 * fileName : 한 번만 등장한 문자.java
 * author :  한찬영
 * date : 2023-03-20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-20            한찬영             최초 생성
 */

import java.util.*;

class Solution {
    public String solution(String s) {
        
        String answer="";
        
        String[] s_ary = s.split("");
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i=0; i<s_ary.length; i++){
            int x=1;
            if(hm.containsKey(s_ary[i])){
                x = hm.get(s_ary[i])+1;
            }
            
            hm.put(s_ary[i],x);
        }
        
        for (Map.Entry<String, Integer> pair : hm.entrySet()) {
            if(pair.getValue()==1){
                answer+=pair.getKey();
            }
    }
        
       String[] ans_ary =answer.split("");
        answer = "";
       Arrays.sort(ans_ary);
       for(int k=0; k<ans_ary.length; k++){
           answer+=ans_ary[k];
       } 
        return answer;
       	
        
       
    }
    
    
}
