# [level unrated] 0 떼기 - 181847 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181847) 

### 성능 요약

메모리: 74.3 MB, 시간: 6.71 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 3일 19:56:6

### 문제 설명

<p style="user-select: auto;">정수로 이루어진 문자열 <code style="user-select: auto;">n_str</code>이 주어질 때, <code style="user-select: auto;">n_str</code>의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">2 ≤ <code style="user-select: auto;">n_str</code> ≤ 10</li>
<li style="user-select: auto;"><code style="user-select: auto;">n_str</code>이 "0"으로만 이루어진 경우는 없습니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">n_str</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"0010"</td>
<td style="user-select: auto;">"10"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"854020"</td>
<td style="user-select: auto;">"854020"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">"0010"의 가장 왼쪽에 연속으로 등장하는 "0"을 모두 제거하면 "10"이 됩니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">"854020"는 가장 왼쪽에 0이 없으므로 "854020"을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges