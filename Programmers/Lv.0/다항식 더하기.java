/**
 * fileName : 다항식 더하기.java
 * author :  한찬영
 * date : 2023-03-31
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-31            한찬영             최초 생성
 */

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        int num = 0;
        int num2 = 0;
        
        String num_str="";
        String num2_str="";
        
        String[] poly_ary = polynomial.split("\\+");
        
        for(int i=0; i<poly_ary.length; i++){
            poly_ary[i] = poly_ary[i].replace(" ","");
        }
        
        for(int k=0; k<poly_ary.length; k++){
            if(poly_ary[k].equals("x")){
                num++;
            }
            else if(poly_ary[k].contains("x")&&poly_ary[k].length()>1){
                poly_ary[k] = poly_ary[k].replace("x","");
                //계수 변수 선언
                int coef = 0;
                coef = Integer.parseInt(poly_ary[k]);
                num = num+coef;
            }
            else{
                num2 += Integer.parseInt(poly_ary[k]);
            }
        }
        
        num_str = Integer.toString(num);
        num2_str = Integer.toString(num2);
        
        if(num==0){
            answer = num2_str; 
        }
        else if(num2==0){
            if(num==1){
                answer="x";
            }
            else{
            answer = num_str+"x";
            }
        }
        else{
            if(num==1){
                answer = "x + "+num2_str;
            }
            else{
            answer = num_str+"x + "+num2_str;
            }
        }
        
        
        
        return answer;
    }
}
