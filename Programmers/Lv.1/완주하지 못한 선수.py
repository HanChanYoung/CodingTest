/**
 * fileName : 2016년.py
 * author :  한찬영
 * date : 2023-04-26
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-26            한찬영             최초 생성
 */


from collections import Counter
def solution(participant, completion):
    answer = ''

    p = Counter(participant)
    c = Counter(completion)
    
    
    for i in p:
        if(p[i]!=c[i]):
            a = i
    
    
    answer = a
    
    
    return answer
