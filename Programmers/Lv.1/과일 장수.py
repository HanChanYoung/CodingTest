/**
 * fileName : 과일 장수.py
 * author :  한찬영
 * date : 2023-04-11
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-11            한찬영             최초 생성
 */

import math
def solution(k, m, score):
    answer = 0
    
    score.sort(reverse =True)
    box = math.floor(len(score)/m)
    
    lists_2 = [[]]
    
    list_min = []
    
    lists_2 = [score[i:i+m] for i in range(0,len(score),m)]
    
    for i in lists_2:
        if (len(i)>=m):
            list_min.append(min(i))
    
    for i in list_min:
        answer += i*m
    
    
    return answer
