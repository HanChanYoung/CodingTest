/**
 * fileName : 다음 큰 숫자.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

def solution(n):
    answer = 0
    
    n_bin = format(n,'b')
    cnt = 0
    for i in n_bin:
        if(i=='1'):
            cnt+=1
    
    
    k_bin = 0
    n+=1
    while(k_bin!=cnt):
        k_bin = 0
        new_n = format(n,'b')
        for k in new_n:
            if(k=='1'):
                k_bin+=1
        n+=1
    
    
    answer = n-1
    
    return answer
