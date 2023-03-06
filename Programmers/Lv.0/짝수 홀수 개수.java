/**
 * fileName : 짝수 홀수 개수.java
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
        int[] answer = new int[2];
        
        // 홀수 갯수 변수 선언
        int odd = 0;
        // 짝수 갯수 변수 선언
        int even = 0;
        
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                even = even+1;
            }
            else{
                odd = odd+1;
            }
        }
        answer[0]=even;
        answer[1]=odd;
        
        return answer;
    }
}
