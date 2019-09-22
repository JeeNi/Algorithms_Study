package programmers;

public class ProDP_5 {
	public static void main(String[] args) {
		int[] left = {3,2,5};
		int[] right = {2,4,1};
		System.out.println(new Solution_ProDP_5().solution(left, right));
	}
}
class Solution_ProDP_5{
	int[][] dp ;
	int[] l ;
	int[] r;
	int N;
	public int solution(int[] left, int[] right) {
        int answer = 0;
        
        N = left.length;
        l=new int[N];
        r=new int[N];
        dp=new int[N][N];
        
        
        for(int i=0; i<dp.length; i++)
        	for(int j=0; j<dp[i].length; j++)
        		dp[i][j] = -1;
        for(int i=0; i<l.length; i++) l[i] = left[i];
        for(int i=0; i<r.length; i++) r[i] = right[i];
        
        answer = recursive(0,0);
        
        return answer;
    }
	
	public int recursive(int x, int y) {
		
		if(x == N || y == N) return 0;
		
		if(dp[x][y] != -1)
			return dp[x][y];
		
		//왼쪽 or 둘다
		dp[x][y] = Math.max(recursive(x+1, y), recursive(x+1, y+1));
		
		//오른쪽
		if(l[x]>r[y]) dp[x][y] = Math.max(dp[x][y], recursive(x, y+1)+r[y]);
		
		return dp[x][y];
	}
}
