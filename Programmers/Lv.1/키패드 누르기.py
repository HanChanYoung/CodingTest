/**
 * fileName : 키패드 누르기.py
 * author :  한찬영
 * date : 2023-04-28
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-28            한찬영             최초 생성
 */


def solution(numbers, hand):
    answer = ''
    
    l_hand = [0,3]
    r_hand = [2,3]
    
    
    for i in numbers:
        if i==1 or i==4 or i == 7:
            answer+='L'
            if i==1:
                l_hand[0] = 0
                l_hand[1] = 0
            elif i == 4:
                l_hand[0] = 0
                l_hand[1] = 1
            elif i == 7:
                l_hand[0] = 0
                l_hand[1] = 2
            
        elif i==3 or i == 6 or i == 9:
            answer+='R'
            if i == 3:
                r_hand[0] = 2
                r_hand[1] = 0
            elif i == 6:
                r_hand[0] = 2
                r_hand[1] = 1
            elif i == 9:
                r_hand[0] = 2
                r_hand[1] = 2
        elif i == 2:
            r_len = abs(1-r_hand[0])+abs(0-r_hand[1])
            l_len = abs(1-l_hand[0])+abs(0-l_hand[1])

            
            
            if r_len>l_len:
                answer+='L'
                l_hand[0] = 1
                l_hand[1] = 0
            elif r_len<l_len:
                answer+='R'
                r_hand[0] = 1
                r_hand[1] = 0
            else:
                if hand=='right':
                    answer+='R'
                    r_hand[0] = 1
                    r_hand[1] = 0
                else:
                    answer+='L'
                    l_hand[0] = 1
                    l_hand[1] = 0
        elif i == 5:
            r_len = abs(1-r_hand[0])+abs(1-r_hand[1])
            l_len = abs(1-l_hand[0])+abs(1-l_hand[1])
            
            
            if r_len>l_len:
                answer+='L'
                l_hand[0] = 1
                l_hand[1] = 1
            elif r_len<l_len:
                answer+='R'
                r_hand[0] = 1
                r_hand[1] = 1
                
            else:
                if hand=='right':
                    answer+='R'
                    r_hand[0] = 1
                    r_hand[1] = 1
                else:
                    answer+='L'
                    l_hand[0] = 1
                    l_hand[1] = 1
        elif i == 8:
            r_len = abs(1-r_hand[0])+abs(2-r_hand[1])
            l_len = abs(1-l_hand[0])+abs(2-l_hand[1])
            
            if r_len>l_len:
                answer+='L'
                l_hand[0] = 1
                l_hand[1] = 2
            elif r_len<l_len:
                answer+='R'
                r_hand[0] = 1
                r_hand[1] = 2
            else:
                if hand=='right':
                    answer+='R'
                    r_hand[0] = 1
                    r_hand[1] = 2
                else:
                    answer+='L'
                    l_hand[0] = 1
                    l_hand[1] = 2
        elif i == 0:
            r_len = abs(1-r_hand[0])+abs(3-r_hand[1])
            l_len = abs(1-l_hand[0])+abs(3-l_hand[1])
            
            if r_len>l_len:
                answer+='L'
                l_hand[0] = 1
                l_hand[1] = 3
            elif r_len<l_len:
                answer+='R'
                r_hand[0] = 1
                r_hand[1] = 3
                
            else:
                if hand=="right":
                    answer+='R'
                    r_hand[0] = 1
                    r_hand[1] = 3
                else:
                    answer+='L'
                    l_hand[0] = 1
                    l_hand[1] = 3
      
    return answer
