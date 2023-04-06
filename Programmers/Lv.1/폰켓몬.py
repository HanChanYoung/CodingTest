/**
 * fileName : 폰켓몬.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

def solution(nums):
    answer = 0
    
    num = int(len(nums)/2)
    

    a = len(set(nums))
    
    if (a < num):
        answer = a
    else:
        answer = num
    
    
    return answer
