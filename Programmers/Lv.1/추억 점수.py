/**
 * fileName : 추억 점수.py
 * author :  한찬영
 * date : 2023-04-12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-12            한찬영             최초 생성
 */

def solution(name, yearning, photo):
    answer = []
    
    point = {}
    for i,j in zip(name,yearning):
        point[i] = j
    
    
    for i in photo:
        sums = 0
        for k in range(len(i)):
            if(i[k] in name):
                sums+=point[i[k]]
        
        answer.append(sums)
        
        
    return answer
