/**
 * fileName : 숫자 찾기.java
 * author :  한찬영
 * date : 2023-03-21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-21            한찬영             최초 생성
 */

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String num1 = Integer.toString(num);
        String[] num_ary = num1.split("");
        
        String k1 = Integer.toString(k);
    
        for(int i=0; i<num_ary.length; i++){
            if(num_ary[i].equals(k1)==true){
                answer = i+1;
                break;
                }
            else{
                answer = -1;
                }
            }

        return answer;
    }
}
