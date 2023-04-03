/**
 * fileName : 등수 매기기.java
 * author :  한찬영
 * date : 2023-04-03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-03            한찬영             최초 생성
 */

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        double[] ans1 = new double[score.length];
        
        for(int i=0; i<score.length; i++){
            double sum = 0;
            for(int k=0; k<2; k++){
                sum += (double)score[i][k];
            }
            
            ans1[i] = sum/2.0;
        }
        
          for(int j = 0; j < score.length; j++) {
            int order = 1;
            for(int k = 0; k < score.length; k++) {
                if(ans1[j] < ans1[k]) 
                order++;
                answer[j] = order;
            }
        }
        
        
        
        return answer;
    }
}
