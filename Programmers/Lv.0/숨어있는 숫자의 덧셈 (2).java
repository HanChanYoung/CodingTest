/**
 * fileName : 숨어있는 숫자의 덧셈 (2).java
 * author :  한찬영
 * date : 2023-03-31
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-31            한찬영             최초 생성
 */

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String my_num = my_string.replaceAll("[^0-9]"," ");
        System.out.println(my_num);
        
        String[] my_numary = my_num.split(" ");
        
        for(int i=0; i<my_numary.length; i++){
            if(my_numary[i].length()>=1){
                answer += Integer.parseInt(my_numary[i]);
            }
            
        }
        
        
        return answer;
    }
}
