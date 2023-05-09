/**
 * fileName : 피보나치 수.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

def solution(n):
    fib=[0,1]
    for i in range(2, n+1):
        fib.append((fib[i-2]+fib[i-1])%1234567)
    
    return fib[-1]
