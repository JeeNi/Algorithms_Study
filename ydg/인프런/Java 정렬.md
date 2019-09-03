# Java에서 정렬

## Primitive 


+ Arrays 클래스가 primitive 타입 데이터를 위한 정렬 메서드를 제공

  ```java
  int[] data = new int[capacity];
  
  //data[0]에서 data[capacity-1]까지 데이터가 꽉 차있는 경우에는 다음과 같이 정렬한다.
  Arrays.sort(data);
  
  //배열이 꽉차있지 않고 data[0]에서 data[size-1]까지 size개의 데이터만 있다면 다음과 같이 한다.
  Arrays.sort(data, 0, size);
  
  ```

+ int 이외의 다른 primitive 타입 데이터(double, char 등)에 대해서도 제공



### 문자열

```java
String[] f = new String[]{"p", "A", "O", "B"}
Arrays.sort(f);
for(String name : f) System.out.println(name);
```

primitive 타입 데이터와 마찬가지로 Arrays.sort 메서드로 정렬된다.



### ArrayList

```java
List<String> f = new ArrayList<String>();
f.add("P");
f.add("A");
f.add("O");
f.add("B");
Collections.sort(f);
for(String name : f) System.out.println(name);
```



## 사용자 정의 객체

### 한가지 객체(Comparable)

```java
public class F{
    public String name;
    public int quantity;
    public F(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
}

F[] f new F[4];
f[0] = new F("P", 70);
f[1] = new F("A", 100);
f[2] = new F("o", 80);
f[3] = new F("B", 90);

Arrays.sort(f);
```

위의 코드는 어떻게 될까?

크기관계가 정해지지 않았을 때는 정렬이란게 무의미하다. 따라서 아래와 같이 수정해준다.

```java
public class F implements Comparable<F>{
    public String name;
    public int quantity;
    public F(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    //여기에서 크기관계 정의
    public int compareTo(F other){
        //이름의 사전식 순서가 더 빠른 걸로 정렬
        return name.compareTo(other.name);
        //재고수량으로 정렬하기 위해서는 아래와 같이 한다.
        //return quantity - other.quantity;
    }
}

F[] f new F[4];
f[0] = new F("P", 70);
f[1] = new F("A", 100);
f[2] = new F("o", 80);
f[3] = new F("B", 90);

Arrays.sort(f);
```



### 두가지 객체(comparator)

Comparator interface를 extends하며 compare 메서드를 overriding하는 새로운 이름 없는 클래스를 정의한 후 그 클래스의 객체를 하나 생성한다.

```java
Comparator<F> nameC = new Comparator<F>(){
    public int compare(F f1, F f2){
        return f1.name.compareTo(f2.name);
    }
};

Comparator<F> quantC = new Comparator<F>(){
    public int compare(F f1, F f2){
        return f1.quantity - f2.quantity;
    }
};

Arrays.sort(f, nameC);
//or
Arrays.sort(f, quantC);
```

```java
public class F{
    public String name;
    public int quantity;
    public F(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    public static Comparator<F> nameC = new Comparator<F>(){
    public int compare(F f1, F f2){
        return f1.name.compareTo(f2.name);
    	}
    };

    public static Comparator<F> quantC = new Comparator<F>(){
        public int compare(F f1, F f2){
            return f1.quantity - f2.quantity;
        }
    };
}

//In main function
Arrays.sort(f, F.nameC);
```









