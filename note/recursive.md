# recursive

* 재귀 호출이 너무 반복적으로 되면(깊어지면), Stack Over Flow 출력
  * 재귀 함수는 함수를 반복적으로 호출하는 만큼 메모리에 스택이 되기 때문에 결국 메모리를 엄청 차지한다.
* 재귀 함수가 끝나는 지점을 정확하게 구현해야 한다.

```java
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = recursive(n);
		System.out.println(result);
		sc.close();
	}

	private static int recursive(int n) {
		if (n <= 1) return 1; // 종료
		else return n * recursive(n - 1);
	}

}
```

* 반복문 사용

  * 재귀 함수를 호출하지 않아서 메모리 초과를 방지할 수 있다.

  ```java
  public class factorial03 {
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  
  		int sum = 1;
  		//n이 0이 아닐대까지 1씩 감소하면서 sum에 반복적으로 곱해준다
  		while(n!=0) {
  			sum = sum * n;
  			n--;
  		}
  		System.out.println(sum);
  		sc.close();
  	}
  
  }
  ```

  

* 피보나치

  ```java
  public class Fibonacci {
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  		sc.close();
  		
  		System.out.println(fibonacci(n));
  	}
  
  	private static int fibonacci(int n) {
  		if(n<=1) return n;
  		else return fibonacci(n-1) + fibonacci(n-2);
  	}
  
  }
  ```

  