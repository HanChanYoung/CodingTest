/**
 * fileName : 푸드 파이트 대회.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

def solution(food):
    answer = ''
    
    lists = []
    
    for i in food[1:]:
        lists.append(i//2)
    
    print(lists)
    string = ''
    a = 1
    for k in lists:
        for j in range(k):
            string+=str(a)
        a+=1
    
    str_rever = string[::-1]
    
    answer = string+'0'+str_rever
    
           
    
    return answer
