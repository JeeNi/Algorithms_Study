package Inflearn;

public class countCell {
	
	public static final int IMG_COLOR = 1;
	public static final int ALREADY_COLOR = 2;
	private static int N = 8;
	private static int [][] map = {
			{1,0,0,0,0,0,0,1},
			{0,1,1,0,0,1,0,0},
			{1,1,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{1,0,0,0,1,0,0,1},
			{0,1,1,0,0,1,1,1} 
	};
	
	public static void main(String[] args) {
		/*
		 * 문제 : 현재 픽셀이 속한 blob의 크기를 카운트
		 * 
		 * 현재 픽셀이 img color가 아니라면 : 0을 반환
		 * 현재 픽셀이 img color라면        
		 *    현재 픽셀을 카운트
		 *    현재 픽셀을 다른 색으로 칠하기
		 *    현재 픽셀의 이웃한 픽셀에 대해 "그 픽셀이 속한 blob의 크기를 구해 count를 더해준다"
		 *    
		 * BaseCase : 1. 픽셀이 n 보다 크거나 0 보다 작을 때
		 *            2. 이미 다른 색으로 칠해져 있을 때
		 * RecursiveCase : 빨간색으로 색칠할 수 있을 때
		 *                 자신의 위치를 빨간색으로 색칠하고
		 *                 인접한 blob의 카운트에 1을 더해준다
		 * 
		 * 
		 */
		
		int cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(countCell(i, j) != 0) {
					++cnt;
				}
			}
		}
		System.out.println(cnt);
		
	}
	
	public static int countCell(int x, int y) {
		if(x < 0 || x >=N || y < 0 || y >= N) {
			return 0;
		}else if(map[x][y] != IMG_COLOR) {
			return 0;
		}else {
			map[x][y] = ALREADY_COLOR;
			return 1 + countCell(x-1, y+1) + countCell(x, y+1) + countCell(x+1, y+1)
			       + countCell(x-1, y) + countCell(x+1, y)
			       + countCell(x-1, y-1) + countCell(x, y-1) + countCell(x+1, y-1);
		}
	}
}
