/**
 * fileName : 정수 내림차순으로 배치하기.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(n):
    answer = 0
    
    n = str(n)
    n = list(n)
    n.sort()
    n.reverse()
    str_n = ""
    
    for i in n:
        str_n+=i
    
    answer = int(str_n)
    
    return answer
