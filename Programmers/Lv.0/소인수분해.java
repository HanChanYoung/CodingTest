/**
 * fileName : 소인수분해.java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

import java.util.*;

class Solution {
    public int[] solution(int n) {
  
        
        ArrayList<Integer> lists = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    n = n/i;
                    lists.add(i);
                }
                
        }
        Set<Integer> set = new HashSet<Integer>(lists);
        List<Integer> newList =new ArrayList<Integer>(set);
        int[] answer = new int[newList.size()];
        
        for(int i=0; i<newList.size(); i++){
            answer[i] = newList.get(i);
        }
        
        Arrays.sort(answer);
        
    return answer;
    }
     
}
