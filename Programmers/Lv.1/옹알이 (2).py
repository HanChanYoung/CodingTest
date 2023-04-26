/**
 * fileName : 옹알이 (2).py
 * author :  한찬영
 * date : 2023-04-26
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-26            한찬영             최초 생성
 */


def solution(babbling):
    answer = 0
    
    list_bab = []
    list_bab.append('aya')
    list_bab.append('ye')
    list_bab.append('woo')
    list_bab.append('ma')
    
    for i in babbling:
        for j in list_bab:
            if j*2 not in i:
                i=i.replace(j,' ')
        
        if i.strip()=='':
            answer+=1
                
    
    return answer
