/**
 * fileName : 소수 만들기.py
 * author :  한찬영
 * date : 2023-04-10
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-10            한찬영             최초 생성
 */

import itertools
import math
def solution(nums):
    answer = 0

    list_nums = list(itertools.combinations(nums,3))    
    lists_sum = []
    
    for i in list_nums:
        lists_sum.append(sum(i))
    
    for k in lists_sum:
        cnt = 0
        for j in range(2,int(math.sqrt(k))+1):
            if k%j==0:
                cnt+=1
        
        if cnt<1:
            answer+=1
                
    
    
    
    
    return answer
