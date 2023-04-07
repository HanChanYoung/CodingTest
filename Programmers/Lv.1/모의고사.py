/**
 * fileName : 모의고사.py
 * author :  한찬영
 * date : 2023-04-07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-07            한찬영             최초 생성
 */

def solution(answers):
    answer = []
    
    ans1 = [1,2,3,4,5]
    ans2 = [2,1,2,3,2,4,2,5]
    ans3 = [3,3,1,1,2,2,4,4,5,5]
    
    cnt1 = 0
    cnt2 = 0
    cnt3 = 0
    
    a1 = 0
    a2 = 0
    a3 = 0
    
    for i in answers:
        if a1 == 5:
            a1 = a1-5
        if a2 == 8:
            a2 = a2-8
        if a3 == 10:
            a3 = a3 - 10
            
        if ans1[a1] == i:
            cnt1+=1
            
        if ans2[a2] == i:
            cnt2+=1
            
        if ans3[a3] == i:
            cnt3+=1
        
        a1+=1
        a2+=1
        a3+=1
    
    if(cnt1>cnt2 and cnt1>cnt3):
        answer.append(1)
    elif(cnt2>cnt1 and cnt2>cnt3):
        answer.append(2)
    elif (cnt3>cnt1 and cnt3>cnt2):
        answer.append(3)
    elif(cnt1 == cnt2 and cnt2 == cnt3):
        answer.append(1)
        answer.append(2)
        answer.append(3)
    elif (cnt1==cnt2 and cnt1>cnt3):
        answer.append(1)
        answer.append(2)
    elif (cnt2 == cnt3 and cnt2>cnt1):
        answer.append(2)
        answer.append(3)
    elif (cnt1 == cnt3 and cnt1>cnt2):
        answer.append(1)
        answer.append(3)
    
    return answer
