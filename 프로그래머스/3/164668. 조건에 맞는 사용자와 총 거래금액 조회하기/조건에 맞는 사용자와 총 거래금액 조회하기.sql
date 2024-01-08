-- 코드를 입력하세요
SELECT 
    U.USER_ID, 
    U.NICKNAME, 
    SUM(B.PRICE) AS "TOTAL_SALES"
FROM USED_GOODS_BOARD B
JOIN USED_GOODS_USER U ON B.WRITER_ID = U.USER_ID
WHERE B.STATUS LIKE 'DONE'
GROUP BY U.USER_ID, U.NICKNAME
HAVING SUM(B.PRICE) >= 700000
ORDER BY SUM(B.PRICE) ASC;