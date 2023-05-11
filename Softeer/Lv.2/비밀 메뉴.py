/**
 * fileName : 비밀 메뉴.py
 * author :  한찬영
 * date : 2023-05-11
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-11            한찬영             최초 생성
 */


import sys

M,N,K = map(int,input().split())

if M > N :
    print("normal")
    exit()

secret_key = "".join(list(map(str,input().split())))
user_input = "".join(list(map(str,input().split())))

if secret_key in user_input:
    print("secret")
else:
    print("normal")
