# Hash

내부적으로 배열을 사용하여 데이터를 저장하기 때문에 **빠른 검색 속도**를 갖는다.

* 특정 데이터가 저장되는 인덱스를 그 데이터만의 고유한 위치이기 때문에 삽입시 다른 데이터의 사이에 끼어들거나 삭제시 다른 데이터로 채울 필요가 없다.



## Set

> 중복을 허용하지 않고 저장 순서가 유지되지 않는다.
>
> `HashSet`, `TreeSet`

## Map

> **Key**, **Value** 를 하나의  쌍으로 묶어서 저장하는 컬렉션 클래스
>
> key는 중복될 수 없지만 value는 중복을 허용한다.
>
> `HashMap`

* `containsKey` : 지정된 Key와 일치하는 Map의 Key객체가 있는지 확인
* `containsValue`
* `entrySet` : Map에 저장되어 있는 key - value 쌍을  Map.Entry 타입의 객체로 저장한 Set으로 변환한다.
* `equals` : 동일한 Map인지 비교
* `get` : 지정한  Key 객체에 대응하는 value객체를 찾아 반환
* `HashCode` : 해시 코드를 반환한다. 
* `isEmpty` : Map이 비어있는지 확인한다.
* Set `KeySet` : Map에 저장된 모든 Key객체를 반환한다.
  * 중복을 허용하지 않기 때문에 Set타입
* `put(key,value)` : Map에 value객체를 key객체에 연결하여 저장
* `remove`
* `size`
* Collection `values()` : 저장된 모든 value객체를 반환한다.
  * Value는 중복을 허용하기 때문에 Collection타입

:bulb: Map인터페이스를 구현하는 클래스에서는 `Map.Entry `인터페이스도 구현해야 한다. 

```java
public interface Map{
    ...
        public static interface Entry{
        Object getKey();
        Object getValue();
        Object setValue(Object value);
        ....
    }
}
```

