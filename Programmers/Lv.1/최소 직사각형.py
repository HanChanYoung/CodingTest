/**
 * fileName : 최소 직사각형.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

def solution(sizes):
    answer = 0
    size_list = list(sizes)
    w_size = []
    h_size = []
    
    for i in size_list:
        w_size.append(max(i))
        h_size.append(min(i))
        
    answer = max(w_size)*max(h_size)
        
    return answer
