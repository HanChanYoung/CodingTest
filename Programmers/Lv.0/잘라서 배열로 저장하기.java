/**
 * fileName : 잘라서 배열로 저장하기.java
 * author :  한찬영
 * date : 2023-03-24
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-24            한찬영             최초 생성
 */

class Solution {
    public String[] solution(String my_str, int n) {
        
        int len = 0;
        if(my_str.length()%n==0){
            len = my_str.length()/n;    
        }
        else{
            len = my_str.length()/n +1;
        }
        
        String[] answer = new String[len];
        
        int i = 0;
        int k = 0;
        
        while(len-1!=i){
            answer[i] = my_str.substring(k,k+n);
            k = k+n;
            i++;
        }
        
        answer[i] = my_str.substring(k,my_str.length());
        
        return answer;
    }
}
