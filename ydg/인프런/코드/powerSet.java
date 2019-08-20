package Inflearn;

public class powerSet {
	
	private static char data[] = {'a','b','c','d','e','f'};
	private static int n = data.length;
	private static boolean[] p = new boolean[n];
	
	
	public static void main(String[] args) {
		/*
		 * 멱집합 (PowerSet) : 모든 부분집합
		 * 
		 * 예) a,b,c,d 의 부분집합 = (1)b, c, d의 부분집합 + (2)b, c, d의 모든 부분집합에 a를 추가
		 *    (2)를 하려면 (2-1) c, d의 모든 부분집합에 a를 추가 + (2-2) c, d의 모든 부분집합에 a, b를 추가
		 *    (2-1)를 하려면 (2-1-1) d의 모든 부분집합에 a를 추가 + (2-2-2) c, d의 모든 부분집합에 a, c를 추가
		 * 
		 * BaseCase : 집합(S)가 비어있을 때 = 공집합
		 * RecursiveCase : ?!?!?
		 */
		
		/*
		 * powerSet(P, S)
		 *    P와 S --> S의 멱집합을 구한 후 각각에 P를 합집합하여 출력
		 *    
		 *    BaseCase : S가 공집합일 때
		 *    RecursiveCase : 1. S에서 원소 1개(t)를 꺼냄
		 *                    2. powerSet(P, S-{t})      --> S의 부분집합에서 t를 포함하지 않는 집합들
		 *                    3. powerSet(PU{t}, S-{t})  --> S의 부분집합에서 t를 포함하는 집합들
		 *                    맨위의 예에서 b, c, d = S, a = {t}
		 *                    
		 *   Tip : 집합 S를 표현하는 방법
		 *         집합 S는 k로 표현  --> k번째~ 끝까지 ( 집합S(b, c, d) = (a, b, c, d)에서 k = 2 ~ 끝까지 )
		 *         
		 *         집합 P를 표현하는 방법
		 *         집합 P는 k로 표현  --> 처음~ k-1번째 원소들 중 "일부"  --> a/ a, b / a, c  
		 *         일부를 표현하는 방법 : boolean 배열을 이용 (강의 23분 참고)
		 */
	}
	/*
	 * 상태공간트리(36분)
	 *  - p[], k = 트리상에서 현재 나의 위치를 표현
	 *  - if(k==n) = 내 위치가 끝노드(마지막노드)라면
	 *  - p[k] = false, powerSet(k+1);  = 왼쪽으로 내려감
	 *  - p[k] = true, powerSet(k+1);  = 오른쪽으로 내려감
	 */
	private static void powerSet(int k) {
		//BaseCase : S가 공집합. k가 n이면 공집합임을 확인하자(맨 끝)
		if(k==n) {
			for(int i=0; i<n; i++) {
				if(p[i]) System.out.println(data[i]+" ");
				System.out.println();return;
			}
		}
		p[k] = false;
		powerSet(k+1); //data[k]를 포함하지 않는 집합   ---> ReculsiveCase 2
		p[k] = true;
		powerSet(k+1); //data[k] 를 포함하는 집합       ---> ReculsiveCase 3
	}
	
}
