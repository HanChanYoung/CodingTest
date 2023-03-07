/**
 * fileName : 비밀지도.java
 * author :  한찬영
 * date : 2023-03-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-07            한찬영             최초 생성
 */


class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];
    
    // 비트 연산을 이용하여 두 개의 지도를 합치기
    int[] combinedMap = new int[n];
    for (int i = 0; i < n; i++) {
        combinedMap[i] = arr1[i] | arr2[i];
    }
    
    // 10진수에서 2진수로 변환하여 지도를 생성하기
    for (int i = 0; i < n; i++) {
        StringBuilder sb = new StringBuilder();
        int decimal = combinedMap[i];
        for (int j = 0; j < n; j++) {
            if (decimal % 2 == 0) {
                sb.append(" ");
            } else {
                sb.append("#");
            }
            decimal /= 2;
        }
        // 문자열 뒤집기
        answer[i] = sb.reverse().toString();
    }
    
    return answer;
}





}
