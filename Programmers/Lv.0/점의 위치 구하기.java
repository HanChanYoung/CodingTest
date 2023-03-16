/**
 * fileName : 점의 위치 구하기.java
 * author :  한찬영
 * date : 2023-03-16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-16            한찬영             최초 생성
 */

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0]>0){
            if(dot[1]>0){
                answer = 1;
            }
            else{
                answer=4;
            }
        }
        if(dot[0]<0){
            if(dot[1]>0){
                answer =2;
            }
            else{
                answer =3;
            }
        }
        return answer;
    }
}
