/**
 * fileName : 문자열 다루기 기본.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(s):
    answer = True
    
    if(len(s)==4 or len(s) == 6):
        if(s.isdigit() == True):
            answer = True
        else:
            answer = False
    
    else:
        answer = False
    
    return answer
