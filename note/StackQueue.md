# Stack

> `후입선출(LIFO)`의 시멘틱을 따르는 자료 구조

```java
Stack<Integer> st = new Stack<Integer>();
```

* `peek()` : 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소 반환
* `pop()` : 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환하고, 해당 요소를 스택에서 제거함.
* `push(E item)`: 해당 스택의 제일 상단에 전달된 요소를 삽입함.
* int `search(Object o)` :  객체가 존재하는 위치의 인덱스를 반환
  * 제일 상단에 있는(제일 마지막으로 저장된) 요소의 위치부터 0이 아닌 1부터 시작함.

```java
//복잡하고 빠른 스택 구현 
Deque<Integer> st = new ArrayDeque<Integer>();
```



# Queue

> #### 인터페이스 형태로 제공
>
> 선형 메모리 공간에 데이터를 저장하는 선입선출 시멘틱 따르는 자료구조

```java
LinkedList<String> qu = new LinkedList<String>();
```

* add() : 해당 큐의 맨 뒤에 전달된 요소를 삽입함.
  * 삽입에 성공하면 true를 반환
* offer() : 해당 큐의 맨 뒤에 전달된 요소 삽입
* peek() : 해당 큐의 맨 앞에 있는 요소 반환
  * 비어있으면 null 반환
* poll() : 해당 큐의 맨 앞에있는 요소를 반환하고, 해당 요소를 큐에서 제거함
* element() : 해당 큐의 맨 앞에 있는 요소 반환

