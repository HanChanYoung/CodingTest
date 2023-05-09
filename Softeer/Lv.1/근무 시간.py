/**
 * fileName : 근무 시간.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

import sys

cnt = 0
sum_t = 0
while cnt!=5:
        
    first, second = map(str,input().split())

    f_l = first.split(":")
    s_l = second.split(":")
    f_s = int(f_l[1])
    s_s = int(s_l[1])

    time = int(s_l[0]) - int(f_l[0])

    if f_s>s_s:
        time-=1
        sum_t += (s_s+60-f_s)+(time*60)
    elif f_s == s_s:
        sum_t += time*60
    elif f_s<s_s:
        sum_t += (s_s - f_s)+(time*60)
    
    cnt+=1

print(sum_t)
