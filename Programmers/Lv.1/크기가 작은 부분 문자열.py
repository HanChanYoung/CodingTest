/**
 * fileName : 크기가 작은 부분 문자열.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

def solution(t, p):
    answer = 0
    lists = []
    
    for i in range((len(t)-len(p)+1)):
        lists.append(t[i:i+len(p)])
    
    for k in lists:
        if(int(k)<=int(p)):
            answer +=1
    
    return answer
