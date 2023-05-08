/**
 * fileName : 최댓값과 최솟값.py
 * author :  한찬영
 * date : 2023-05-08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-08            한찬영             최초 생성
 */


def solution(s):
    answer = ''
    an_li = []
    
    an_li = s.split(" ")
    
    li_int = list(map(int,an_li))
    
    answer = str(min(li_int))+ " "+ str(max(li_int))
    
    return answer
