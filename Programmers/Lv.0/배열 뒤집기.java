/**
 * fileName : 배열 뒤집기.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */


class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int start = 0;
        int i = num_list.length-1;
        
        for(int k = i; k>=0; k--){
            answer[k] = num_list[start];
            start += 1;
        }
        
        return answer;
    }
}
