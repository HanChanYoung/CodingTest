/**
 * fileName : 치킨 쿠폰.py
 * author :  한찬영
 * date : 2023-04-03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-03            한찬영             최초 생성
 */

def solution(chicken):
    answer = 0
    
    coupon = chicken
    
    while(coupon>=10):
        coupon = coupon-10
        coupon+=1
        answer+=1
    
    return answer
