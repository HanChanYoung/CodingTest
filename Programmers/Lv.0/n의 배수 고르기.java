/**
 * fileName : n의 배수 고르기.java
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
    public int[] solution(int n, int[] numlist) {
        
        
        ArrayList<Integer> arlist = new ArrayList<>();
        
        for (int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                arlist.add(numlist[i]);
            }
            else{
                continue;
            }
        }
        int[] answer = new int[arlist.size()];
        
        for (int k = 0 ; k < arlist.size() ; k++) 
        answer[k] = arlist.get(k).intValue();
        
        return answer;
    }
}
