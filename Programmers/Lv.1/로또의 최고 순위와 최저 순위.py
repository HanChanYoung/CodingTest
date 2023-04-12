/**
 * fileName : 로또의 최고 순위와 최저 순위.py
 * author :  한찬영
 * date : 2023-04-12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-12            한찬영             최초 생성
 */

def solution(lottos, win_nums):
    answer = []
    
    cnt_zero = 0
    for i in lottos:
        if(i == 0):
            cnt_zero+=1
    
    cnt_win = 0
    for i in win_nums:
        for j in lottos:
            if(i == j):
                cnt_win+=1
    
    win = cnt_zero+cnt_win
    
    ans = []
    ans.append(win)
    ans.append(cnt_win)
    
    for i in ans:
        if (i == 6):
            answer.append(1)
        elif(i == 5):
            answer.append(2)
        elif(i == 4):
            answer.append(3)
        elif(i == 3):
            answer.append(4)
        elif(i == 2):
            answer.append(5)
        else:
            answer.append(6)
    
    return answer
