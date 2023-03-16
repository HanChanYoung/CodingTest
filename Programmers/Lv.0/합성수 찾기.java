/**
 * fileName : 합성수 찾기.java
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
        if(n<4){
            answer = 0;
        }
        else{     
            for(int k=4;k<=n;k++){
                if(find_num(k,n)==1){
                    answer++;
                }
            }
        }
        return answer;
    }
        
    
    public int find_num(int k,int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(k%i==0){
                count++;
            }
        }
        if(count>2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
