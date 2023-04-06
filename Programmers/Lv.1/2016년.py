/**
 * fileName : 2016년.py
 * author :  한찬영
 * date : 2023-04-06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-06            한찬영             최초 생성
 */

import datetime
def solution(a, b):
    answer = ''
    
    day = datetime.datetime(2016,a,b)
    days = day - datetime.datetime(2016,1,1)
    
    dif = days.days
    
    lists = ['SUN','MON','TUE','WED','THU','FRI','SAT']
    
    a = dif%7
    
    answer = lists[(5+a)%7]
    
    return answer
