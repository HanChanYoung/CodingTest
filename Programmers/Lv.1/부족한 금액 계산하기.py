/**
 * fileName : 부족한 금액 계산하기.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(price, money, count):
    answer = -1
    
    charge = 0
    for i in range(1,count+1):
        charge+=i*price 
        
    if(money<charge):
        answer = charge - money
    else:
        answer = 0 
        
            
    
    return answer
