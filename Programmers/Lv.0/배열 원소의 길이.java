/**
 * fileName : 배열 원소의 길이.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

class Solution {
    public int[] solution(String[] strlist) {
        // array 생성
        String[] array = new String[strlist.length];
        
        // answer array 생성
        int[] answer = new int[strlist.length];
        
        
        for(int i=0;i<strlist.length;i++){
         answer[i] = strlist[i].length();   
        }
        
        return answer;
    }
}
