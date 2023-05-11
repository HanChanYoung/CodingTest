/**
 * fileName : 지도 자동 구축.py
 * author :  한찬영
 * date : 2023-05-11
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-11            한찬영             최초 생성
 */


import sys

N = int(input())
dp = [0] * 16 
dp[0] = 2 


for i in range(1,N+1):
    dp[i] = dp[i-1] + (dp[i-1] -1) 


print(dp[N]**2)
