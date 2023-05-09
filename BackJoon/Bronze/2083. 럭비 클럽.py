/**
 * fileName : 2083. 럭비 클럽.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

import sys

while True:
    name, age, weight = input().split()
    
    if name == '#':
        break
    else:
        if int(age)>17 or int(weight)>=80:
            print(name+" Senior")
        else:
            print(name+" Junior")
