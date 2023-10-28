# [level 2] 진료과별 총 예약 횟수 출력하기 - 132202 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/132202) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

Empty

### 제출 일자

2023년 10월 0일 0:8:29

### 문제 설명

<p style="user-select: auto;">다음은 종합병원의 진료 예약정보를 담은 <code style="user-select: auto;">APPOINTMENT</code> 테이블 입니다.<br style="user-select: auto;">
<code style="user-select: auto;">APPOINTMENT</code> 테이블은 다음과 같으며 <code style="user-select: auto;">APNT_YMD</code>, <code style="user-select: auto;">APNT_NO</code>, <code style="user-select: auto;">PT_NO</code>, <code style="user-select: auto;">MCDP_CD</code>, <code style="user-select: auto;">MDDR_ID</code>, <code style="user-select: auto;">APNT_CNCL_YN</code>, <code style="user-select: auto;">APNT_CNCL_YMD</code>는 각각 진료예약일시, 진료예약번호, 환자번호, 진료과코드, 의사ID, 예약취소여부, 예약취소날짜를 나타냅니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">Column name</th>
<th style="user-select: auto;">Type</th>
<th style="user-select: auto;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">APNT_YMD</td>
<td style="user-select: auto;">TIMESTAMP</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">APNT_NO</td>
<td style="user-select: auto;">NUMBER(5)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PT_NO</td>
<td style="user-select: auto;">VARCHAR(10)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">MCDP_CD</td>
<td style="user-select: auto;">VARCHAR(6)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">MDDR_ID</td>
<td style="user-select: auto;">VARCHAR(10)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">APNT_CNCL_YN</td>
<td style="user-select: auto;">VARCHAR(1)</td>
<td style="user-select: auto;">TRUE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">APNT_CNCL_YMD</td>
<td style="user-select: auto;">DATE</td>
<td style="user-select: auto;">TRUE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;"><code style="user-select: auto;">APPOINTMENT</code> 테이블에서 2022년 5월에 예약한 환자 수를 진료과코드 별로 조회하는 SQL문을 작성해주세요. 이때, 컬럼명은 '진료과 코드', '5월예약건수'로 지정해주시고 결과는 진료과별 예약한 환자 수를 기준으로 오름차순 정렬하고, 예약한 환자 수가 같다면 진료과 코드를 기준으로 오름차순 정렬해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;"><code style="user-select: auto;">APPOINTMENT</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">APNT_YMD</th>
<th style="user-select: auto;">APNT_NO</th>
<th style="user-select: auto;">PT_NO</th>
<th style="user-select: auto;">MCDP_CD</th>
<th style="user-select: auto;">MDDR_ID</th>
<th style="user-select: auto;">APNT_CNCL_YN</th>
<th style="user-select: auto;">APNT_CNCL_YMD</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">2022-04-14 09:30:00.000000</td>
<td style="user-select: auto;">47</td>
<td style="user-select: auto;">PT22000064</td>
<td style="user-select: auto;">GS</td>
<td style="user-select: auto;">DR20170123</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-04-15 10:30:00.000000</td>
<td style="user-select: auto;">48</td>
<td style="user-select: auto;">PT22000065</td>
<td style="user-select: auto;">OB</td>
<td style="user-select: auto;">DR20100231</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-15 17:30:00.000000</td>
<td style="user-select: auto;">49</td>
<td style="user-select: auto;">PT22000086</td>
<td style="user-select: auto;">OB</td>
<td style="user-select: auto;">DR20100231</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-18 10:30:00.000000</td>
<td style="user-select: auto;">52</td>
<td style="user-select: auto;">PT22000019</td>
<td style="user-select: auto;">GS</td>
<td style="user-select: auto;">DR20100039</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-19 12:00:00.000000</td>
<td style="user-select: auto;">53</td>
<td style="user-select: auto;">PT22000020</td>
<td style="user-select: auto;">FM</td>
<td style="user-select: auto;">DR20010112</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-22 08:30:00.000000</td>
<td style="user-select: auto;">54</td>
<td style="user-select: auto;">PT22000021</td>
<td style="user-select: auto;">GS</td>
<td style="user-select: auto;">DR20100039</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-04 10:30:00.000000</td>
<td style="user-select: auto;">56</td>
<td style="user-select: auto;">PT22000023</td>
<td style="user-select: auto;">FM</td>
<td style="user-select: auto;">DR20090112</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-14 15:30:00.000000</td>
<td style="user-select: auto;">57</td>
<td style="user-select: auto;">PT22000074</td>
<td style="user-select: auto;">CS</td>
<td style="user-select: auto;">DR20200012</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-24 15:30:00.000000</td>
<td style="user-select: auto;">58</td>
<td style="user-select: auto;">PT22000085</td>
<td style="user-select: auto;">CS</td>
<td style="user-select: auto;">DR20200012</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2022-05-28 10:00:00.000000</td>
<td style="user-select: auto;">60</td>
<td style="user-select: auto;">PT22000092</td>
<td style="user-select: auto;">OS</td>
<td style="user-select: auto;">DR20100031</td>
<td style="user-select: auto;">N</td>
<td style="user-select: auto;">NULL</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">진료과코드</th>
<th style="user-select: auto;">5월예약건수</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">OB</td>
<td style="user-select: auto;">1</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">OS</td>
<td style="user-select: auto;">1</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">CS</td>
<td style="user-select: auto;">2</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">FM</td>
<td style="user-select: auto;">2</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">GS</td>
<td style="user-select: auto;">2</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges