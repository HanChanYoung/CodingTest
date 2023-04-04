/**
 * fileName : 서울에서 김서방 찾기.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */


def solution(seoul):
    answer = ''
    
    a = 0
    for i in seoul:
        if(i=='Kim'):
            answer = '김서방은 {0}에 있다'.format(a)
        a+=1
    
    return answer
