/**
 * fileName : 나누어 떨어지는 숫자 배열.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(arr, divisor):
    answer = []
    
    
    my_list = list(arr)
    my_list.sort()
    cnt=0
    
    for i in my_list:
        if(i%divisor==0):
            answer.append(i)
            cnt+=1;
    
    if(cnt==0):
        answer.append(-1)
    
    return answer
