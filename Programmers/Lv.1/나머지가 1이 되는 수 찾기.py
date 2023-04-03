/**
 * fileName : 나머지가 1이 되는 수 찾기.py
 * author :  한찬영
 * date : 2023-04-03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-03            한찬영             최초 생성
 */

def solution(n):
    answer = 0
    
    for i in range(2,1000000):
        if(n%i==1):
            answer = i
            break
        
    return answer
