# [level 1] 조건에 맞는 회원수 구하기 - 131535 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131535) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 제출 일자

2023년 10월 2일 23:31:24

### 문제 설명

<p style="user-select: auto;">다음은 어느 의류 쇼핑몰에 가입한 회원 정보를 담은 <code style="user-select: auto;">USER_INFO</code> 테이블입니다. <code style="user-select: auto;">USER_INFO</code> 테이블은 아래와 같은 구조로 되어있으며 <code style="user-select: auto;">USER_ID</code>, <code style="user-select: auto;">GENDER</code>, <code style="user-select: auto;">AGE</code>, <code style="user-select: auto;">JOINED</code>는 각각 회원 ID, 성별, 나이, 가입일을 나타냅니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">Column name</th>
<th style="user-select: auto;">Type</th>
<th style="user-select: auto;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">USER_ID</td>
<td style="user-select: auto;">INTEGER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">GENDER</td>
<td style="user-select: auto;">TINYINT(1)</td>
<td style="user-select: auto;">TRUE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">AGE</td>
<td style="user-select: auto;">INTEGER</td>
<td style="user-select: auto;">TRUE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">JOINED</td>
<td style="user-select: auto;">DATE</td>
<td style="user-select: auto;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;"><code style="user-select: auto;">GENDER</code> 컬럼은 비어있거나 0 또는 1의 값을 가지며 0인 경우 남자를, 1인 경우는 여자를 나타냅니다.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;"><code style="user-select: auto;">USER_INFO</code> 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;">예를 들어 <code style="user-select: auto;">USER_INFO</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">USER_ID</th>
<th style="user-select: auto;">GENDER</th>
<th style="user-select: auto;">AGE</th>
<th style="user-select: auto;">JOINED</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">26</td>
<td style="user-select: auto;">2021-10-05</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">NULL</td>
<td style="user-select: auto;">2021-11-25</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">22</td>
<td style="user-select: auto;">2021-11-30</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">31</td>
<td style="user-select: auto;">2021-12-03</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">5</td>
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">28</td>
<td style="user-select: auto;">2021-12-16</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">6</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">24</td>
<td style="user-select: auto;">2022-01-03</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">7</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">NULL</td>
<td style="user-select: auto;">2022-01-09</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원은 <code style="user-select: auto;">USER_ID</code> 가 1, 3, 5 인 회원들 이므로, 다음과 같이 결과가 나와야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">USERS</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges