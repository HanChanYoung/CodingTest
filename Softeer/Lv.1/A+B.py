/**
 * fileName : A+B.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

import sys

T = int(input())

for i in range(1,T+1):
    a,b = map(int,input().split())

    result = a+b
     
    print("Case #{0}: ".format(i)+str(result))
