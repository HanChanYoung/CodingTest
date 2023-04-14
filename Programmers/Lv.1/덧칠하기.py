/**
 * fileName : 덧칠하기.py
 * author :  한찬영
 * date : 2023-04-14
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-14            한찬영             최초 생성
 */

def solution(n, m, section):
    answer = 0
    
    paint = []
    
    for i in range(n):
        paint.append(0)
    
    for i in section:
        paint[i-1] -= 1
        
    cnt = 0
    while(cnt<len(paint)):
        if(paint[cnt] == -1):
            cnt+=m
            answer+=1
        else:
            cnt+=1
    
    
    return answer
