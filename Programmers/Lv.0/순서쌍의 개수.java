/**
 * fileName : 순서쌍의 개수.java
 * author :  한찬영
 * date : 2023-03-14
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-14            한찬영             최초 생성
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer++;
            }
            
        }
        
        return answer;
    }
}
