/**
 * fileName : 2차원으로 만들기.java
 * author :  한찬영
 * date : 2023-03-16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-16            한찬영             최초 생성
 */

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int j=0;
        for(int i=0;i<num_list.length/n;i++){
            for(int k=0;k<n;k++){
                answer[i][k] = num_list[j];
                j++;
            }
        }
        
        return answer;
    }
}
