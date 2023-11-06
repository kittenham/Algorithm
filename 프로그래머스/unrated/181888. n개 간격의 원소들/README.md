# [level unrated] n개 간격의 원소들 - 181888 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181888) 

### 성능 요약

메모리: 75.5 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 1일 14:2:8

### 문제 설명

<p style="user-select: auto;">정수 리스트 <code style="user-select: auto;">num_list</code>와 정수 <code style="user-select: auto;">n</code>이 주어질 때, <code style="user-select: auto;">num_list</code>의 첫 번째 원소부터 마지막 원소까지 <code style="user-select: auto;">n</code>개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">5 ≤ <code style="user-select: auto;">num_list</code>의 길이 ≤ 20</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">num_list</code>의 원소 ≤ 9</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">n</code> ≤ 4</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">num_list</th>
<th style="user-select: auto;">n</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">[4, 2, 6, 1, 7, 6]</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">[4, 6, 7]</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">[4, 2, 6, 1, 7, 6]</td>
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">[4, 7]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">[4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">[4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges