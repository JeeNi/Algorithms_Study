package programmers;

public class ProDP_4 {
	public static void main(String[] args) {
		int m=4, n=3;
		int[][] puddles = {{2,2},{1,2}};
		System.out.println(new Solution_ProDP_4().solution(m, n, puddles));
	}
}
class Solution_ProDP_4{
	int answer;
	int mPos ;
	int nPos ;
	int[][] dp = new int[101][101];
	public int solution(int m, int n, int[][] puddles) {
        answer = 0;
        mPos = m;
        nPos = n; 
        for (int[] p : puddles) 
        	dp[p[0]][p[1]] = -1;
        
        dp();
        
        return answer;
    }
	//정답!
	public void dp() {
		dp[1][1] = 1;
		for(int i=1; i<=mPos; i++) {
			for(int j=1; j<=nPos; j++) {
				
				if(dp[i][j] == -1) dp[i][j] = 0;
				else {					
					if(i ==1 ) {
						dp[i][j] += dp[i][j-1];
					}else {
						dp[i][j] = ( dp[i-1][j]+dp[i][j-1] ) % 1000000007;
					}
				}	
			}//for j
		}//for i
		answer = dp[mPos][nPos] ;
	}
	
	
	//문제는 맞았지만 효율성 0점!
	public void recursive(int x, int y) {
		
		if(x > mPos || x < 1 || y > nPos || y < 1)  return;
		if(x == mPos && y == nPos) {
			answer++;
			return;
		}
		if(dp[x+1][y]!=-1) 
			recursive(x+1, y);
		if(dp[x][y+1]!=-1)
			recursive(x, y+1);
	}
	
}