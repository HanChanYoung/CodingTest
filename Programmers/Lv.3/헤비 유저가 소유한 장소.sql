/**
 * fileName : 헤비 유저가 소유한 장소.sql
 * author :  한찬영
 * date : 2023-03-14
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023-03-14            한찬영             최초 생성
 */

SELECT * FROM PLACES
WHERE HOST_ID IN (SELECT HOST_ID FROM PLACES
        GROUP BY HOST_ID
        HAVING count(ID)>1
    )
ORDER BY id asc;
