/**
 * fileName : 체육복.py
 * author :  한찬영
 * date : 2023-04-26
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-26            한찬영             최초 생성
 */


def solution(n, lost, reserve):
    answer = 0
    
    lost.sort()
    reserve.sort()
    
    intersection = list(set(lost) & set(reserve))
    reserve = list(set(reserve) - set(intersection))
    lost = list(set(lost) - set(intersection))

    
    for i in reserve:
        if (i-1 in lost):
            lost.remove(i-1)
        elif(i+1 in lost):
            lost.remove(i+1)
    
    answer = n - len(lost)
    
    return answer
