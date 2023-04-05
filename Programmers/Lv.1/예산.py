/**
 * fileName : 예산.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */


def solution(d, budget):
    answer = 0
    
    d.sort()
    
    for i in d:
        if(budget-i<0):
            break
        budget-=i
        answer+=1
        
    
    return answer
