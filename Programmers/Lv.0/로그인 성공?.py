/**
 * fileName : 로그인 성공?.py
 * author :  한찬영
 * date : 2023-04-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-04            한찬영             최초 생성
 */


def solution(id_pw, db):
    answer = ''
    
    mu_id = id_pw[0]
    mu_pw = id_pw[1]
    bools = True
    
    for i in range(0,len(db)):
        if(id_pw == db[i]):
            return 'login'     
        elif(mu_id == db[i][0]):
            answer = 'wrong pw'
            bools = False
        elif(mu_id != db[i][0] and bools == True):
            answer = 'fail'
    
    return answer
