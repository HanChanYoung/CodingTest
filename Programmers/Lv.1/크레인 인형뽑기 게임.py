/**
 * fileName : 크레인 인형뽑기 게임.py
 * author :  한찬영
 * date : 2023-04-26
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-26            한찬영             최초 생성
 */

def solution(board, moves):
    answer = 0
    
    bag = [-1,0,-1,0,-1,0]
    
    lens = len(board)
    old = 0 
    
    
    for i in moves:
        for j in range(lens):
            if(board[j][i-1]>0):
                new = board[j][i-1]
                bag.append(new)
                board[j][i-1] = 0
                break
        
        if(bag[-1]==bag[-2]):
            bag.pop()
            bag.pop()
            answer+=1
               

        
        
    return answer*2
