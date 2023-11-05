# [level unrated] 접두사인지 확인하기 - 181906 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181906) 

### 성능 요약

메모리: 75.8 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 0일 12:44:26

### 문제 설명

<p style="user-select: auto;">어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.<br style="user-select: auto;">
문자열 <code style="user-select: auto;">my_string</code>과 <code style="user-select: auto;">is_prefix</code>가 주어질 때, <code style="user-select: auto;">is_prefix</code>가 <code style="user-select: auto;">my_string</code>의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">my_string</code>의 길이 ≤ 100</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">is_prefix</code>의 길이 ≤ 100</li>
<li style="user-select: auto;"><code style="user-select: auto;">my_string</code>과 <code style="user-select: auto;">is_prefix</code>는 영소문자로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">my_string</th>
<th style="user-select: auto;">is_prefix</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"banana"</td>
<td style="user-select: auto;">"ban"</td>
<td style="user-select: auto;">1</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"banana"</td>
<td style="user-select: auto;">"nan"</td>
<td style="user-select: auto;">0</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"banana"</td>
<td style="user-select: auto;">"abcd"</td>
<td style="user-select: auto;">0</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"banana"</td>
<td style="user-select: auto;">"bananan"</td>
<td style="user-select: auto;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 1번에서 <code style="user-select: auto;">is_prefix</code>가 <code style="user-select: auto;">my_string</code>의 접두사이기 때문에 1을 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 2번에서 <code style="user-select: auto;">is_prefix</code>가 <code style="user-select: auto;">my_string</code>의 접두사가 아니기 때문에 0을 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #3</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 3번에서 <code style="user-select: auto;">is_prefix</code>가 <code style="user-select: auto;">my_string</code>의 접두사가 아니기 때문에 0을 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #4</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 4번에서 <code style="user-select: auto;">is_prefix</code>가 <code style="user-select: auto;">my_string</code>의 접두사가 아니기 때문에 0을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges