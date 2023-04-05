/**
 * fileName : 행렬의 덧셈.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(arr1, arr2):
    answer = []
    
    
    for x in range(len(arr1)):
        sublist = []
        for y in range(len(arr1[0])):
            sublist.append(arr1[x][y] + arr2[x][y])
        answer.append(sublist)
    
    return answer
