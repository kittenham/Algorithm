# [unrated] 문자열 곱하기 - 181940 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181940) 

### 성능 요약

메모리: 74.4 MB, 시간: 1.52 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p style="user-select: auto;">문자열 <code style="user-select: auto;">my_string</code>과 정수 <code style="user-select: auto;">k</code>가 주어질 때, <code style="user-select: auto;">my_string</code>을 <code style="user-select: auto;">k</code>번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">my_string</code>의 길이 ≤ 100</li>
<li style="user-select: auto;"><code style="user-select: auto;">my_string</code>은 영소문자로만 이루어져 있습니다.</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">k</code> ≤ 100</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">my_string</th>
<th style="user-select: auto;">k</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"string"</td>
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">"stringstringstring"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"love"</td>
<td style="user-select: auto;">10</td>
<td style="user-select: auto;">"lovelovelovelovelovelovelovelovelovelove"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 1번의 <code style="user-select: auto;">my_string</code>은 "string"이고 이를 3번 반복한 문자열은 "stringstringstring"이므로 이를 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 2번의 <code style="user-select: auto;">my_string</code>은 "love"이고 이를 10번 반복한 문자열은 "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges