/**
 * fileName : 콜라츠 추측.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(num):
    answer = 0
    
    while(num != 1):
        if(answer>=500):
            answer = -1
            break
        elif(num%2==0):
            num = num/2
            answer+=1
        elif(num%2!=0):
            num = num*3+1
            answer+=1
        
        
    
    return answer
