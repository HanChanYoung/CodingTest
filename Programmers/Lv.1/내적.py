/**
 * fileName : 내적.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(a, b):
    answer = 0
    
    for i,k in zip(a,b):
        answer+= i*k
        
    return answer
