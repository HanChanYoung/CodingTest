/**
 * fileName : 예상 대진표.py
 * author :  한찬영
 * date : 2023-05-12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-12            한찬영             최초 생성
 */

def solution(n,a,b):
    answer = 0

    rounds = 0  
    
    while(a != b):
        
        rounds+=1
        
        a = (a+1)//2
        b = (b+1)//2
        
    
    answer = rounds
    return answer
