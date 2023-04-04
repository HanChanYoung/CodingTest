/**
 * fileName : 옹알이 (1).py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */


def solution(babbling):
    answer = 0
    bab = []
    bab.extend(['aya','ye','woo','ma'])
    new_bab =[]
    
    for i in babbling:
        for j in bab:
            if j in i:
                i = i.replace(j,'*')
                new_bab.append(i)
            else:
                continue
                
    for k in new_bab:
        a = set(k)
        if(len(a)==1):
            answer = answer+1
    
    
    
    return answer
