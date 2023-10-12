# [level 1] 평균 일일 대여 요금 구하기 - 151136 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/151136) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 제출 일자

2023년 10월 4일 21:9:23

### 문제 설명

<p style="user-select: auto;">다음은 어느 자동차 대여 회사에서 대여중인 자동차들의 정보를 담은 <code style="user-select: auto;">CAR_RENTAL_COMPANY_CAR</code> 테이블입니다. <code style="user-select: auto;">CAR_RENTAL_COMPANY_CAR</code> 테이블은 아래와 같은 구조로 되어있으며, <code style="user-select: auto;">CAR_ID</code>, <code style="user-select: auto;">CAR_TYPE</code>, <code style="user-select: auto;">DAILY_FEE</code>, <code style="user-select: auto;">OPTIONS</code> 는 각각 자동차 ID, 자동차 종류, 일일 대여 요금(원), 자동차 옵션 리스트를 나타냅니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">Column name</th>
<th style="user-select: auto;">Type</th>
<th style="user-select: auto;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">CAR_ID</td>
<td style="user-select: auto;">INTEGER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">CAR_TYPE</td>
<td style="user-select: auto;">VARCHAR(255)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">DAILY_FEE</td>
<td style="user-select: auto;">INTEGER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">OPTIONS</td>
<td style="user-select: auto;">VARCHAR(255)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">자동차 종류는 '세단', 'SUV', '승합차', '트럭', '리무진' 이 있습니다. 자동차 옵션 리스트는 콤마(',')로 구분된 키워드 리스트(예: '열선시트', '스마트키', '주차감지센서')로 되어있으며, 키워드 종류는 '주차감지센서', '스마트키', '네비게이션', '통풍시트', '열선시트', '후방카메라', '가죽시트' 가 있습니다.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;"><code style="user-select: auto;">CAR_RENTAL_COMPANY_CAR</code> 테이블에서 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성해주세요. 이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 <code style="user-select: auto;">AVERAGE_FEE</code> 로 지정해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;">예를 들어 <code style="user-select: auto;">CAR_RENTAL_COMPANY_CAR</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">CAR_ID</th>
<th style="user-select: auto;">CAR_TYPE</th>
<th style="user-select: auto;">DAILY_FEE</th>
<th style="user-select: auto;">OPTIONS</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">세단</td>
<td style="user-select: auto;">16000</td>
<td style="user-select: auto;">가죽시트,열선시트,후방카메라</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">SUV</td>
<td style="user-select: auto;">14000</td>
<td style="user-select: auto;">스마트키,네비게이션,열선시트</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">SUV</td>
<td style="user-select: auto;">22000</td>
<td style="user-select: auto;">주차감지센서,후방카메라,가죽시트</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">'SUV' 에 해당하는 자동차들의 평균 일일 대여 요금은 18,000 원 이므로, 다음과 같은 결과가 나와야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">AVERAGE_FEE</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">18000</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges