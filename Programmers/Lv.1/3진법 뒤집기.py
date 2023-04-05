/**
 * fileName : 3진법 뒤집기.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(n):
    answer = 0
    third = ''
    
    while(n>=1):
        mod = n%3
        third+=str(mod)
        n = n//3
    
    
    answer = int(third,3)
    
    
    
    return answer
