/**
 * fileName : 신규 아이디 추천.py
 * author :  한찬영
 * date : 2023-05-04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-05-04            한찬영             최초 생성
 */


def solution(new_id):
    answer = ''
    n_id = ''
    
    ## 1단계
    new_id = new_id.lower()
    
    ## 2단계
    for i in new_id:
        if i.isalpha()==True:
            n_id+=i
        if i.isdigit()==True:
            n_id+=i
        if i == '-' or i == '_' or i == '.':
            n_id+=i
    print('2단계: '+n_id)
    
    ## 3단계
    n_id3 = ''
    old = ''
    for i in n_id:
        if(old == '.' and i =='.'):
            continue
        else:
            n_id3+=i
        old = i
    print('3단계: ' + n_id3)
    
    
    ##4단계
    n_id4 = ''
    if len(n_id3)>1:
        
        if n_id3[0] == '.':
            n_id3 = n_id3[1:]
        
        if n_id3[-1]=='.':
            n_id3 = n_id3[:-1]
        
        n_id4 = n_id3
    
    else:
        if(len(n_id3)==1 and n_id3[0]=='.'):
            n_id4 = ''
        else:
            n_id4 = n_id3
    
        
    
    print('4단계: '+ n_id4)
    
    
    ##5단계
    n_id5 = ''
    if (n_id4 == ''):
        n_id5='a'
    else:
        n_id5 = n_id4
    
    print('5단계: '+n_id5)
        
    ##6단계
    n_id6 = ''
    if len(n_id5) >15:
        n_id6 = n_id5[0:15]
        
        if n_id6[-1] == '.':
            n_id6 = n_id6[0:14]
    else:
        n_id6 = n_id5
    
    print('6단계: '+n_id6)
    
    ##7단계
    n_id7 = ''
    
    if len(n_id6)<3:
        if len(n_id6) == 1:
            n_id7 = n_id6*3
        if len(n_id6) == 2:
            n_id7 = n_id6+n_id6[-1]
    else:
        n_id7 = n_id6
    
    
    answer = n_id7
    
    print(answer)
    return answer
