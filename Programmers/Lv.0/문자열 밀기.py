/**
 * fileName : 문자열 밀기.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(A, B):
    answer = -1
    
    new_A = A
    
    if (A==B):
        return 0
    
    count = 0
    
    while(len(A)>=count):
        a = new_A[-1]
        new_A = new_A[:-1]
        new_A = a+new_A
        count = count+1
        if(new_A==B):
            answer = count
            break
        
    
    return answer
