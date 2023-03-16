/**
 * fileName : 배열 회전시키기.java
 * author :  한찬영
 * date : 2023-03-16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-16            한찬영             최초 생성
 */

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i=0;i<numbers.length-1;i++){
                answer[i+1]= numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        }
        else{
            for(int k=0;k<numbers.length-1;k++){
                answer[k]=numbers[k+1];
            }
            answer[numbers.length-1] = numbers[0];
        }
        
        return answer;
    }
}
