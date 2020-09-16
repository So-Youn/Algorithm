# [List](https://programmers.co.kr/learn/courses/17)

* 데이터 순서대로저장

* 중복허용
* 처음, 끝, 중간에 엘리먼트를 추가/삭제하는 기능
* 리스트의 모든 데이터에 접근할 수 있는 기능

* 기능 Array < List 

| Array                                                        | List                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 데이터가 저장된 index가 중요.<br /> index를 가지고 바로 찾을 수 있다. |                                                              |
| 기존의 데이터를 덮어쓴다.                                    | 기존의 데이터를 뒤로 한칸 물리고 빈 공간에 데이터를 추가한다. (유동적) |
| 데이터 순회하는 과정에서 데이터가 있는 지 없는 지를 체크해야 한다.<br />*데이터 삭제 시 빈 공간이 사라지지 않기 때문에 메모리를 낭비할 수도 있다.* | 순회 처리 시 데이터가 있는 지 없는 지 체크할 필요가 없다.<br />*데이터가 연속되어있고, 비어 있는 데이터가 없다.* |

## :bulb:LinkedList

* 데이터 추가/삭제가 빠르다
* `index` 로 값을 가져오기에는 속도가 느리다.
* 불연속적으로 존재하는 데이터를 서로 연결한 형태로 구성됨

```java
//링크드 리스트의 각 요소(node)들은 자신과 연결된 다음 요소에 대한 참조와 데이터로 구성되어 있다.
class Node{
    Node next;
    Object obj;
}
```



## :bulb:ArrayList

* **배열**로 구현한 리스트
  * 내부에서 배열을 이용하기 때문에 인덱스를 이용해서 데이터에 접근한다.

* 데이터 추가/삭제가 느리다
* `index`를 안다면 빠르게 가져올 수 있다.
  * 데이터를 조회할 때 빠르다.

> 데이터를 빈번히 조회한다면 `ArrayList`가, 데이터의 추가/삭제가 빈번하다면 `LinkedList`가 훨씬 효과적 !!

```java
//java.util.ArrayList
ArrayList<Integer> numbers = new ArrayList<>();
```

* **Iterator** : ArrayList를 탐색할 때는 Iterator를 쓴다. (반복 기법)
  * `Iterator` 객체를 쓰면 numbers 객체에 저장된 값을 하나씩 순회 가능
  * `it.next()` 메소드는 호출될 때마다 엘리먼트를 순서대로 리턴

```java
Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			//순회
			int value = it.next();
			//System.out.println(value);
			if(value == 30) it.remove();
		}
```

```java
private int size = 0;
//Object를 담는 배열 elementData
private Object[] elementData = new Object[100];
```

```java
//원소 갯수 무한정
public void resize(){
    if(elementData.length == size){
        Object[] newArray = new Object[size+100];
        for(int i=0;i<size-1;i++){
            newArray[i] = elementData[i];
        }
        elementData = newArray; //배열의 크기 정보 연동
    }
}
```



## 언어별 비교

| 언어       | 리스트            | 배열                    |
| ---------- | ----------------- | ----------------------- |
| C          | **X**             | O                       |
| JavaScript | -                 | O  `splice` *List 포함* |
| Python     | O   `List가 배열` | X                       |
| Java       | O                 | O                       |

```javascript
//javascript
numbers = [10, 20, 30, 40, 50];
//인덱스 3의 값을 제거
numbers.splice(3,1);
for(i = 0; i < numbers.length; i++){
    console.log(numbers[i]);
}
```

```python
# python
numbers = [10, 20, 30, 40, 50];
numbers.pop(3);
for number in numbers:
    print(number);
```

```java
//java 배열
int[] numbers = {0,1,2,3,4,5};
```

```java
//java List
ArrayList numbers = new ArrayList();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
numbers.remove(3);
System.out.println(numbers);
```

