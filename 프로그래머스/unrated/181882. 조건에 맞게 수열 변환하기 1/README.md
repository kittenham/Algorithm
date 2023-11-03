# [level unrated] 조건에 맞게 수열 변환하기 1 - 181882 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181882?language=java) 

### 성능 요약

메모리: 98.1 MB, 시간: 4.13 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 5일 17:20:40

### 문제 설명

<p style="user-select: auto;">정수 배열 <code style="user-select: auto;">arr</code>가 주어집니다. <code style="user-select: auto;">arr</code>의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">arr</code>의 길이 ≤ 1,000,000

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">arr</code>의 원소의 값 ≤ 100</li>
</ul></li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">arr</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">[1, 2, 3, 100, 99, 98]</td>
<td style="user-select: auto;">[2, 2, 6, 50, 99, 49]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">1, 3은 50 미만의 홀수 이므로 2를 곱하고, 100, 98은 50 이상의 짝수이므로 2로 나눕니다.</li>
<li style="user-select: auto;">나머지 값들은 변경 조건에 해당하지 않으므로 바꾸지 않습니다.</li>
<li style="user-select: auto;">따라서 [2, 2, 6, 50, 99, 49]를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges