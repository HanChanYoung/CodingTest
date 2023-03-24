/**
 * fileName : 7의 개수.java
 * author :  한찬영
 * date : 2023-03-24
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-24            한찬영             최초 생성
 */

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String sevens = "";
        
        for(int i=0; i<array.length; i++){
            sevens += Integer.toString(array[i]);
        }
        
        for(int k=0; k<sevens.length(); k++){
            if(sevens.charAt(k)=='7'){
                answer++;
            }
            else{
                continue;
            }
        }
        
        return answer;
    }
}
