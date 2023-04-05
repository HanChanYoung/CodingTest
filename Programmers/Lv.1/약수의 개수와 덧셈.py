/**
 * fileName : 약수의 개수와 덧셈.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(left, right):
    answer = 0
    
    for i in range(left,right+1):
        cnt = 0
        for k in range(1,i+1):
            if(i%k==0):
                cnt+=1
            else:
                continue
        
        if(cnt%2==0):
            answer+=i
        else:
            answer-=i
        
    return answer
