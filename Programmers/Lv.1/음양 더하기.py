/**
 * fileName : 음양 더하기.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(absolutes, signs):
    answer = 0
    
    for i,k in zip(absolutes,signs):
        
        if(k==True):
            answer+=i
        else:
            answer-=i
     
    
    return answer
