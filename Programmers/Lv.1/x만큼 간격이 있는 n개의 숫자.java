/**
 * fileName : x만큼 간격이 있는 n개의 숫자.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int k=0;
        int j=0;
        
        long x1 = (long)x;
        long n1 = (long)n;
        
        if(x>0){
            for(long i=x1;i<=x1*n1;i+=x1){
                answer[k]= i;
                k++;
        }
            }
        else if(x<0){
            for(long i=x1;i>=x1*n1;i+=x1){
                answer[j]=i;
                j++;
            }
        }
        else{
            answer[0] = x;
        }
        return answer;
    }
}
