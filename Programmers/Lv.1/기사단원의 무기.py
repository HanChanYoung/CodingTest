/**
 * fileName : 기사단원의 무기.py
 * author :  한찬영
 * date : 2023-04-14
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-14            한찬영             최초 생성
 */

import math
def solution(number, limit, power):
    answer = 0
    ans_list = []
    
    sets = {}
    
    for i in range(1,number+1):
        cnt = 0
        for j in range(1,int(math.sqrt(i)+1)):
            if i%j==0:
                if j == i//j:
                    cnt+=1
                else:
                    cnt+=2
            else:
                continue
        
        ans_list.append(cnt)
        
    
    for k in ans_list:
        if(k>limit):
            answer+=power
        else:
            answer+=k
    
    return answer
