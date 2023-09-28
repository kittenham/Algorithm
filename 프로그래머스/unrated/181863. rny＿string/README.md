# [unrated] rny_string - 181863 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181863) 

### 성능 요약

메모리: 77.8 MB, 시간: 0.11 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p style="user-select: auto;">'m'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 <code style="user-select: auto;">rny_string</code>이 주어질 때, <code style="user-select: auto;">rny_string</code>의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">rny_string</code>의 길이 ≤ 100</li>
<li style="user-select: auto;"><code style="user-select: auto;">rny_string</code>은 영소문자로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">rny_string</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"masterpiece"</td>
<td style="user-select: auto;">"rnasterpiece"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"programmers"</td>
<td style="user-select: auto;">"prograrnrners"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"jerry"</td>
<td style="user-select: auto;">"jerry"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"burn"</td>
<td style="user-select: auto;">"burn"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><p style="user-select: auto;">예제 1번의 <code style="user-select: auto;">rny_string</code>의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">rny_string</th>
<th style="user-select: auto;">m</th>
<th style="user-select: auto;">a</th>
<th style="user-select: auto;">s</th>
<th style="user-select: auto;">t</th>
<th style="user-select: auto;">e</th>
<th style="user-select: auto;">r</th>
<th style="user-select: auto;">p</th>
<th style="user-select: auto;">i</th>
<th style="user-select: auto;">e</th>
<th style="user-select: auto;">c</th>
<th style="user-select: auto;">e</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">result</td>
<td style="user-select: auto;">rn</td>
<td style="user-select: auto;">a</td>
<td style="user-select: auto;">s</td>
<td style="user-select: auto;">t</td>
<td style="user-select: auto;">e</td>
<td style="user-select: auto;">r</td>
<td style="user-select: auto;">p</td>
<td style="user-select: auto;">i</td>
<td style="user-select: auto;">e</td>
<td style="user-select: auto;">c</td>
<td style="user-select: auto;">e</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">따라서 "rnasterpiece"를 return 합니다.</p></li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><p style="user-select: auto;">예제 2번의 <code style="user-select: auto;">rny_string</code>의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">rny_string</th>
<th style="user-select: auto;">p</th>
<th style="user-select: auto;">r</th>
<th style="user-select: auto;">o</th>
<th style="user-select: auto;">g</th>
<th style="user-select: auto;">r</th>
<th style="user-select: auto;">a</th>
<th style="user-select: auto;">m</th>
<th style="user-select: auto;">m</th>
<th style="user-select: auto;">e</th>
<th style="user-select: auto;">r</th>
<th style="user-select: auto;">s</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">result</td>
<td style="user-select: auto;">p</td>
<td style="user-select: auto;">r</td>
<td style="user-select: auto;">o</td>
<td style="user-select: auto;">g</td>
<td style="user-select: auto;">r</td>
<td style="user-select: auto;">a</td>
<td style="user-select: auto;">rn</td>
<td style="user-select: auto;">rn</td>
<td style="user-select: auto;">e</td>
<td style="user-select: auto;">r</td>
<td style="user-select: auto;">s</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">따라서 "prograrnrners"를 return 합니다.</p></li>
</ul>

<p style="user-select: auto;">입출력 예 #3</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 3번의 <code style="user-select: auto;">rny_string</code>에는 'm'이 없습니다. 따라서 <code style="user-select: auto;">rny_string</code> 그대로인 "jerry"를 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #4</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 4번의 <code style="user-select: auto;">rny_string</code>에는 'm'이 없습니다. 따라서 <code style="user-select: auto;">rny_string</code> 그대로인 "burn"를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges