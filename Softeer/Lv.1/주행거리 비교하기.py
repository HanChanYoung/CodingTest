/**
 * fileName : 주행거리 비교하기.py
 * author :  한찬영
 * date : 2023-05-09
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-09            한찬영             최초 생성
 */

import sys

A,B = map(int,input().split())


if A>B:
    print('A')
elif A<B:
    print('B')
else:
    print('same')
