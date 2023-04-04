/**
 * fileName : 연속된 수의 합.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */


def solution(num, total):
    answer = []
    ans=0
    cnt=0
    for i in range(1,num):
        cnt+=i

    first=int((total-cnt)/num)
    print(first)

    for i in range(0,num):
        answer.append(first+i)
    return answer
