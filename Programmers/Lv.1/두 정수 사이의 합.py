/**
 * fileName : 두 정수 사이의 합.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(a, b):
    answer = 0
    
    
    if(b>a):
        for i in range(a,b+1):
            answer+=i
    elif(b<a):
        for i in range(b,a+1):
            answer+=i
    else:
        answer = a
            
        
    return answer
