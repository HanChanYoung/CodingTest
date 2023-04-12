/**
 * fileName : 다트 게임.py
 * author :  한찬영
 * date : 2023-04-12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-12            한찬영             최초 생성
 */

import math

def solution(dartResult):
    answer = 0
    
    dart_li = list(dartResult)
    
    cnt_l = 0
    for i in dart_li:
        if(i=='1'):
            if(dart_li[cnt_l+1]=='0'):
                dart_li[cnt_l] = '10'
                dart_li.pop(cnt_l+1)
        cnt_l+=1
        
    
    cnt = 0
    
    point_list = []
    point_list.append(0)
    for i in dart_li:
        if(i=='S'):
            point_list[cnt] = math.pow(point_list[cnt],1)
        elif(i=='D'):
            point_list[cnt] = math.pow(point_list[cnt],2)
        elif(i=='T'):
            point_list[cnt] = math.pow(point_list[cnt],3)
        elif(i=='*'):
            point_list[cnt] = point_list[cnt]*2
            point_list[cnt-1] = point_list[cnt-1]*2
        elif(i=='#'):
            point_list[cnt] = point_list[cnt]*-1        
        else:
            point_list.append(int(i))
            cnt+=1
        
    print(point_list)
    
    for i in point_list:
        answer+=i
        
        
    
    return answer
