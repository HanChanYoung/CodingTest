/**
 * fileName : 약수의 합.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */


import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
            else{
                continue;
            }
        }
        
        IntSummaryStatistics statistics = list
            .stream()
            .mapToInt(num -> num)
            .summaryStatistics();
        
        answer = (int)statistics.getSum();
        return answer;
    }
}
