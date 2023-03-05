/**
 * fileName : 피자 나눠 먹기 (3).java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        int pizza = 1;
        int total_slices = slice;
        
        while((total_slices/n)==0){
            total_slices += slice;
            pizza = pizza+1;
        }
        
        answer = pizza;
        return answer;
    }
}
