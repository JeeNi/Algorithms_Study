package programmers;

public class ProDP_7 {
	public static void main(String[] args) {
		//int K = 1650;
		//int[][] travel = {{500, 200, 200, 100}, {800, 370, 300, 120}, {700, 250, 300, 90}};
		int K = 3000;
		int[][] travel = {{1000,2000,300,700}, {1100,1900,400,900}, {900,1800,400,700}, {1200,2300,500,1200}};
		System.out.println(new Solution_ProDP_7().solution(K, travel));
	}
}
class Solution_ProDP_7{
	int[][] map ;
	int limitTime;
	int leng;
	int max = 0;
	
    public int solution(int K, int[][] travel) {
        
        leng = travel.length;
        map = travel;
        limitTime = K;
        
        //dp(0, 0, 0);
        
        return dp1();
    }
     public void dp(int time, int money, int index) {
    	
    	if(time > limitTime) return;
    	if(index > leng-1) {
    		max = max > money ? max : money;
    		return;
    	}
    	dp(time+map[index][0], money+map[index][1], index+1);
    	dp(time+map[index][2], money+map[index][3], index+1);
    	
    	
    }
    
    public int dp1() {
    	int[][] dp = new int[101][1000001];
    	
    	int result =0;
    	dp[0][map[0][0]] = map[0][1];
    	dp[0][map[0][2]] = map[0][3];
    	
    	for(int i=1; i<leng; i++) {
    		for(int j=0; j<=limitTime; j++) {
    			
    			if(dp[i-1][j] == 0) continue;
    			
    			if(j+map[i][0] <= limitTime) {
    				dp[i][j+map[i][0]] = Math.max(dp[i][j+map[i][0]], dp[i-1][j]+map[i][1]);
    				result = Math.max(result, dp[i][j+map[i][0]]);
    			}
    			
    			if(j+map[i][2] <= limitTime) {
    				dp[i][j+map[i][2]] = Math.max(dp[i][j+map[i][2]], dp[i-1][j]+map[i][3]);
    				result = Math.max(result, dp[i][j+map[i][2]]);
    			}
    			
    		}
    	}//for
    	
    	return result;
    	
    }

}