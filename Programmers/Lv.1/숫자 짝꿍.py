/**
 * fileName : 숫자 짝꿍.py
 * author :  한찬영
 * date : 2023-04-25
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-25            한찬영             최초 생성
 */

import collections
def solution(X, Y):
    answer = ''

    list_an = []
    
    list_X = list(X)
    list_Y = list(Y)    
    
    count_X = collections.Counter(list_X)
    count_Y = collections.Counter(list_Y)
    
    for i in count_X:
        cnt = 0
        if(i in count_Y):
            cnt = min(count_X[i],count_Y[i])
        
        for j in range(cnt):
            answer+=i
    
    
    if answer == '':
        return "-1"
    
    if answer[0]=='0':
        return "0"
    
    li_an = list(answer)
    li_an.sort(reverse=True)
    
    answer = ''
    
    for i in li_an:
        answer+=i

    return answer
