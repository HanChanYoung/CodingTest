/**
 * fileName : 진료순서 정하기.java
 * author :  한찬영
 * date : 2023-03-14
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-14            한찬영             최초 생성
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> list= new ArrayList<>();
        
        for(int i=0; i<emergency.length; i++) {
			list.add(emergency[i]);
		}
        Arrays.sort(emergency);
		for(int i=0; i<list.size(); i++) {
			answer[list.indexOf(emergency[i])]=list.size()-i;
		}
        return answer;
        
        
    }
}
