/**
 * fileName : 머쓱이보다 키 큰 사람.java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]>height){
                answer++;
            }
        }
        
        return answer;
    }
}
