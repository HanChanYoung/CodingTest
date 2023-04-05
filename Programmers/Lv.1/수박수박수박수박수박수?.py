/**
 * fileName : 수박수박수박수박수박수?.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */


def solution(n):
    answer = ''
    
    for i in range(n):
        if((i+1)%2==0):
            answer+='박'
        else:
            answer+='수'
    return answer
