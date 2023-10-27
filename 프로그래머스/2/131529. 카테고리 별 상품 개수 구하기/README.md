# [level 2] 카테고리 별 상품 개수 구하기 - 131529 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131529) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > String， Date

### 채점결과

Empty

### 제출 일자

2023년 10월 5일 17:28:5

### 문제 설명

<p style="user-select: auto;">다음은 어느 의류 쇼핑몰에서 판매중인 상품들의 정보를 담은 <code style="user-select: auto;">PRODUCT</code> 테이블입니다. <code style="user-select: auto;">PRODUCT</code> 테이블은 아래와 같은 구조로 되어있으며, <code style="user-select: auto;">PRODUCT_ID</code>, <code style="user-select: auto;">PRODUCT_CODE</code>, <code style="user-select: auto;">PRICE</code>는 각각 상품 ID, 상품코드, 판매가를 나타냅니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">Column name</th>
<th style="user-select: auto;">Type</th>
<th style="user-select: auto;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">PRODUCT_ID</td>
<td style="user-select: auto;">INTEGER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PRODUCT_CODE</td>
<td style="user-select: auto;">VARCHAR(8)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PRICE</td>
<td style="user-select: auto;">INTEGER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">상품 별로 중복되지 않는 8자리 상품코드 값을 가지며, 앞 2자리는 카테고리 코드를 의미합니다.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;"><code style="user-select: auto;">PRODUCT</code> 테이블에서 상품 카테고리 코드(<code style="user-select: auto;">PRODUCT_CODE</code> 앞 2자리) 별 상품 개수를 출력하는 SQL문을 작성해주세요. 결과는 상품 카테고리 코드를 기준으로 오름차순 정렬해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;">예를 들어 <code style="user-select: auto;">PRODUCT</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">PRODUCT_ID</th>
<th style="user-select: auto;">PRODUCT_CODE</th>
<th style="user-select: auto;">PRICE</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">A1000011</td>
<td style="user-select: auto;">10000</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">A1000045</td>
<td style="user-select: auto;">9000</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">C3000002</td>
<td style="user-select: auto;">22000</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">C3000006</td>
<td style="user-select: auto;">15000</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">5</td>
<td style="user-select: auto;">C3000010</td>
<td style="user-select: auto;">30000</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">6</td>
<td style="user-select: auto;">K1000023</td>
<td style="user-select: auto;">17000</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">상품 카테고리 코드 별 상품은 아래와 같으므로,</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><code style="user-select: auto;">A1</code>: <code style="user-select: auto;">PRODUCT_ID</code>가 1, 2 인 상품</li>
<li style="user-select: auto;"><code style="user-select: auto;">C3</code>: <code style="user-select: auto;">PRODUCT_ID</code>가 3, 4, 5 인 상품</li>
<li style="user-select: auto;"><code style="user-select: auto;">K1</code>: <code style="user-select: auto;">PRODUCT_ID</code>가 6 인 상품</li>
</ul>

<p style="user-select: auto;">다음과 같은 결과가 나와야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">CATEGORY</th>
<th style="user-select: auto;">PRODUCTS</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">A1</td>
<td style="user-select: auto;">2</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">C3</td>
<td style="user-select: auto;">3</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">K1</td>
<td style="user-select: auto;">1</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges