/**
 * fileName : 이진 변환 반복하기.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

def solution(s):
    answer = []
    
    cnt = 0
    cnt2 = 0
    new_bin = s
    new_s = ''
    
    while(new_bin != '1'):
        for i in new_bin:
            if i == '0':
                cnt+=1
                continue
            else:
                new_s+=i
            news_len = len(new_s)
            new_bin = format(news_len,'b')
        cnt2+=1
    
        new_s=''
        
    answer.append(cnt2)
    answer.append(cnt)
    return answer
