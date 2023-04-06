/**
 * fileName : 삼총사.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

import itertools
def solution(number):
    answer = 0
    
    ncr = itertools.combinations(number,3)
    ncr_list = list(ncr)
    
    for i in ncr_list:
        if sum(i) == 0:
            answer+=1
    
    return answer
