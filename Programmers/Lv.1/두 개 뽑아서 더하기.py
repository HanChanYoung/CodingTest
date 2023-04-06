/**
 * fileName : 두 개 뽑아서 더하기.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

import itertools
def solution(numbers):
    answer = []
    
   
    lists = []
    ncr = itertools.combinations(numbers,2)
    ncr_list = list(ncr)
    
    for i in ncr_list:
        lists.append(sum(i))
    
    
    a = list(set(lists))
    a.sort()
    
    for m in a:
        answer.append(m)  
    return a
