# [level unrated] n보다 커질 때까지 더하기 - 181884 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181884) 

### 성능 요약

메모리: 65 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 4일 15:14:56

### 문제 설명

<p style="user-select: auto;">정수 배열 <code style="user-select: auto;">numbers</code>와 정수 <code style="user-select: auto;">n</code>이 매개변수로 주어집니다. <code style="user-select: auto;">numbers</code>의 원소를 앞에서부터 하나씩 더하다가 그 합이 <code style="user-select: auto;">n</code>보다 커지는 순간 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">numbers</code>의 길이 ≤ 100</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">numbers</code>의 원소 ≤ 100</li>
<li style="user-select: auto;">0 ≤ n &lt; <code style="user-select: auto;">numbers</code>의 모든 원소의 합</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">numbers</th>
<th style="user-select: auto;">n</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">[34, 5, 71, 29, 100, 34]</td>
<td style="user-select: auto;">123</td>
<td style="user-select: auto;">139</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">[58, 44, 27, 10, 100]</td>
<td style="user-select: auto;">139</td>
<td style="user-select: auto;">239</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><p style="user-select: auto;">예제 1번의 <code style="user-select: auto;">numbers</code>를 문제 설명대로 더해가는 과정을 나타내면 다음의 표와 같습니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">i</th>
<th style="user-select: auto;">numbers[i]</th>
<th style="user-select: auto;">sum</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;"></td>
<td style="user-select: auto;"></td>
<td style="user-select: auto;">0</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">34</td>
<td style="user-select: auto;">34</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">5</td>
<td style="user-select: auto;">39</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">71</td>
<td style="user-select: auto;">110</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">29</td>
<td style="user-select: auto;">139</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">29를 더한 뒤에 sum 값은 139이고 <code style="user-select: auto;">n</code> 값인 123보다 크므로 139를 return 합니다.</p></li>
<li style="user-select: auto;"><p style="user-select: auto;">예제 2번의 <code style="user-select: auto;">numbers</code>의 마지막 원소 전까지의 원소를 sum에 더하면 139입니다. 139는 <code style="user-select: auto;">n</code> 값인 139보다 크지 않고 마지막 원소인 100을 더하면 139보다 커지므로 239를 return 합니다.</p></li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges