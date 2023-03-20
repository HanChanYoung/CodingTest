/**
 * fileName : 369게임.java
 * author :  한찬영
 * date : 2023-03-20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-20            한찬영             최초 생성
 */

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str_order = Integer.toString(order);
        
        String[] order_ary = str_order.split("");
        
        for(int i=0; i<order_ary.length; i++){
            if(order_ary[i].equals("3")||order_ary[i].equals("6")||order_ary[i].equals("9")){
                answer++;
            }
        }
        
        return answer;
    }
}
