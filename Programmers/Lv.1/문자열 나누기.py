/**
 * fileName : 3진법 뒤집기.py
 * author :  한찬영
 * date : 2023-05-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-04            한찬영             최초 생성
 */

def solution(s):
    answer = 0
    
    same = 0
    n_same = 0
    cnt = 0
    stop = 0
    li = []
    
    for i in s:
        
        if cnt == 0:
            first = i
            
        if i == first:
            same+=1
        else:
            n_same+=1
        
        if same == n_same:
            li.append(s[stop:stop+cnt+1])
            stop = stop+cnt+1
            n_same = 0
            same = 0
            cnt = 0
            continue
            
        cnt+=1
        
    answer = len(li)
    case = 0
    for i in li:
        case += len(i)
    
    if case != len(s):
        answer+=1
    
    return answer
