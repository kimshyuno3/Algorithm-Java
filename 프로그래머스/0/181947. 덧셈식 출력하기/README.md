# [level 0] 덧셈식 출력하기 - 181947 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181947) 

### 성능 요약

메모리: 70.9 MB, 시간: 122.82 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 06월 20일 23:50:27

### 문제 설명

<p>두 정수 <code>a</code>, <code>b</code>가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.</p>
<div class="highlight"><pre class="codehilite"><code>a + b = c
</code></pre></div>
<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>a</code>, <code>b</code> ≤ 100</li>
</ul>

<hr>연산자 우선순위 오류 (a+b가 문자열로 결합됨):
Java에서 + 연산자는 왼쪽에서 오른쪽 방향으로 계산됩니다. a + "+" + b + "="까지 계산되면 이미 결과가 하나의 문자열이 됩니다. 그 상태에서 뒤에 + a + b를 해버리면, 덧셈 연산이 아니라 문자열 뒤에 글자를 이어 붙이는 행동이 됩니다. 그래서 4 + 5인 9가 아니라 "45"가 출력된 것입니다.

<h5>입출력 예</h5>

<p>입력 #1</p>
<div class="highlight"><pre class="codehilite"><code>4 5
</code></pre></div>
<p>출력 #1</p>
<div class="highlight"><pre class="codehilite"><code>4 + 5 = 9
</code></pre></div>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
