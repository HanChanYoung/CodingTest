/**
 * fileName : 정수 제곱근 판별.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

import math
def solution(n):
    answer = 0
    
    sqr_n = math.sqrt(n)
    sqr_n1 = sqr_n *10
    
    if(sqr_n1%10 == 0):
        answer = math.pow(sqr_n+1,2)
    else:
        answer = -1
    
    
    return answer
