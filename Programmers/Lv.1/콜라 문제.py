/**
 * fileName : 콜라 문제.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

def solution(a, b, n):
    answer = 0
    
    bottle = n
    
    while(bottle>=a):
        bottle -= a
        answer += b
        bottle+=b
    
    
    return answer
