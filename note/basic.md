# 알고리즘 ?

* 어떤 문제를 컴퓨터로 풀기 위한 효율적인 절차
* 문제를 푸는 **단계별 절차**를 명확하게 기술
* 알고리즘 문제를 이해하고 효율적으로 해결하는 방법 공부



* 어떤 문제의 모든 입력 사례에 대해 해답을 찾아주는 단계별 절차



## BubbleSort

> 버블정렬
>
> data[0] ~ data[i] 중에서 최대값을 `data[i]` 위치로 몰아가는 일

![image-20200906234540393](images/image-20200906234540393.png)

```java
		for(int i=n-1;i>0;i--) {
			//data[0] ... data[i]
			for(int j=0;j<i;j++) {
				if(data[j] > data[j+1]) {
					//swap
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
```

<img src="images/image-20200906234405809.png" alt="image-20200906234405809" style="zoom:67%;" />



## 개선된 정렬

```java
		for (int i=0; i<n;i++) {
			int tmp = kb.nextInt();
			//배열의 뒤에서부터 위치를 찾는다.(i개)
			
			int j = i-1;
			while(data[j] > tmp) {
				data[j+1] = data[j]; //한칸 뒤로 이동
				j--;
			}
			//현재 j위치일 때 data[j]가 tmp보다 작을 때 tmp위치는 data[j+1]이 된다.
			data[j+1] = tmp;
```

# 값에 의한 호출

> call by value
>
> `actual`과 `formal` parameter는 별개의 변수이다.

* 변수 선언 위치 : 함수(main) 내부 *-내부에서만 사용 가능* / 함수 외부

```markdown
호출문 : 
swap(data[j], data[j+1]);
`data[j], data[j+1]` : actual parameter

호출된 메서드:
public static void swap(int a, int b) {
    int tmp = a;
    a = b;
    b = tmp;
}
`a, b` : formal parameter
* 호출되었을 때 actual이 formal로 딱 한 번 값이 복사가 된다.
* 전혀 아무 관련이 없는 별개의 변수이다. 
* swap된건 a,b의 값이지 data[j], data[j+1]가 swap된 것이 아니다.
```





* 문자열 크기 비교

  * **compareTo**
  * 왼쪽이 크면 `>` 양수 반환 / 같으면 0,  작으면 음수 반환

  ```java
  if(name[j].compareTo(name[j+1]) > 0) {
      ..
  }
  ```

  * `compareToIgnoreCase` : 대소문자 없이 비교

