/**
 * fileName : 시저 암호.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(s, n):
    answer = ''
    
    s_list = list(s)
    
    for i in s_list:
        if(i==' '):
            answer+=i
        elif(ord(i)>=65 and ord(i)<=90):
            a = (ord(i)-65+n)%26
            answer+=chr(a+65)
        elif(ord(i)>=97 and ord(i)<=122):
            b = (ord(i)-97+n)%26
            answer+=chr(b+97)
            
    
    return answer
