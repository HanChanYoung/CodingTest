/**
 * fileName : 제일 작은수 제거하기.py
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
    
    if(len(arr)==1):
        answer.append(-1)
        return answer
    
    arr.remove(min(arr))
    answer = arr
    
    
    
    
    return answer
