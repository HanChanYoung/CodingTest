/**
 * fileName : 짝수의 합.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        int i = 0;
        if((n%2)==0){
            for(i=0;i<n;i+=2){
                answer = answer+(num-2);
                num = num-2;
            }
            answer = answer + n;
        }
        else{
            num = num+1;
            for(i=0;i<n;i+=2){
                answer = answer+(num-2);
                num = num-2;
            }
            
        }
        
        return answer;
    }
}
