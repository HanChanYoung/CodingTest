/**
 * fileName : 하샤드 수.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(x):
    answer = True
    sum_x = 0
    cal = x
    
    x = str(x)
    x = list(x)
    
    list_int = list(map(int,x))
    sum_x = sum(list_int)
    
    if(cal%sum_x == 0):
        answer = True
    else:
        answer = False
        
    
    
    return answer 
        
    
    
