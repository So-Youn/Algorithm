# Greedy

> Greedy 알고리즘은 문제를 해결하는 과정에서 그 순간 순간마다 최선이라고 생각하는 방향으로 결정하는 방식의 알고리즘이다.
>
> 당장 눈 앞에 보이는 최적의 상황만을 쫓는 알고리즘
>
> 특정한 상황에 있어서는 최적의 해를 보장해준다.

* Greedy : 빠르다
* 무조건 큰 경우대로, 작은 경우대로 등등으로 극단적으로 문제에 접근한다는 점에서 **Sort**기법이 함께 사용되는 경우가 많다.



## 1

```markdown
한 저명한 학자에게 `n(0≤n≤10,000)개의 대학`에서 강연 요청을 해 왔다. 각 대학에서는 `d(1≤d≤10,000)일 안에 와서` 강연을 해 주면 `p(1≤p≤10,000)만큼의 강연료를 지불`하겠다고 알려왔다. 각 대학에서 제시하는 d와 p값은 서로 다를 수도 있다. 이 학자는 이를 바탕으로, **가장 많은 돈을 벌 수 있도록** 순회강연을 하려 한다. 강연의 특성상, 이 학자는 하루에 최대 한 곳에서만 강연을 할 수 있다.

예를 들어 네 대학에서 제시한 p값이 각각 50, 10, 20, 30이고, d값이 차례로 2, 1, 2, 1 이라고 하자. 이럴 때에는 첫째 날에 4번 대학에서 강연을 하고, 둘째 날에 1번 대학에서 강연을 하면 80만큼의 돈을 벌 수 있다.
```

1. 강의료인 P순으로 정렬한다.
2. 기한이 있는 배열을 순차적으로 탐색해서 그 기한에 아무것도 없으면 강의료를 더한다.
3. 기한에 강의가 있다면 -1해가며 1이 될 때까지 찾는다.



* Interface `Comparable`
  * 정렬 수행 시 기본적으로 적용되는 정렬 기준이 되는 메서드 정의
  * `package: java.lang.Comparable`
  * 정렬할 객체에 `Comparable`를 implements 후, **compareTo()** 메서드를 오버라이드하여 구현한다.
  * Boolean을 제외한 래퍼 클래스나 **String, Time, Date**와 같은 클래스의 인스턴스는 모두 정렬 가능

```java
class Lecture implements Comparable<Lecture> {
	int pay;
	int day;
	public Lecture(int pay, int day) {
		this.pay = pay;
		this.day = day;
	}

	@Override
	public int compareTo(Lecture target) {
		if(target.pay > this.pay) { // pay가 높은게 우선순위가 높다
			return 1;
		} else if(target.pay == this.pay) {
			if(target.day < this.day) { // 같은 pay면 day가 낮은게 우선순위가 높다.
				return 1;
			}
		}
		return -1;
	}
}
```



* **Priority Queue** : 가중치 큐
  * 먼저 들어간 데이터가 먼저 나오는 일반적인 큐와는 다르게 데이터를 꺼낼 때 우선순위가 가장 높은 데이터가 가장 먼저 나온다

```java
public class Greedy {
	static int n;
	static boolean[] checked;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		PriorityQueue<Lecture> pq = new PriorityQueue<>();
		int maxDay = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int pay = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			maxDay = Math.max(day, maxDay);
			pq.add(new Lecture(pay, day));
		}
		checked = new boolean[maxDay+1];
		int sum = 0;
		while(!pq.isEmpty()) {
			Lecture lecture = pq.poll();
			for(int i = lecture.day; i >= 1; i--) {
				if(!checked[i]) {
					checked[i] = true;
					sum += lecture.pay;
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
```

