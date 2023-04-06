/**
 * fileName : 문자열 내 마음대로 정렬하기.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

def solution(strings, n):
    answer = []
    
    new_list = []
    for i in strings:
        new_list.append(i[n:n+1]+i)
    
    new_list.sort()
    
    
    for k in new_list:
        answer.append(k[1:])

    return answer
