package Inflearn;

public class queens {
	
	private static final int N = 8;
	private static int[] cols = new int[N+1]; // cols[1] = 1번말이 놓인 열번호
	
	public static void main(String[] args) {
		
		/*
		 * N-QUEENS
		 * Back Tracking 기법
		 * 
		 * 상태공간 트리 : 찾는 해를 포함하는 트리
		 *                 즉, 해가 존재한다면 그것은 반다시 이 트리의 어떤 한 노드에 해당함
		 *                 따라서 이 트리를 체계적으로 탐색하면 해를 구할 수 있음
		 *                 ** 모든 노드를 탐색해야 하는 것은 아님!!**
		 * 
		 * Back Tracking : 상태공간 트리를 깊이우선방식(DFS)으로 탐색하여 해를 찾는 알고리즘을 말함
		 *                 알고리즘 구현 방식 1. Recursion 2. Stack
		 */
		
		/*
		 * BaseCase : 더 이상 살펴볼 필요가 없는 노드(non-promising, 꽝)
		 *            노드가 목표에 도착했을 때 (success)
		 * RecursiveCase : 도착한 노드가 꽝도 아니고 답도 아닐 때
		 * 
		 * 고민 1. 매개변수
		 *         BaseCase나 RecursiveCase에서 도착한 노드의 상태를 파악해야 함
		 *         이럴 때 매개변수를 이용하여 판단하자. (int level)
		 *         또한 매개변수가 너무 많으면 오히려 혼돈을 야기하기 때문에 "전역변수"도 사용하자
		 * 고민 2. return type
		 */
		queens(0);
	}
	
	private static boolean queens(int level) {
		/* 
		 * BaseCase
		 *    더 이상 살펴볼 필요가 없는 노드(non-promising, 꽝) : if(!promising(level)) return false;
		 *                                                         Promising Test : 말을 놓을 때 규칙에 어긋나는지 확인(충돌 확인)
		 *                                                                          1 ~ level-1까지는 Promising Test를 통과했기 때문에 충돌이 없음을 보장
		 *                                                                          따라서 1~leve-1과 level만 충돌여부 확인
		 *                                                                             1. 같은 열에 있는지 확인 
		 *                                                                             2.같은 대각선에 놓였는지 확인
		 *    노드가 목표에 도착했을 때 (success) : if(level == N ) return true;     ---> level의 의미는 현재까지 놓은 말의 개수
		 * RecursiveCase
		 *    도착한 노드가 꽝도 아니고 답도 아닐 때 : 
		 *    	for(int i=1; i<=N; i++) {
		 *         cols[level+1] = i;
		 *         if(quees(level+1)) return true;
		 *      }
		 *      return false;
		 */
		//BaseCase
		if(promising(level) == false) return false;
		else if(level == N) {
			for(int i=1; i<=N; i++) System.out.println(i + "= "+ cols[i]);
			return true;
		}
		//RecursiveCase
		for(int i=1; i<=N; i++) {
			cols[level+1] = i;
			if(queens(level+1)) return true;
		}
		return false;
		
	}
	
	//충돌확인
	private static boolean promising(int level) {
		for(int i=1; i<level; i++) {
			//대각선
			if(level-i == Math.abs(cols[level] - cols[i])) {
				return false;
			}
			//열
			else if(cols[i] == cols[level]){
				return false;
			}
		}
		return true;
	}
	
}
