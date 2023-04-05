/**
 * fileName : 핸드폰 번호 가리기.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

def solution(phone_number):
    answer = ''
    back_num = phone_number[-4:]
    
    phone_number = phone_number[:-4]
    
    for i in range(len(phone_number)):
        answer+='*'
    
    answer+=back_num
    
    return answer
