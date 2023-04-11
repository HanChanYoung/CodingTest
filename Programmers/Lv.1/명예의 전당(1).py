/**
 * fileName : 명예의 전당(1).py
 * author :  한찬영
 * date : 2023-04-11
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-11            한찬영             최초 생성
 */

def solution(k, score):
    answer = []
    
    list_king = []
    
    cnt = 1
    for i in score:
        if(cnt<=k):
            list_king.append(i)
            list_king.sort(reverse = True)
        
        else:
            list_king.sort(reverse = True)
            if(min(list_king)<i):
                list_king.pop()
                list_king.append(i)
        
        answer.append(min(list_king))
        cnt+=1
            
    return answer
