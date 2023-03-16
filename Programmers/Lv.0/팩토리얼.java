/**
 * fileName : 팩토리얼.java
 * author :  한찬영
 * date : 2023-03-16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-16            한찬영             최초 생성
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int k=1;k<=10;k++){
            if(factorial(k)<=n){
                answer = k;
            }
            else{
                continue;
            }
        }
        
        return answer;
    }
    
    public int factorial(int k){
        if(k==1){
            return k;
        }
        else{
            return k*factorial(k-1);
        }
    }
}
