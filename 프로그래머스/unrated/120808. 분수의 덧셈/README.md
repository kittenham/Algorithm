# [level unrated] 분수의 덧셈 - 120808 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120808) 

### 성능 요약

메모리: 74.2 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 10월 2일 20:2:57

### 문제 설명

<p style="user-select: auto;">첫 번째 분수의 분자와 분모를 뜻하는 <code style="user-select: auto;">numer1</code>, <code style="user-select: auto;">denom1</code>, 두 번째 분수의 분자와 분모를 뜻하는 <code style="user-select: auto;">numer2</code>, <code style="user-select: auto;">denom2</code>가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">0 &lt;<code style="user-select: auto;">numer1</code>, <code style="user-select: auto;">denom1</code>,&nbsp;<code style="user-select: auto;">numer2</code>, <code style="user-select: auto;">denom2</code> &lt; 1,000</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">numer1</th>
<th style="user-select: auto;">denom1</th>
<th style="user-select: auto;">numer2</th>
<th style="user-select: auto;">denom2</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">[5, 4]</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">9</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">[29, 6]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges