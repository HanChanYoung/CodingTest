/**
 * fileName : 각도기.java
 * author :  한찬영
 * date : 2023-03-14
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-14            한찬영             최초 생성
 */


class Solution {
    public String solution(int age) {
        String answer = "";
        
        String len = Integer.toString(age);
        
        for(int i=0;i<len.length();i++){
            
            switch(len.charAt(i)){
                case '0':
                    answer = answer + "a";
                    break;
                case '1':
                    answer = answer + "b";
                    break;
                case '2':
                    answer = answer + "c";
                    break;
                case '3':
                    answer = answer + "d";
                    break;
                case '4':
                    answer = answer + "e";
                    break;
                case '5':
                    answer = answer + "f";
                    break;
                case '6':
                    answer = answer + "g";
                    break;
                case '7':
                    answer = answer + "h";
                    break;
                case '8':
                    answer = answer + "i";
                    break;
                case '9':
                    answer = answer + "j";
                    break;
                            
            }
        }
        
        return answer;
    }
}
