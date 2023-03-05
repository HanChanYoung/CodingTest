/**
 * fileName : 양꼬치.java
 * author :  한찬영
 * date : 2023-03-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-06            한찬영             최초 생성
 */


class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int service = 0;
        
        // 서비스 음료수 갯수
        service = n/10;
        
        // 음식 값
        answer = (n*12000)+((k-service)*2000);
        
        return answer;
    }
}
