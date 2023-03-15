/**
 * fileName : 개미 군단.java
 * author :  한찬영
 * date : 2023-03-15
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-15            한찬영             최초 생성
 */

class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int general = 0;
        int sick = 0;
        int work = 0;
        
        while(hp!=0){
            
            if((hp-5)>=0){
                general++;
                hp = hp-5;
            }
            else if((hp-3)>=0){
                sick++;
                hp = hp-3;
            }
            else if((hp-1)>=0){
                work++;
                hp = hp-1;
            }
            else{
                
            }
            
        }
        answer = general+sick+work;
        
        return answer;
    }
}
