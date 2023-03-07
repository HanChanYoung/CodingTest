/**
 * fileName : 정수 내림차순으로 배치하기.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */


import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // n을 String값으로 변환
        String n_len = Long.toString(n);
        
        // n의 길이의 array 생성
        long[] long_ary = new long[n_len.length()];
        
        int i=0;
        
        // while문으로 각 자릿수 array에 넣기
        while(n>10){
            long_ary[i] = n%10;
            n = n/10;
            i++;
            
        }
        // 첫째 자릿수 array에 넣기
        long_ary[i] = n;
    
        // array sort
        Arrays.sort(long_ary);
        
        int k =1;
        
        // answer 함수
        for(int j=0;j<long_ary.length;j++){
            answer = answer + long_ary[j]*k;
            k*=10;
        }
        
        
        
        return answer;
    }
}
