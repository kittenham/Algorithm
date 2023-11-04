# [level unrated] 부분 문자열인지 확인하기 - 181843 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181843) 

### 성능 요약

메모리: 78.1 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 6일 17:40:7

### 문제 설명

<p style="user-select: auto;">부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.</p>

<p style="user-select: auto;">문자열 <code style="user-select: auto;">my_string</code>과 <code style="user-select: auto;">target</code>이 매개변수로 주어질 때, <code style="user-select: auto;">target</code>이 문자열 <code style="user-select: auto;">my_string</code>의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">my_string</code>의 길이 ≤ 100</li>
<li style="user-select: auto;"><code style="user-select: auto;">my_string</code>은 영소문자로만 이루어져 있습니다.</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">target</code>의 길이 ≤ 100</li>
<li style="user-select: auto;"><code style="user-select: auto;">target</code>은 영소문자로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">my_string</th>
<th style="user-select: auto;">target</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"banana"</td>
<td style="user-select: auto;">"ana"</td>
<td style="user-select: auto;">1</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"banana"</td>
<td style="user-select: auto;">"wxyz"</td>
<td style="user-select: auto;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">문제 설명과 같습니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">문제 설명과 같습니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges