/**
 * fileName : 짝지어 제거하기.py
 * author :  한찬영
 * date : 2023-05-12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-12            한찬영             최초 생성
 */

def solution(s):
    answer = -1
    
    stack = []
    
    for i in s:
        if len(stack) == 0:
            stack.append(i)
        else:
            if stack[-1] == i:
                stack.pop()
            else:
                stack.append(i)
    
    if len(stack) == 0:
        answer = 1
    else:
        answer = 0
    
    
    
    return answer
