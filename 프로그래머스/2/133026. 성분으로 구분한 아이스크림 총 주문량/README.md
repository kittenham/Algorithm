# [level 2] 성분으로 구분한 아이스크림 총 주문량 - 133026 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/133026) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

Empty

### 제출 일자

2023년 10월 4일 21:40:36

### 문제 설명

<p style="user-select: auto;">다음은 아이스크림 가게의 상반기 주문 정보를 담은 <code style="user-select: auto;">FIRST_HALF</code> 테이블과 아이스크림 성분에 대한 정보를 담은 <code style="user-select: auto;">ICECREAM_INFO</code> 테이블입니다. <code style="user-select: auto;">FIRST_HALF</code> 테이블 구조는 다음과 같으며, <code style="user-select: auto;">SHIPMENT_ID</code>, <code style="user-select: auto;">FLAVOR</code>, <code style="user-select: auto;">TOTAL_ORDER</code> 는 각각 아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량을 나타냅니다. <code style="user-select: auto;">FIRST_HALF</code> 테이블의 기본 키는 <code style="user-select: auto;">FLAVOR</code>입니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="text-align: left; user-select: auto;">NAME</th>
<th style="text-align: left; user-select: auto;">TYPE</th>
<th style="user-select: auto;">NULLABLE</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">SHIPMENT_ID</td>
<td style="text-align: left; user-select: auto;">INT(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">FLAVOR</td>
<td style="text-align: left; user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">TOTAL_ORDER</td>
<td style="text-align: left; user-select: auto;">INT(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;"><code style="user-select: auto;">ICECREAM_INFO</code> 테이블 구조는 다음과 같으며, <code style="user-select: auto;">FLAVOR</code>, <code style="user-select: auto;">INGREDITENT_TYPE</code> 은 각각 아이스크림 맛, 아이스크림의 성분 타입을 나타냅니다. <code style="user-select: auto;">INGREDIENT_TYPE</code>에는 아이스크림의 주 성분이 설탕이면 <code style="user-select: auto;">sugar_based</code>라고 입력되고, 아이스크림의 주 성분이 과일이면 <code style="user-select: auto;">fruit_based</code>라고 입력됩니다. <code style="user-select: auto;">ICECREAM_INFO</code>의 기본 키는 <code style="user-select: auto;">FLAVOR</code>입니다. <code style="user-select: auto;">ICECREAM_INFO</code>테이블의 <code style="user-select: auto;">FLAVOR</code>는 <code style="user-select: auto;">FIRST_HALF</code> 테이블의  <code style="user-select: auto;">FLAVOR</code>의 외래 키입니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="text-align: left; user-select: auto;">NAME</th>
<th style="text-align: left; user-select: auto;">TYPE</th>
<th style="user-select: auto;">NULLABLE</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">FLAVOR</td>
<td style="text-align: left; user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">INGREDIENT_TYPE</td>
<td style="text-align: left; user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;">상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요. 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;">예를 들어 <code style="user-select: auto;">FIRST_HALF</code> 테이블이 다음과 같고</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="text-align: left; user-select: auto;">SHIPMENT_ID</th>
<th style="text-align: left; user-select: auto;">FLAVOR</th>
<th style="user-select: auto;">TOTAL_ORDER</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">101</td>
<td style="text-align: left; user-select: auto;">chocolate</td>
<td style="user-select: auto;">3200</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">102</td>
<td style="text-align: left; user-select: auto;">vanilla</td>
<td style="user-select: auto;">2800</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">103</td>
<td style="text-align: left; user-select: auto;">mint_chocolate</td>
<td style="user-select: auto;">1700</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">104</td>
<td style="text-align: left; user-select: auto;">caramel</td>
<td style="user-select: auto;">2600</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">105</td>
<td style="text-align: left; user-select: auto;">white_chocolate</td>
<td style="user-select: auto;">3100</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">106</td>
<td style="text-align: left; user-select: auto;">peach</td>
<td style="user-select: auto;">2450</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">107</td>
<td style="text-align: left; user-select: auto;">watermelon</td>
<td style="user-select: auto;">2150</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">108</td>
<td style="text-align: left; user-select: auto;">mango</td>
<td style="user-select: auto;">2900</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">109</td>
<td style="text-align: left; user-select: auto;">strawberry</td>
<td style="user-select: auto;">3100</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">110</td>
<td style="text-align: left; user-select: auto;">melon</td>
<td style="user-select: auto;">3150</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">111</td>
<td style="text-align: left; user-select: auto;">orange</td>
<td style="user-select: auto;">2900</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">112</td>
<td style="text-align: left; user-select: auto;">pineapple</td>
<td style="user-select: auto;">2900</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;"><code style="user-select: auto;">ICECREAM_INFO</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="text-align: left; user-select: auto;">FLAVOR</th>
<th style="text-align: left; user-select: auto;">INGREDIENT_TYPE</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">chocolate</td>
<td style="text-align: left; user-select: auto;">sugar_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">vanilla</td>
<td style="text-align: left; user-select: auto;">sugar_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">mint_chocolate</td>
<td style="text-align: left; user-select: auto;">sugar_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">caramel</td>
<td style="text-align: left; user-select: auto;">sugar_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">white_chocolate</td>
<td style="text-align: left; user-select: auto;">sugar_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">peach</td>
<td style="text-align: left; user-select: auto;">fruit_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">watermelon</td>
<td style="text-align: left; user-select: auto;">fruit_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">mango</td>
<td style="text-align: left; user-select: auto;">fruit_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">strawberry</td>
<td style="text-align: left; user-select: auto;">fruit_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">melon</td>
<td style="text-align: left; user-select: auto;">fruit_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">orange</td>
<td style="text-align: left; user-select: auto;">fruit_based</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">pineapple</td>
<td style="text-align: left; user-select: auto;">fruit_based</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">상반기에 아이스크림의 주 성분이 설탕인 아이스크림들에 대한 총주문량을 구하면 3,200 + 2,800 + 1,700 + 2,600 + 3,100 = 13,400입니다.  아이스크림의 주 성분이 과일인 아이스크림들에 대한 총주문량을 구하면 3,100 + 2,450 + 2,150 + 2,900 + 3,150 + 2,900 + 2,900 = 19,550입니다. 따라서 총주문량이 작은 순서대로 조회하는 SQL 문을 실행하면 다음과 같이 나와야 합니다. </p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="text-align: left; user-select: auto;">INGREDIENT_TYPE</th>
<th style="user-select: auto;">TOTAL_ORDER</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">sugar_based</td>
<td style="user-select: auto;">13400</td>
</tr>
<tr style="user-select: auto;">
<td style="text-align: left; user-select: auto;">fruit_based</td>
<td style="user-select: auto;">19550</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges