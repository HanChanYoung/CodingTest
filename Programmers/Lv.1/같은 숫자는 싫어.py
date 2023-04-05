/**
 * fileName : 같은 숫자는 싫어.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(arr):
    answer = []
    before = -1
    for i in arr:
        answer.append(i)
        if(before==i):
            answer.pop()
        
        before = i
    
    
    
    return answer
