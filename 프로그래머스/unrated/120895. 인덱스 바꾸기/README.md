# [level unrated] 인덱스 바꾸기 - 120895 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120895) 

### 성능 요약

메모리: 73.6 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 12월 1일 23:36:37

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">my_string</code>과 정수 <code style="user-select: auto !important;">num1</code>, <code style="user-select: auto !important;">num2</code>가 매개변수로 주어질 때, <code style="user-select: auto !important;">my_string</code>에서 인덱스 <code style="user-select: auto !important;">num1</code>과 인덱스 <code style="user-select: auto !important;">num2</code>에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 &lt; <code style="user-select: auto !important;">my_string</code>의 길이 &lt; 100</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">num1</code>, <code style="user-select: auto !important;">num2</code> &lt; <code style="user-select: auto !important;">my_string</code>의 길이</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_string</code>은 소문자로 이루어져 있습니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">num1</code> ≠ <code style="user-select: auto !important;">num2</code></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_string</th>
<th style="user-select: auto !important;">num1</th>
<th style="user-select: auto !important;">num2</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"hello"</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">"hlelo"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"I love you"</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">"I l veoyou"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"I love you"의 3번째 인덱스 "o"와 " "(공백)을 바꾸면 "I l veoyou"입니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges