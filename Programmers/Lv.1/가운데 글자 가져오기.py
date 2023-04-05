/**
 * fileName : 가운데 글자 가져오기.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(s):
    answer = ''
    
    mid = int(len(s)/2)
    if(len(s)==1 or len(s)==2):
        return s
    elif(len(s)%2==0):
        answer = s[mid-1:mid+1]
    else:
        answer = s[mid]
    
    return answer
