/**
 * fileName : 카드 뭉치.py
 * author :  한찬영
 * date : 2023-04-12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-12            한찬영             최초 생성
 */

def solution(cards1, cards2, goal):
    answer = 'Yes'
    
    cards1.append('zzz')
    cards2.append('zzz')
    
    for i in goal:
        if (i==cards1[0]):
            cards1.pop(0)
        elif (i==cards2[0]):
            cards2.pop(0)
        else:
            answer='No'
        
        
    return answer
