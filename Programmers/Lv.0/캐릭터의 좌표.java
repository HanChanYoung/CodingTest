/**
 * fileName : 캐릭터의 좌표.java
 * author :  한찬영
 * date : 2023-03-30
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-30            한찬영             최초 생성
 */

import java.lang.Math;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int width = board[0]/2;
        int height = board[1]/2;
        
        
        int x = 0;
        int y = 0;
        
        for(int i=0; i<keyinput.length; i++){
            
            if(keyinput[i].equals("left")){
                x-=1;
            }
            else if(keyinput[i].equals("right")){
                x+=1;
            }
            else if(keyinput[i].equals("up")){
                y+=1;
            }
            else if(keyinput[i].equals("down")){
                y-=1;
            }
            
            if(x>width){
                x-=1;
            }
            else if(x<width*-1){
                x+=1;
            }
            else if(y>height){
                y-=1;
            }
            else if(y<height*-1){
                y+=1;
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
