# [level 1] 12세 이하인 여자 환자 목록 출력하기 - 132201 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/132201) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 제출 일자

2023년 10월 4일 20:34:26

### 문제 설명

<p style="user-select: auto;">다음은 종합병원에 등록된 환자정보를 담은 <code style="user-select: auto;">PATIENT</code> 테이블입니다. <code style="user-select: auto;">PATIENT</code> 테이블은 다음과 같으며 <code style="user-select: auto;">PT_NO</code>, <code style="user-select: auto;">PT_NAME</code>, <code style="user-select: auto;">GEND_CD</code>, <code style="user-select: auto;">AGE</code>, <code style="user-select: auto;">TLNO</code>는 각각 환자번호, 환자이름, 성별코드, 나이, 전화번호를 의미합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">Column name</th>
<th style="user-select: auto;">Type</th>
<th style="user-select: auto;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">PT_NO</td>
<td style="user-select: auto;">VARCHAR(10)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT_NAME</td>
<td style="user-select: auto;">VARCHAR(20)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">GEND_CD</td>
<td style="user-select: auto;">VARCHAR(1)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">AGE</td>
<td style="user-select: auto;">INTEGER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">TLNO</td>
<td style="user-select: auto;">VARCHAR(50)</td>
<td style="user-select: auto;">TRUE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;"><code style="user-select: auto;">PATIENT</code> 테이블에서 12세 이하인 여자환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회하는 SQL문을 작성해주세요. 이때 전화번호가 없는 경우, 'NONE'으로 출력시켜 주시고 결과는 나이를 기준으로 내림차순 정렬하고, 나이 같다면 환자이름을 기준으로 오름차순 정렬해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;"><code style="user-select: auto;">PATIENT</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">PT_NO</th>
<th style="user-select: auto;">PT_NAME</th>
<th style="user-select: auto;">GEND_CD</th>
<th style="user-select: auto;">AGE</th>
<th style="user-select: auto;">TLNO</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">PT22000003</td>
<td style="user-select: auto;">브라운</td>
<td style="user-select: auto;">M</td>
<td style="user-select: auto;">18</td>
<td style="user-select: auto;">01031246641</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000004</td>
<td style="user-select: auto;">크롱</td>
<td style="user-select: auto;">M</td>
<td style="user-select: auto;">7</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000006</td>
<td style="user-select: auto;">뽀뽀</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">8</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000009</td>
<td style="user-select: auto;">한나</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">12</td>
<td style="user-select: auto;">01032323117</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000012</td>
<td style="user-select: auto;">뿡뿡이</td>
<td style="user-select: auto;">M</td>
<td style="user-select: auto;">5</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000013</td>
<td style="user-select: auto;">크리스</td>
<td style="user-select: auto;">M</td>
<td style="user-select: auto;">30</td>
<td style="user-select: auto;">01059341192</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000014</td>
<td style="user-select: auto;">토프</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">22</td>
<td style="user-select: auto;">01039458213</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000018</td>
<td style="user-select: auto;">안나</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">11</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000019</td>
<td style="user-select: auto;">바라</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">10</td>
<td style="user-select: auto;">01079068799</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT22000021</td>
<td style="user-select: auto;">릴로</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">33</td>
<td style="user-select: auto;">01023290767</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">PT_NAME</th>
<th style="user-select: auto;">PT_NO</th>
<th style="user-select: auto;">GEND_CD</th>
<th style="user-select: auto;">AGE</th>
<th style="user-select: auto;">TLNO</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">한나</td>
<td style="user-select: auto;">PT22000009</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">12</td>
<td style="user-select: auto;">01032323117</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">안나</td>
<td style="user-select: auto;">PT22000018</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">11</td>
<td style="user-select: auto;">NONE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">바라</td>
<td style="user-select: auto;">PT22000019</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">10</td>
<td style="user-select: auto;">01079068799</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">뽀뽀</td>
<td style="user-select: auto;">PT22000006</td>
<td style="user-select: auto;">W</td>
<td style="user-select: auto;">8</td>
<td style="user-select: auto;">NONE</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges