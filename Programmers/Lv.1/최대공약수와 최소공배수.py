/**
 * fileName : 최대공약수와 최소공배수.py
 * author :  한찬영
 * date : 2023-04-05
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-04-05            한찬영             최초 생성
 */

import math
def solution(n, m):
    answer = []
    

    def lcm(n,m):
        return (n*m)//math.gcd(n,m)
    
    gcd = math.gcd(n,m)
    lcms = lcm(n,m)
    
    answer.append(gcd)
    answer.append(lcms)
    
    
    return answer
