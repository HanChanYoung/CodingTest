/**
 * fileName : 약수의 합.py
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
    
    for i in range(1,n+1):
        if(n%i==0):
            answer+=i
        else:
            continue
    
    return answer
