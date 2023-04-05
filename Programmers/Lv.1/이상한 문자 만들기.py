/**
 * fileName : 이상한 문자 만들기.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(s):
    answer = ''
    cnt = 0
    for i in s:
        
        if(i==' '):
            answer+=i
            cnt=0
        elif(cnt%2==0):
            answer+=i.upper()
            cnt += 1
        else:
            answer+=i.lower()
            cnt += 1
        
    return answer
