# [unrated] 조건 문자열 - 181934 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181934) 

### 성능 요약

메모리: 70.8 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p style="user-select: auto;">문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.  </p>

<ul style="user-select: auto;">
<li style="user-select: auto;">두 수가 <code style="user-select: auto;">n</code>과 <code style="user-select: auto;">m</code>이라면

<ul style="user-select: auto;">
<li style="user-select: auto;">"&gt;", "=" : <code style="user-select: auto;">n</code> &gt;= <code style="user-select: auto;">m</code></li>
<li style="user-select: auto;">"&lt;", "=" : <code style="user-select: auto;">n</code> &lt;= <code style="user-select: auto;">m</code></li>
<li style="user-select: auto;">"&gt;", "!" : <code style="user-select: auto;">n</code> &gt; <code style="user-select: auto;">m</code></li>
<li style="user-select: auto;">"&lt;", "!" : <code style="user-select: auto;">n</code> &lt; <code style="user-select: auto;">m</code> </li>
</ul></li>
</ul>

<p style="user-select: auto;">두 문자열 <code style="user-select: auto;">ineq</code>와 <code style="user-select: auto;">eq</code>가 주어집니다. <code style="user-select: auto;">ineq</code>는 "&lt;"와 "&gt;"중 하나고, <code style="user-select: auto;">eq</code>는 "="와 "!"중 하나입니다. 그리고 두 정수 <code style="user-select: auto;">n</code>과 <code style="user-select: auto;">m</code>이 주어질 때, <code style="user-select: auto;">n</code>과 <code style="user-select: auto;">m</code>이 <code style="user-select: auto;">ineq</code>와 <code style="user-select: auto;">eq</code>의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한 사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">n</code>, <code style="user-select: auto;">m</code> ≤ 100</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">ineq</th>
<th style="user-select: auto;">eq</th>
<th style="user-select: auto;">n</th>
<th style="user-select: auto;">m</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"&lt;"</td>
<td style="user-select: auto;">"="</td>
<td style="user-select: auto;">20</td>
<td style="user-select: auto;">50</td>
<td style="user-select: auto;">1</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"&gt;"</td>
<td style="user-select: auto;">"!"</td>
<td style="user-select: auto;">41</td>
<td style="user-select: auto;">78</td>
<td style="user-select: auto;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">20 &lt;= 50은 참이기 때문에 1을 return합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">41 &gt; 78은 거짓이기 때문에 0을 return합니다.</li>
</ul>

<hr style="user-select: auto;">

<p style="user-select: auto;">※ 2023.05.31 테스트 케이스가 수정되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges