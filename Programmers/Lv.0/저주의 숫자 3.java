/**
 * fileName : 저주의 숫자 3.java
 * author :  한찬영
 * date : 2023-04-01
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-01            한찬영             최초 생성
 */

import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> ary_list = new ArrayList<>();
        
        int k = 0;
        for(int i=1; i<=300; i++){
            if(i%3==0 || Integer.toString(i).contains("3")){
                continue;
            }
            else{
                ary_list.add(k,i);
                k++;
            }
        }
        
        answer = ary_list.get(n-1);
        
        return answer;
    }
}
