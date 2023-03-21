/**
 * fileName : 가장 큰 수 찾기.java
 * author :  한찬영
 * date : 2023-03-21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-21            한찬영             최초 생성
 */

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int max = 0;
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
                answer[1] = i;
            }
        }
        answer[0] = max;
        
        
        return answer;
    }
}
