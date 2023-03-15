/**
 * fileName : 가위 바위 보.java
 * author :  한찬영
 * date : 2023-03-15
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-15            한찬영             최초 생성
 */


class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] rsp_ary = rsp.split("");
        String[] ans_ary = new String[rsp_ary.length];
        
        for(int i=0; i<ans_ary.length; i++){
            if(rsp_ary[i].equals("2")){
                answer = answer+"0";
            }
            if(rsp_ary[i].equals("0")){
                answer = answer+"5";
            }
            if(rsp_ary[i].equals("5")){
                answer = answer+"2";
            }
            
        }
        
        return answer;
    }
}
