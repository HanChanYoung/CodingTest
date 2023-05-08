/**
 * fileName : 올바른 괄호.py
 * author :  한찬영
 * date : 2023-05-08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-08            한찬영             최초 생성
 */

def solution(s):
    answer = True
    
    stack = []
    
    for i in s:
        if i == '(':
            stack.append(i)
        else:
            if not stack:
                return False
            
            stack.pop()

    if len(stack)>0:
        return False
    
    return answer
