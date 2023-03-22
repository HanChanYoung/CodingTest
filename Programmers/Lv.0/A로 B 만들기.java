/**
 * fileName : A로 B 만들기.java
 * author :  한찬영
 * date : 2023-03-22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-22            한찬영             최초 생성
 */

import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        String[] be_ary = before.split("");
        String[] af_ary = after.split("");
        
        
        HashMap<String,Integer> map1 = new HashMap<String,Integer>();
        HashMap<String,Integer> map2 = new HashMap<String,Integer>();
        
        for(int i=0; i<be_ary.length; i++){
            int x =1;
            if(map1.containsKey(be_ary[i])){
                x = map1.get(be_ary[i])+1;
            }
            map1.put(be_ary[i],x);
            
        }
        
        for(int i=0; i<af_ary.length; i++){
            int x =1;
            if(map2.containsKey(af_ary[i])){
                x = map2.get(af_ary[i])+1;
            }
            map2.put(af_ary[i],x);
            
        }
        
        for(int i=0; i<be_ary.length; i++){
            String a = be_ary[i];
            
            if(map1.get(a)!=map2.get(a)){
              
                answer = 0;
            }
            
        }
        
        
        return answer;
    }
}
