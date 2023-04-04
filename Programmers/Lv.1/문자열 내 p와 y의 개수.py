/**
 * fileName : 문자열 내 p와 y의 개수.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(s):
    answer = True
    
    up_case = s.upper()
    
    p_num = up_case.count("P")
    y_num = up_case.count("Y")
    
    if(p_num == y_num):
        answer = True
    elif(p_num == 0 and y_num == 0):
        answer = True
        
    else:
        answer = False
    
    
    
    return answer
