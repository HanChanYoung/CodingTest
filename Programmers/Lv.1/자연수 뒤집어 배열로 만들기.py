/**
 * fileName : 자연수 뒤집어 배열로 만들기.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(n):
    answer = []
    
    n = str(n)
    reverse_n = n[::-1]
    re_list = list(reverse_n)
    
    for i in re_list:
        answer.append(int(i))
    
    return answer
