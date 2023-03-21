/**
 * fileName : 약수 구하기.java
 * author :  한찬영
 * date : 2023-03-21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-21            한찬영             최초 생성
 */

import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        
        ArrayList<Integer> arList = new ArrayList<>();
        
        int k=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                arList.add(i);
            }
        }
         int[] answer = new int[arList.size()];
        
        for (int i = 0 ; i < arList.size() ; i++) 
        answer[i] = arList.get(i).intValue();
        
        return answer;
    }
}
