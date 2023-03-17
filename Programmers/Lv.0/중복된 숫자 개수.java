/**
 * fileName : 중복된 숫자 개수.java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]==n){
                answer++;
            }
        }
        return answer;
    }
}
