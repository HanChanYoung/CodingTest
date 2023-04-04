/**
 * fileName : 이진수 더하기.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */


def solution(bin1, bin2):
    answer = ''
    
    a = int(bin1,2)
    b = int(bin2,2)
    c = bin(a+b)
    
    d = c[2:]
   
    answer = d
  
    return answer
