/**
 * fileName : 실패율.py
 * author :  한찬영
 * date : 2023-04-11
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-11            한찬영             최초 생성
 */

def solution(N, stages):
    answer = []
    
    
    dic = {}
    
    for i in range(1,N+1):
        challenge = 0
        clear = 0
        for k in stages:
            if(k>=i):
                challenge+=1
            
            if(k>i):
                clear+=1
        
        
        if(challenge == 0):
            dic[i] = 1.0
        else:
            dic[i] = clear/challenge
        
    sort_dic = sorted(dic.items(), key=lambda x:x[1])
    
    
    for i in sort_dic:
        answer.append(i[0])
    
    
    
    return answer
