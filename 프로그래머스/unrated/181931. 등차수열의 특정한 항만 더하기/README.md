# [level unrated] 등차수열의 특정한 항만 더하기 - 181931 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181931) 

### 성능 요약

메모리: 77.8 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 10월 2일 0:33:22

### 문제 설명

<p style="user-select: auto;">두 정수 <code style="user-select: auto;">a</code>, <code style="user-select: auto;">d</code>와 길이가 n인 boolean 배열 <code style="user-select: auto;">included</code>가 주어집니다. 첫째항이 <code style="user-select: auto;">a</code>, 공차가 <code style="user-select: auto;">d</code>인 등차수열에서 <code style="user-select: auto;">included[i]</code>가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 <code style="user-select: auto;">included</code>가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">a</code> ≤ 100</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">d</code> ≤ 100</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">included</code>의 길이 ≤ 100</li>
<li style="user-select: auto;"><code style="user-select: auto;">included</code>에는 true가 적어도 하나 존재합니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">a</th>
<th style="user-select: auto;">d</th>
<th style="user-select: auto;">included</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">[true, false, false, true, true]</td>
<td style="user-select: auto;">37</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">7</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">[false, false, false, true, false, false, false]</td>
<td style="user-select: auto;">10</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><p style="user-select: auto;">예제 1번은 <code style="user-select: auto;">a</code>와 <code style="user-select: auto;">d</code>가 각각 3, 4이고 <code style="user-select: auto;">included</code>의 길이가 5입니다. 이를 표로 나타내면 다음과 같습니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;"></th>
<th style="user-select: auto;">1항</th>
<th style="user-select: auto;">2항</th>
<th style="user-select: auto;">3항</th>
<th style="user-select: auto;">4항</th>
<th style="user-select: auto;">5항</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">등차수열</td>
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">7</td>
<td style="user-select: auto;">11</td>
<td style="user-select: auto;">15</td>
<td style="user-select: auto;">19</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">included</td>
<td style="user-select: auto;">true</td>
<td style="user-select: auto;">false</td>
<td style="user-select: auto;">false</td>
<td style="user-select: auto;">true</td>
<td style="user-select: auto;">true</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">따라서 true에 해당하는 1항, 4항, 5항을 더한 3 + 15 + 19 = 37을 return 합니다.</p></li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><p style="user-select: auto;">예제 2번은 <code style="user-select: auto;">a</code>와 <code style="user-select: auto;">d</code>가 각각 7, 1이고 <code style="user-select: auto;">included</code>의 길이가 7입니다. 이를 표로 나타내면 다음과 같습니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;"></th>
<th style="user-select: auto;">1항</th>
<th style="user-select: auto;">2항</th>
<th style="user-select: auto;">3항</th>
<th style="user-select: auto;">4항</th>
<th style="user-select: auto;">5항</th>
<th style="user-select: auto;">6항</th>
<th style="user-select: auto;">7항</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">등차수열</td>
<td style="user-select: auto;">7</td>
<td style="user-select: auto;">8</td>
<td style="user-select: auto;">9</td>
<td style="user-select: auto;">10</td>
<td style="user-select: auto;">11</td>
<td style="user-select: auto;">12</td>
<td style="user-select: auto;">13</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">included</td>
<td style="user-select: auto;">false</td>
<td style="user-select: auto;">false</td>
<td style="user-select: auto;">false</td>
<td style="user-select: auto;">true</td>
<td style="user-select: auto;">false</td>
<td style="user-select: auto;">false</td>
<td style="user-select: auto;">false</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">따라서 4항만 true이므로 10을 return 합니다.</p></li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges