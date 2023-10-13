-- 코드를 입력하세요
SELECT HISTORY_ID, 
       CAR_ID, 
       TO_CHAR(START_DATE, 'YYYY-MM-DD') AS START_DATE,
       TO_CHAR(END_DATE, 'YYYY-MM-DD') AS END_DATE,
       CASE 
           WHEN (END_DATE - START_DATE)+1 >= 30 THEN '장기 대여'
           ELSE '단기 대여'
       END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE TO_CHAR(START_DATE, 'YYYY-MM') = '2022-09'
ORDER BY HISTORY_ID DESC;


--틀린이유
WHEN (END_DATE - START_DATE)+1 >= 30 THEN '장기 대여' 부분에서
날짜의 차이는 하루지만 대여는 일 수로 계산해야하기 때문이다. 한마디로 대여일에 시작일, 반납일이 모두 포함되어야 한다는 것이다.
예를들어 10에 빌려서 11일에 반납을 했다하면 날짜의 차이로 치면 하루 빌린것같지만 대여는 일수로 계산해야 하기 때문에 이틀을 빌린 것이라고 할 수 있다.
따라서 반납날짜-대여날짜에 +1을 더해줘야 대여날짜가 제대로 계산이 된다.



