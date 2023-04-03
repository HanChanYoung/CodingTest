/**
 * fileName : 자릿수 더하기.py
 * author :  한찬영
 * date : 2023-04-03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-03            한찬영             최초 생성
 */

def solution(n):
    answer = 0

    lists = []
    ans = str(n)
    
    lists = list(ans)
    
    for i in lists:
        answer+= int(i)
    return answer
