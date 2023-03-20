/**
 * fileName : 가까운 수.java
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
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int abs[] = new int[array.length];
        
        for(int i=0; i<array.length; i++){
            abs[i] = Math.abs(array[i] - n);
        }
        
        int max = abs[0];
        answer = array[0];
        
        for(int k=0; k<abs.length; k++){
            if(max>abs[k]){
                max = abs[k];
                answer = array[k];
            }
            else if(max == abs[k]){
                if(answer>array[k]){
                    answer = array[k];
                }
                else{
                    continue;
                }
            }
        }
        
        return answer;
    }
}
