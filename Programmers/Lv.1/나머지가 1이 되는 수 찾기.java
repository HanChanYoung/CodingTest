/**
 * fileName : 나머지가 1이 되는 수 찾기.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2;i<1000000;i++){
            if(n%i==1){
                answer = i;
                break;
            }
            else{
                continue;
            }
            
        }
        
        return answer;
    }
}
