/**
 * fileName : 둘만의 암호.py
 * author :  한찬영
 * date : 2023-05-08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-08            한찬영             최초 생성
 */

def solution(s, skip, index):
    answer = ""
    
    alpha = "abcdefghijklmnopqrstuvwxyz" 
    
    for ch in skip: 
        if ch in alpha:
            alpha = alpha.replace(ch, "") 
    
    for i in s:
        change = alpha[(alpha.index(i) + index) % len(alpha)] 
        answer += change
    
    return answer
