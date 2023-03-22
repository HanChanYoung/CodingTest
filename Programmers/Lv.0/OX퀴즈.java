/**
 * fileName : OX퀴즈.java
 * author :  한찬영
 * date : 2023-03-22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-22            한찬영             최초 생성
 */

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] quiz_ary = quiz[i].split(" ");
            
            int front = Integer.parseInt(quiz_ary[0]);
            int back = Integer.parseInt(quiz_ary[2]);
            int ans = Integer.parseInt(quiz_ary[4]);
            
            if(quiz_ary[1].equals("-")){
                if(front-back == ans){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else if(quiz_ary[1].equals("+")){
                if(front+back == ans){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            
        }
        
        return answer;
    }
}
