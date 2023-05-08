/**
 * fileName : 최솟값 만들기.py
 * author :  한찬영
 * date : 2023-05-08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-08            한찬영             최초 생성
 */

def solution(A,B):

    answer = 0
    
    A.sort()
    B.sort()
    
    A_len = len(A)
    
    for i in range(A_len):
        answer += A[i] * B[A_len-1]
        A_len-=1
    
    
    return answer
