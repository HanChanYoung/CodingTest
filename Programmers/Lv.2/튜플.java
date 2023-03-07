/**
 * fileName : 튜플.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */

import java.util.*;


class Solution {
    public int[] solution(String s) {
        
        
        // '{', '}' 문자열 제거
        String rm_s = s
            .replace("{","")
            .replace("}","");
        
        
        // ','으로 구분지어 문자열에 저장
        String[] str_ary = rm_s.split(",");
        
        
        
        Map<String,Integer> hs = new HashMap<>();
        
        // Key, Value 값으로 Key가 있으면 value +1
        for(int i=0;i<str_ary.length;i++){
            
            if(hs.containsKey(str_ary[i])){
                hs.put(str_ary[i],hs.get(str_ary[i])+1);
            }
         // Key 값 없으면 value = 1   
            else{
                hs.put(str_ary[i],1);
            }
        }
        
        
        List<String> keySetList = new ArrayList<>(hs.keySet());
        // value 값으로 내림차순 정렬
        Collections.sort(keySetList, (o1, o2) -> (hs.get(o2).compareTo(hs.get(o1))));
        
        
        // hashmap size 출력
        int[] answer = new int[hs.size()];
        
        int k = 0;
        
        // keySetList객체에 있는 모든 값을 key에 나타나게
        for(String key : keySetList){
            
            answer[k] = Integer.parseInt(key);
            k++;
        }
        
        return answer;
    }
}
