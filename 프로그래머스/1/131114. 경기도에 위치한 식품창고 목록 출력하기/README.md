# [level 1] 경기도에 위치한 식품창고 목록 출력하기 - 131114 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131114) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > IS NULL

### 채점결과

Empty

### 제출 일자

2023년 10월 3일 23:44:43

### 문제 설명

<p style="user-select: auto;">다음은 식품창고의 정보를 담은 <code style="user-select: auto;">FOOD_WAREHOUSE</code> 테이블입니다. <code style="user-select: auto;">FOOD_WAREHOUSE</code> 테이블은 다음과 같으며 <code style="user-select: auto;">WAREHOUSE_ID</code>, <code style="user-select: auto;">WAREHOUSE_NAME</code>, <code style="user-select: auto;">ADDRESS</code>, <code style="user-select: auto;">TLNO</code>, <code style="user-select: auto;">FREEZER_YN</code>는 창고 ID, 창고 이름, 창고 주소, 전화번호, 냉동시설 여부를 의미합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">Column name</th>
<th style="user-select: auto;">Type</th>
<th style="user-select: auto;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">WAREHOUSE_ID</td>
<td style="user-select: auto;">VARCHAR(10)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WAREHOUSE_NAME</td>
<td style="user-select: auto;">VARCHAR(20)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">ADDRESS</td>
<td style="user-select: auto;">VARCHAR(100)</td>
<td style="user-select: auto;">TRUE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">TLNO</td>
<td style="user-select: auto;">VARCHAR(20)</td>
<td style="user-select: auto;">TRUE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">FREEZER_YN</td>
<td style="user-select: auto;">VARCHAR(1)</td>
<td style="user-select: auto;">TRUE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;"><code style="user-select: auto;">FOOD_WAREHOUSE</code> 테이블에서 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성해주세요. 이때 냉동시설 여부가 NULL인 경우, 'N'으로 출력시켜 주시고 결과는 창고 ID를 기준으로 오름차순 정렬해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;"><code style="user-select: auto;">FOOD_WAREHOUSE</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">WAREHOUSE_ID</th>
<th style="user-select: auto;">WAREHOUSE_NAME</th>
<th style="user-select: auto;">ADDRESS</th>
<th style="user-select: auto;">TLNO</th>
<th style="user-select: auto;">FREEZER_YN</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">WH0001</td>
<td style="user-select: auto;">창고_경기1</td>
<td style="user-select: auto;">경기도 안산시 상록구 용담로 141</td>
<td style="user-select: auto;">031-152-1332</td>
<td style="user-select: auto;">Y</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WH0002</td>
<td style="user-select: auto;">창고_충북1</td>
<td style="user-select: auto;">충청북도 진천군 진천읍 씨제이로 110</td>
<td style="user-select: auto;">043-623-9900</td>
<td style="user-select: auto;">Y</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WH0003</td>
<td style="user-select: auto;">창고_경기2</td>
<td style="user-select: auto;">경기도 이천시 마장면 덕평로 811</td>
<td style="user-select: auto;">031-221-7241</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WH0004</td>
<td style="user-select: auto;">창고_경기3</td>
<td style="user-select: auto;">경기도 김포시 대곶면 율생중앙로205번길</td>
<td style="user-select: auto;">031-671-1900</td>
<td style="user-select: auto;">N</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WH0005</td>
<td style="user-select: auto;">창고_충남1</td>
<td style="user-select: auto;">충청남도 천안시 동남구 광덕면 신덕리1길 9</td>
<td style="user-select: auto;">041-876-5421</td>
<td style="user-select: auto;">Y</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">WAREHOUSE_ID</th>
<th style="user-select: auto;">WAREHOUSE_NAME</th>
<th style="user-select: auto;">ADDRESS</th>
<th style="user-select: auto;">FREEZER_YN</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">WH0001</td>
<td style="user-select: auto;">창고_경기1</td>
<td style="user-select: auto;">경기도 안산시 상록구 용담로 141</td>
<td style="user-select: auto;">Y</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WH0003</td>
<td style="user-select: auto;">창고_경기2</td>
<td style="user-select: auto;">경기도 이천시 마장면 덕평로 811</td>
<td style="user-select: auto;">N</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WH0004</td>
<td style="user-select: auto;">창고_경기3</td>
<td style="user-select: auto;">경기도 김포시 대곶면 율생중앙로205번길</td>
<td style="user-select: auto;">N</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges