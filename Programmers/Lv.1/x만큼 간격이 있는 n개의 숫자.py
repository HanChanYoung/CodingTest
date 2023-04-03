/**
 * fileName : x만큼 간격이 있는 n개의 숫자.py
 * author :  한찬영
 * date : 2023-04-03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-03            한찬영             최초 생성
 */


def solution(x, n):
    answer = []
    
    for i in range(1,n+1):
        answer.append(i*x)
    
    return answer
