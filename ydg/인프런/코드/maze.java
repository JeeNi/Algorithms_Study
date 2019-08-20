package Inflearn;

//미로찾기
public class maze {
	
	/*
	 * 출구까지 나가는 법
	 *  >>> 현재 위치가 출구 or 이웃한 셀들 중 하나에서 현재 위치를 지나지 않고 출구까지 가는 경로가 있음
	 *  
	 *  1. BaseCase / RecursiveCase 생각
	 *      if (x,y)가 출구면 return true ----------------------------------- 1 : BaseCase
	 *      for : 아니면 각각 이웃한셀(x', y')에----------------------------- 2
	 *         if : 대해 갈 수 있으면---------------------------------------- 3
	 *              if :이웃한 셀이 출구면(x', y') return true--------------- 4 : RecursiveCase
	 *      아니면 return false; -------------------------------------------- 5 : BaseCase
	 *
	 *
	 *      if : 방문 or 벽이면 return false--------------------------------- 3 : BaseCase
	 *      if (x,y)가 출구면 return true ----------------------------------- 1 : BaseCase
	 *      for : 아니면 각각 이웃한셀(x', y')에----------------------------- 2
	 *              if :이웃한 셀이 출구면(x', y') return true--------------- 4 : RecursiveCase
	 *      아니면 return false; -------------------------------------------- 5 : BaseCase
	 *  
	 *  2. 무한루프에 빠지지 않게
	 *     : (x', y') 에서 다시 (x, y)로 오지 않게
	 */
	
	private static int N = 8;
	private static int [][] map = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0} 
	};
	
	private static final int PATHWAY = 0; //갈 수 있는 길
	private static final int WALL = 1;    //벽
	private static final int BLOCKED = 2; //방문한 길
	private static final int PATH = 3;    //지나온 길
	
	
	public static void main(String[] args) {
		System.out.println(findPath(0, 0));
	}
	
	private static boolean findPath(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= N) {
			return false;
		}
		else if(map[x][y] != PATHWAY) {
			return false;
		}else if(x == N-1 && y == N-1){
			map[x][y] = PATH;
			return true; 
		}else {
			map[x][y] = PATH;
			if(findPath(x-1, y) || findPath(x, y+1) || findPath(x+1, y) || findPath(x, y-1) ) {
				return true;
			}
			map[x][y] =BLOCKED;
			return false;
		}
	}

}
