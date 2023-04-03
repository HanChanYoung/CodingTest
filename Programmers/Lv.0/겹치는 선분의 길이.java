/**
 * fileName : 겹치는 선분의 길이.java
 * author :  한찬영
 * date : 2023-04-03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-03            한찬영             최초 생성
 */

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] arr = new int[200];
        
        for(int i=0; i<3; i++){
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++){
                arr[j]++;
            }
        }
        
        for(int k=0; k<200; k++){
            if(arr[k]>1){
                answer++;
            }
        }
        return answer;
    }
}
