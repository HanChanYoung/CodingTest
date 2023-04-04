/**
 * fileName : 다음에 올 숫자.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */

def solution(common):
    

    if (common[1] - common[0]) == (common[2] - common[1]) :
        b = common[1] - common[0]
        answer = common[len(common) -1 ] + b
    elif (common[1] / common[0]) == (common[2] / common[1]) :
        b = common[1] / common[0]
        answer = common[len(common) -1 ] * b
    return answer
