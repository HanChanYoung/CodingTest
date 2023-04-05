/**
 * fileName : 문자열 내림차순으로 배치하기.py
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
    
    list_s = list(s)
    list_s.sort(reverse=True)
    
    for i in list_s:
        answer+=i
    
    return answer
