/**
 * fileName : 8단 변속기.py
 * author :  한찬영
 * date : 2023-05-10
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-10            한찬영             최초 생성
 */

import sys

list_i = []

for i in input():
    if i != ' ':
        list_i.append(i)

cnt = 1
cnt2 = 0
cnt3 = 0

for i in list_i:
    
    if int(i) == cnt:
        cnt2+=1
        cnt+=1
    
    elif int(i) == 9-cnt:
        cnt3+=1
        cnt+=1
    else:
        continue




if cnt2 == 8:
    print('ascending')
elif cnt3 == 8:
    print('descending')
else:
    print('mixed')
