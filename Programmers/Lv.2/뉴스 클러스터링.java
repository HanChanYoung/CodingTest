/**
 * fileName : 뉴스 클러스터링.java
 * author :  한찬영
 * date : 2023-03-08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-08            한찬영             최초 생성
 */

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        String str1_low = str1.toLowerCase();
        String str2_low = str2.toLowerCase();
    
        
        ArrayList<String> str1_ary = new ArrayList<String>();
        ArrayList<String> str2_ary = new ArrayList<String>();
        
        // Alphabet의 원소만 arraylist에 저장
        for(int i=0;i<str1.length()-1;i++){
            
            if(str1_low.substring(i,i+2).matches("^[a-zA-Z]*$")){
                str1_ary.add(str1_low.substring(i,i+2));
            }
            
            else{
                continue;
            }
            
        }
       
        for(int i=0;i<str1_ary.size();i++){
            System.out.print(str1_ary.get(i)+" ");
        }
         // Alphabet의 원소만 arraylist에 저장
        for(int i=0;i<str2.length()-1;i++){
            
            if(str2_low.substring(i,i+2).matches("^[a-zA-Z]*$")){
                str2_ary.add(str2_low.substring(i,i+2));
            }
            
            else{
                continue;
            }
            
        }
        for(int i=0;i<str2_ary.size();i++){
            System.out.print(str2_ary.get(i)+" ");
        }
      
        
        
       double size1 = zakard_top(str1_ary,str2_ary);
        double size2 = zakard_bottom(str1_ary,str2_ary) -size1;
        
        System.out.println(size1);
        System.out.println(size2);
        
        if(size1==0.0&&size2==0.0){
            answer=65536;
        }
        else{
        answer = (int)(size1/size2*65536);
        }
        
        
        
        return answer;
    }
    
   private int zakard_top(ArrayList<String> str1_ary,ArrayList<String> str2_ary){
      
       ArrayList<String> copyOfstr1 = (ArrayList<String>) str1_ary.clone();
       ArrayList<String> copyOfstr2 = (ArrayList<String>) str2_ary.clone();
        
       List<String> list = new ArrayList<String>();
        
		for (String s : copyOfstr1) {
			if (copyOfstr2.contains(s)) {
				list.add(s);
                copyOfstr2.remove(String.valueOf(s));
			}
            
		}
       

        return list.size();
    }
    private int zakard_bottom(ArrayList<String> str1_ary,ArrayList<String> str2_ary){
        
        
        str1_ary.addAll(str2_ary);

        return str1_ary.size();
    }
}
