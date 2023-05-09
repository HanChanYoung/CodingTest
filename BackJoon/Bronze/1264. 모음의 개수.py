/**
 * fileName : 1264. 모음의 개수.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

import sys

lists = ['a','e','i','o','u','A','E','I','O','U']

while True:
    word = input()
    cnt = 0
    if word == '#':
        break
    else:
        for i in word:
            if i in lists:
                cnt+=1
    
    print(cnt)
