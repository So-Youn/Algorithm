# 문자열

<img src="images/image-20200908140248880.png" alt="image-20200908140248880" style="zoom:80%;" />

```markdown
* `==` :  `Integer` or `character` 비교
* character가 letter인지 확인하는 함수
!Character.isLetter(str.charAt(i))

그 외 `isDigit()`, `isLowerCase()` , `isSpace()`, `isWhitespace()`: 공백문자
* 단어를 모두 소문자로 변환 : `toLowerCase()`
```

* 배열 선언

  ```java
  		String[] names = new String[1000];
  		int[] numbers = new int[1000]; //정수형 배열
  ```

* 파일 읽기

  ```java
  Scanner inFile = new Scanner(new File(fileName));
  ```

* 파일 출력

  ```java
  PrintWriter pw = new PrintWriter(new FileWriter(fileName));
  ```

  

# 클래스

> 참조변수

* 클래스는 **하나의 변수 타입**이다. 마치 int, double처럼

* 사용자 정의 타입

  * 객체 생성

  ```java
  Person1 first = new Person1(); //Person1타입의  first변수 생성
  ```

  * 실제 데이터가 저장될 객체는 new명령으로 따로 만들고, 참조변수에는 그 객체의 주소를 지정 해준다.

## 클래스와 객체

> 배열은 프리미티브 타입이 아니다. (int O int[] X)
>
> *프리미티브 : 기본으로 제공해주는 타입*
>
> 배열의 각 원소가 프리미티브 타입인거지 배열 자체가 프리미티브 타입인 것은 아니다. 

```java
int[] numbers = new int[8]; //배열형 객체
//numbers : 주소를 정하는 참조 변수
Person1[] members = new Person1[8]; 
//members는 배열의 이름이므로 참조 변수이다.
```

