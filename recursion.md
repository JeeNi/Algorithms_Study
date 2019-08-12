*recusion 이란?
    *자기 자신을 호출하는 함수(순환, 재귀함수)

public class Code01 {
    public static void main(String[] args) {
        func();
    }

    public static void func() {
        System.out.println("Hello...");
        func();
    }
}
    // 무한 루프에 빠지게 된다
    // 그러지 않으려면?

public class Code02 {
    publc static void main(String[] args) {
        int n = 4;
        func(n);
    }
    
    public static void (int n) {
        if (n <= 0)
            return;         // 0 이하면 호출 하지 않고 종료 한다
        else {
            System.out.println("Hello...");
            func(n - 1);
        }
    }
}
    // 항상 무한  루프에 빠지는 것은 아니다
    // 적어도 하나의 recusion에 빠지지 않는 경우가 존재해야 되고,
    // recusion을 반복하다보면 결국 base case로 수령해야 된다

public class Code03 {
    publc static void main(String[] args) {
        int result = func(4);
        System.out.print(result);
    }
    
    public static void (int n) {
        if (n <= 0)
            return 0;        
        else {
            return n + func(n - 1);
        }
    }
}   
    // 10이 출력된다
    // func();에서 나온 값들이 return 되면서 나오는 값


*recursion의 해석
public static int func(int n) {
    // func 함수의 mission은 0~n 까지의 합을 구하는 것
    if (n == 0)
    // n = 0 이라면 합은 0이다
        return 0;
    else
        return n + func(n - 1);
    // n이 0보다 크다면 0에서 n까지의 합은
    // 0에서 n - 1 까지의 합에 n을 더한 것
}


*recursion의 대표적인 예
_Factorial: n!

0! = 1
n! = n x (n - 1)!   n > 0

_Xn승

x0승 = 1
Xn승 = x * xn-1승   if n > 0

public static double power(double x, int n) {
    if (n == 0)
        return 1;
    else
        return x * power(x, n - 1);
}

_Fibonacci Number

f0 = 0
f1 = 1
fn = fn-1 + fn-2    n > 1

public int fibonacci(int n) {
    if (n < 2)
        return n;
    else
        return fibonacci(n - 1) + fibonacci(n - 2);
}

_최대공야수: Euclid Method
public static double gcd(int m, int n) {
    if (m < n) {
        int tmp = m; m = n; n = tmp;    // swap m and n
    }
    if (m%n == 0)
        return n;
    else
        return gcd(n, m%n);
}
    m >= n인 두 양의 정수 m과 n에 대해서 m이 n의 배수이면
    gcd(m, n) = n이고, 그렇지 않으면 
    gcd(m, n) = gcd(n, m%n)이다.