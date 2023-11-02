# [level 2] 조건에 부합하는 중고거래 상태 조회하기 - 164672 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/164672?language=oracle) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > String， Date

### 채점결과

Empty

### 제출 일자

2023년 11월 4일 16:9:24

### 문제 설명

<p style="user-select: auto;">다음은 중고거래 게시판 정보를 담은 <code style="user-select: auto;">USED_GOODS_BOARD</code> 테이블입니다. <code style="user-select: auto;">USED_GOODS_BOARD</code> 테이블은 다음과 같으며 <code style="user-select: auto;">BOARD_ID</code>, <code style="user-select: auto;">WRITER_ID</code>, <code style="user-select: auto;">TITLE</code>, <code style="user-select: auto;">CONTENTS</code>, <code style="user-select: auto;">PRICE</code>, <code style="user-select: auto;">CREATED_DATE</code>, <code style="user-select: auto;">STATUS</code>, <code style="user-select: auto;">VIEWS</code>은 게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수를 의미합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">Column name</th>
<th style="user-select: auto;">Type</th>
<th style="user-select: auto;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">BOARD_ID</td>
<td style="user-select: auto;">VARCHAR(5)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">WRITER_ID</td>
<td style="user-select: auto;">VARCHAR(50)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">TITLE</td>
<td style="user-select: auto;">VARCHAR(100)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">CONTENTS</td>
<td style="user-select: auto;">VARCHAR(1000)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">PRICE</td>
<td style="user-select: auto;">NUMBER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">CREATED_DATE</td>
<td style="user-select: auto;">DATE</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">STATUS</td>
<td style="user-select: auto;">VARCHAR(10)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">VIEWS</td>
<td style="user-select: auto;">NUMBER</td>
<td style="user-select: auto;">FALSE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">문제</h5>

<p style="user-select: auto;"><code style="user-select: auto;">USED_GOODS_BOARD</code> 테이블에서 2022년 10월 5일에 등록된 중고거래 게시물의 게시글 ID, 작성자 ID, 게시글 제목, 가격, 거래상태를 조회하는 SQL문을 작성해주세요. 거래상태가 SALE 이면 판매중, RESERVED이면 예약중, DONE이면 거래완료 분류하여 출력해주시고, 결과는 게시글 ID를 기준으로 내림차순 정렬해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;"><code style="user-select: auto;">USED_GOODS_BOARD</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">BOARD_ID</th>
<th style="user-select: auto;">WRITER_ID</th>
<th style="user-select: auto;">TITLE</th>
<th style="user-select: auto;">CONTENTS</th>
<th style="user-select: auto;">PRICE</th>
<th style="user-select: auto;">CREATED_DATE</th>
<th style="user-select: auto;">STATUS</th>
<th style="user-select: auto;">VIEWS</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">B0007</td>
<td style="user-select: auto;">s2s2123</td>
<td style="user-select: auto;">커피글라인더</td>
<td style="user-select: auto;">새상품처럼 깨끗합니다.</td>
<td style="user-select: auto;">7000</td>
<td style="user-select: auto;">2022-10-04</td>
<td style="user-select: auto;">DONE</td>
<td style="user-select: auto;">210</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">B0008</td>
<td style="user-select: auto;">hong02</td>
<td style="user-select: auto;">자전거 판매합니다</td>
<td style="user-select: auto;">출퇴근용으로 구매했다가 사용하지 않아서 내놔요</td>
<td style="user-select: auto;">40000</td>
<td style="user-select: auto;">2022-10-04</td>
<td style="user-select: auto;">SALE</td>
<td style="user-select: auto;">301</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">B0009</td>
<td style="user-select: auto;">yawoong67</td>
<td style="user-select: auto;">선반 팝니다</td>
<td style="user-select: auto;">6단 선반. 환불 반품 안됩니다.</td>
<td style="user-select: auto;">12000</td>
<td style="user-select: auto;">2022-10-05</td>
<td style="user-select: auto;">DONE</td>
<td style="user-select: auto;">202</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">B0010</td>
<td style="user-select: auto;">keel1990</td>
<td style="user-select: auto;">철제선반5단</td>
<td style="user-select: auto;">철제선반 5단 조립식 팜</td>
<td style="user-select: auto;">10000</td>
<td style="user-select: auto;">2022-10-05</td>
<td style="user-select: auto;">SALE</td>
<td style="user-select: auto;">194</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">BOARD_ID</th>
<th style="user-select: auto;">WRITER_ID</th>
<th style="user-select: auto;">TITLE</th>
<th style="user-select: auto;">PRICE</th>
<th style="user-select: auto;">STATUS</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">B0010</td>
<td style="user-select: auto;">keel1990</td>
<td style="user-select: auto;">철제선반5단</td>
<td style="user-select: auto;">10000</td>
<td style="user-select: auto;">판매중</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">B0009</td>
<td style="user-select: auto;">yawoong67</td>
<td style="user-select: auto;">선반 팝니다</td>
<td style="user-select: auto;">12000</td>
<td style="user-select: auto;">거래완료</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges