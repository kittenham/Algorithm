# [level unrated] A로 B 만들기 - 120886 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120886) 

### 성능 요약

메모리: 71.7 MB, 시간: 0.37 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 12월 1일 23:56:30

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">before</code>와 <code style="user-select: auto !important;">after</code>가 매개변수로 주어질 때, <code style="user-select: auto !important;">before</code>의 순서를 바꾸어 <code style="user-select: auto !important;">after</code>를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 &lt; <code style="user-select: auto !important;">before</code>의 길이 == <code style="user-select: auto !important;">after</code>의 길이 &lt; 1,000</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">before</code>와 <code style="user-select: auto !important;">after</code>는 모두 소문자로 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">before</th>
<th style="user-select: auto !important;">after</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"olleh"</td>
<td style="user-select: auto !important;">"hello"</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"allpe"</td>
<td style="user-select: auto !important;">"apple"</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges