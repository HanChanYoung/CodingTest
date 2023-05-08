/**
 * fileName : JadenCase 문자열 만들기.py
 * author :  한찬영
 * date : 2023-05-08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-08            한찬영             최초 생성
 */


def solution(s):
    answer = ''
    
    ex_word = ''
    
    if s[0].isdigit == True:
        for i in s[1:]:
            if ex_word == '' or ex_word == " ":
                answer+=i.upper()
            else:
                answer+=i.lower()
            ex_word=i
    else:
        for i in s:
            if ex_word == '' or ex_word == " ":
                answer+=i.upper()
            else:
                answer+=i.lower()
            ex_word=i
    return answer
