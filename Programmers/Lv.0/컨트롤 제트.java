/**
 * fileName : 컨트롤 제트.java
 * author :  한찬영
 * date : 2023-03-17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-17            한찬영             최초 생성
 */

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] s_ary = s.split(" ");
        
        for(int i=0; i<s_ary.length; i++){
            if(s_ary[i].equals("Z")){
                answer = answer - Integer.parseInt(s_ary[i-1]);
            }
            else{
                answer = answer + Integer.parseInt(s_ary[i]);
            }
            
        }
        
        return answer;
    }
}
