# [level 0] 문자열 섞기 - 181942 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181942) 

### 성능 요약

메모리: 80.7 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 06월 21일 00:10:36

### 문제 설명

<p>길이가 같은 두 문자열 <code>str1</code>과 <code>str2</code>가 주어집니다.</p>

<p>두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>str1</code>의 길이 = <code>str2</code>의 길이 ≤ 10

<ul>
<li><code>str1</code>과 <code>str2</code>는 알파벳 소문자로 이루어진 문자열입니다.</li>
</ul></li>
</ul>

<hr>String "": 문자열을 더할 때마다 메모리에 새로운 문자열을 계속 만들어냄 ➡️ 느리고 메모리 낭비 심함. StringBuilder: 하나의 바구니에 문자열을 계속 이어 붙임 ➡️ 빠르고 효율적임. solution 함수의 반환 타입은 String으로 지정되어 있습니다. 하지만 현재 코드는 값을 반환(return)하지 않고 콘솔에 출력(System.out.print)만 한 채 종료되고 있습니다.

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>str1</th>
<th>str2</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"aaaaa"</td>
<td>"bbbbb"</td>
<td>"ababababab"</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
