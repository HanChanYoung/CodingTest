/**
 * fileName : 하샤드 수.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */


class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int hasard_int = 0;
        String hasard = Integer.toString(x);
        
        int[] int_ary = new int[hasard.length()];
        
        // String 값을 int array에 넣는 Logic
        for(int i=0;i<hasard.length();i++){
            int_ary[i] = Character.getNumericValue(hasard.charAt(i));
            
        }
        
        for(int k=0;k<int_ary.length;k++){
            hasard_int += int_ary[k];
        }
        
        
        if(x%hasard_int==0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        
        
        return answer;
    }
}
